/*
 * Copyright (c) 1997, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

import java.io.*;

import jakarta.xml.bind.*;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import static javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI;

import org.xml.sax.SAXException;

// import java content classes generated by binding compiler
import primer.myPo.*;

/*
 * $Id: Main.java,v 1.1 2007-12-05 00:49:48 kohsuke Exp $
 */
public class Main {
    
    // This sample application demonstrates how to modify a java content
    // tree and marshal it back to a xml data. This example demonstrates
    // customiation within the schema file, po.xsd, and the impact that these 
    // customizations have on the schema derived Java representation.
    
/*
      XML --> Unmarshal -->Serialize
       |                        |
       ?=                       |
       |                        v
      XML <-- Marshal <--Deserialize
*/

    public static void main( String[] args ) {
        final String INPUT_XML_FILE="poInput.xml";
	final String SERIALIZE_FILE="po.ser";
        final String DESERIALIZED_XML="poMarshalled.xml";
        SchemaFactory sf = SchemaFactory.newInstance(W3C_XML_SCHEMA_NS_URI);

        try {
            Schema schema = sf.newSchema(new File("po.xsd"));
            JAXBContext jc = JAXBContext.newInstance("primer.myPo");
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            unmarshaller.setSchema(schema);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setSchema(schema);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT ,
                   new Boolean(true));
            System.out.println( "unmarshalling from \"" + INPUT_XML_FILE + "\"..." );
            Object po = unmarshaller.unmarshal(new File(INPUT_XML_FILE));
            PurchaseOrderType pot = (PurchaseOrderType)((JAXBElement)po).getValue();
	    System.out.println("Demo superclass override of toString() method for all schema-derived JAXB classes purchaseOrderType.toString()=" + pot.toString());

            System.out.println( "serializing content tree to \"" + SERIALIZE_FILE + "\"..." );
            FileOutputStream out = new FileOutputStream(SERIALIZE_FILE);
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(po);
            objOut.flush();
	    out.close();

            System.out.println( "deserializing content tree from \"" + SERIALIZE_FILE + "\"..." );
            FileInputStream in = new FileInputStream(SERIALIZE_FILE);
            ObjectInputStream objIn = new ObjectInputStream(in);
            po=objIn.readObject();

            System.out.println( "marshalling to \"" + DESERIALIZED_XML + "\"..." );
            FileOutputStream mout = 
		new FileOutputStream(DESERIALIZED_XML);
            marshaller.marshal(po, mout);
	    in.close();
	    mout.close();

            System.out.println( "test complete." );
        } catch( JAXBException je ) {
            je.printStackTrace();
        } catch( SAXException se ) {
            se.printStackTrace();
        } catch( IOException ioe ) {
            ioe.printStackTrace();
        } catch ( ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}

