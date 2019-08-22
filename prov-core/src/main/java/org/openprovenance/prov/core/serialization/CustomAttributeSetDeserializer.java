package org.openprovenance.prov.core.serialization;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.openprovenance.prov.core.ProvFactory;
import org.openprovenance.prov.model.Attribute;
import org.openprovenance.prov.model.Namespace;
import org.openprovenance.prov.model.QualifiedName;

import java.io.IOException;
import java.util.*;

import static org.openprovenance.prov.core.serialization.CustomKeyDeserializer.PROV_ATTRIBUTE_CONTEXT_KEY;

public class CustomAttributeSetDeserializer extends StdDeserializer<Set> {

static public Namespace theNS;

    private final Namespace ns;
    ProvFactory pf=new ProvFactory();




    public CustomAttributeSetDeserializer(JavaType vc) {
        super(vc);
        Namespace ns=new Namespace();
        ns.addKnownNamespaces();
        ns.register("ex", "http://example.org/");
        ns.register("ex2", "http://example2.org/");
        this.ns=ns;
        theNS=ns;

    }

    @Override
    public Set deserialize(JsonParser jp, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = jp.getCodec().readTree(jp);

        QualifiedName context=(QualifiedName)deserializationContext.getAttribute(PROV_ATTRIBUTE_CONTEXT_KEY);

        System.out.println("--> Found context " + context);


        Iterator<JsonNode> elements=node.elements();
        Set<Attribute> set=new HashSet<>();
        while (elements.hasNext()) {
            JsonNode next=elements.next();
            Attribute attr=new CustomAttributeDeserializer().deserialize(context,next,deserializationContext);
            System.out.println("--> Created Attr " + attr);


            set.add(attr);
        }

        System.out.println(set);

        return set;


    }
}