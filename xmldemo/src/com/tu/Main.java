package com.tu;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<string xmlns=\"http://Golden.com/Golden/\"><OUTPUT><RESULT>OK</RESULT></OUTPUT></string>";

        try {
            JAXBContext context = JAXBContext.newInstance(com.tu.PSBCQAisinoResult.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            com.tu.PSBCQAisinoResult result = (com.tu.PSBCQAisinoResult) unmarshaller.unmarshal(reader);

            System.out.println(String.format("result: %s", null != result ? result.toString() : "null"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
