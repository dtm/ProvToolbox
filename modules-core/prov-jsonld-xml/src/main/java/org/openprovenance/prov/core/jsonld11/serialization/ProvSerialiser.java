package org.openprovenance.prov.core.jsonld11.serialization;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import org.openprovenance.prov.interop.InteropMediaType;
import org.openprovenance.prov.vanilla.QualifiedName;
import org.openprovenance.prov.model.Document;
import org.openprovenance.prov.model.Namespace;
import org.openprovenance.prov.model.StatementOrBundle;
import org.openprovenance.prov.model.exception.UncheckedException;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Set;

public class ProvSerialiser extends org.openprovenance.prov.core.json.serialization.ProvSerialiser {

    final static private Collection<String> myMedia= Set.of(InteropMediaType.MEDIA_APPLICATION_JSONLD);

    @Override
    public Collection<String> mediaTypes() {
        return myMedia;
    }

    protected final boolean embedContext;

    public ProvSerialiser () {
        embedContext=true;
    }

    public ProvSerialiser (boolean embedContext) {
        this.embedContext=embedContext;
    }

    public ProvMixin provMixin() {
        return new ProvMixin();
    }



    @Override
    public void serialiseDocument(OutputStream out, Document document, boolean formatted) {
        ObjectMapper mapper = new ObjectMapper();
        if (formatted) mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module =
                new SimpleModule("CustomKindSerializer",
                        new Version(1, 0, 0, null, null, null));

        module.addSerializer(StatementOrBundle.Kind.class, new CustomKindSerializer());
        module.addSerializer(QualifiedName.class, new CustomQualifiedNameSerializer());
        module.addSerializer(XMLGregorianCalendar.class, new CustomDateSerializer());
        module.addSerializer(Namespace.class, new CustomNamespaceSerializer(embedContext));
        mapper.registerModule(module);

        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("nsFilter",
                SimpleBeanPropertyFilter.filterOutAllExcept("prefixes", "defaultNamespace"));
        mapper.setFilterProvider(filterProvider);

        provMixin().addProvMixin(mapper);


        try {
            mapper.writeValue(out,document);
        } catch (IOException e) {
            e.printStackTrace();
            throw new UncheckedException(e);
        }
    }

    @Override
    public void serialiseDocument(OutputStream out, Document document, String mediaType, boolean formatted) {
        serialiseDocument(out, document, formatted);
    }



}
