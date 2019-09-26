package org.openprovenance.prov.core.jsonld11.serialization;


import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import org.openprovenance.prov.model.exception.UncheckedException;
import org.openprovenance.prov.vanilla.Document;
import org.openprovenance.prov.model.Namespace;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProvDeserialiser extends org.openprovenance.prov.core.json.serialization.ProvDeserialiser {


    public ProvMixin provMixin() {
        return new ProvMixin();
    }

    public org.openprovenance.prov.model.Document deserialiseDocument (InputStream in)  {
        ObjectMapper mapper = new ObjectMapper();

        SimpleModule module =
                new SimpleModule("CustomKindSerializer", new Version(1, 0, 0, null, null, null));

        //   module.addDeserializer(org.openprovenance.prov.model.QualifiedName.class, new CustomQualifiedNameDeserializer());
        module.addDeserializer(org.openprovenance.prov.model.StatementOrBundle.Kind.class, new CustomKindDeserializer());

        // module.addDeserializer(Type.class, new CustomTypeDeserializer());
        // module.addDeserializer(Location.class, new CustomLocationDeserializer());
        // module.addDeserializer(Other.class, new CustomOtherDeserializer());


        TypeFactory typeFactory = mapper.getTypeFactory();
        CollectionType setType = typeFactory.constructCollectionType(Set.class, org.openprovenance.prov.model.Attribute.class);
        JavaType qnType = mapper.getTypeFactory().constructType(org.openprovenance.prov.model.QualifiedName.class);
        MapType mapType = typeFactory.constructMapType(HashMap.class, qnType, setType);
        module.addDeserializer(Map.class,new CustomAttributeMapDeserializer(mapType));
        //module.addDeserializer(Namespace.class, new CustomNamespaceDeserializer(Namespace.class));


        // CollectionType listType = typeFactory.constructCollectionType(List.class, qnType);


        MapType mapType2 = typeFactory.constructMapType(HashMap.class, String.class, Object.class);
        ArrayType arrayType=typeFactory.constructArrayType(mapType2);
        module.addDeserializer(Namespace.class, new CustomNamespaceDeserializer(arrayType));


        //CollectionType setType2 = typeFactory.constructCollectionType(Set.class, org.openprovenance.prov.core.vanilla.TypedValue.class);

        module.addDeserializer(Set.class,new CustomAttributeSetDeserializer(setType));

        provMixin().addProvMixin(mapper);


        mapper.registerModule(module);

        try {
            return mapper.readValue(in, Document.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new UncheckedException(e);
        }

    }

}
