//package com.javarush.task.task33.task3309;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlType;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.transform.OutputKeys;
//import javax.xml.transform.Transformer;
//import javax.xml.transform.TransformerFactory;
//import javax.xml.transform.dom.DOMSource;
//import javax.xml.transform.stream.StreamResult;
//import java.io.ByteArrayInputStream;
//import java.io.StringWriter;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.List;
//
///*
//Комментарий внутри xml
//*/
//
//public class Solution {
//    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(obj.getClass());
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//        StringWriter stringWriter = new StringWriter();
//        marshaller.marshal(obj, stringWriter);
//        String xml = stringWriter.toString();
//        comment = "<!--"+comment+"-->";
//        tagName = "<"+tagName+">";
//
//        String[] parts = xml.split(tagName);
//        xml = parts[0];
//        for (int i = 1; i < parts.length; i++) {
//            xml+=comment+"\n"+tagName + parts[i];
//        }
//        return xml;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
