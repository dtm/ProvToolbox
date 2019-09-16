package org.openprovenance.prov.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** A low-level interface for JAXB-compatible serialization of documents. 
 */
public interface ProvDeserialiser {

    /**
     * Deerializes a document from a stream
     * @param in an {@link InputStream}
     * @return org.openprovenance.prov.model.Document
     * @throws IOException
     */

    public org.openprovenance.prov.model.Document deserialiseDocument (InputStream in) throws IOException;

}
