package com.stormnet.homework.homework8.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class SAXExample {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("employees.xml"), handler);

        for (Employee employee : employees) {
            System.out.println(String.format("Surname: %s;\nName: %s;\nPatronymic: %s;\nPosition: %s;\nDepartment: %s;\nWork Experience: %s;\n", employee.getSurname(),
                    employee.getName(), employee.getPatronymic(), employee.getPosition(), employee.getDepartment(), employee.getWorkExperience()));
        }
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("employee")) {
                String surname = attributes.getValue("surname");
                String name = attributes.getValue("name");
                String patronymic = attributes.getValue("patronymic");
                String position = attributes.getValue("position");
                String department = attributes.getValue("department");
                String workExperience = attributes.getValue("workExperience");
                employees.add(new Employee(surname, name, patronymic, position, department, workExperience));
            }
        }
    }
}
