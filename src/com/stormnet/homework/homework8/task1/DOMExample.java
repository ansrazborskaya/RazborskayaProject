package com.stormnet.homework.homework8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMExample {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("employees.xml"));

        NodeList employeeEl = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < employeeEl.getLength(); i++) {
            Node employee = employeeEl.item(i);
            NamedNodeMap atr = employee.getAttributes();
            employees.add(new Employee(atr.getNamedItem("surname").getNodeValue(), atr.getNamedItem("name").getNodeValue(), atr.getNamedItem("patronymic").getNodeValue(),
                    atr.getNamedItem("position").getNodeValue(), atr.getNamedItem("department").getNodeValue(), atr.getNamedItem("workExperience").getNodeValue()));
        }

        for (Employee employee : employees) {
            System.out.println(String.format("Surname: %s;\nName: %s;\nPatronymic: %s;\nPosition: %s;\nDepartment: %s;\nWork Experience: %s;\n", employee.getSurname(),
                    employee.getName(), employee.getPatronymic(), employee.getPosition(), employee.getDepartment(), employee.getWorkExperience()));
        }

        printEmployee("Petrov", "Ihar");
    }

    private static void printEmployee(String surname, String name) {

        boolean found = false;
        for (Employee employee : employees) {

            if (employee.getSurname().equals(surname) && employee.getName().equals(name)) {
                System.out.println(String.format("Surname: %s;\nName: %s;\nPosition: %s;\nDepartment: %s;\nWork Experience: %s;\n",
                        employee.getSurname(), employee.getName(), employee.getPosition(), employee.getDepartment(), employee.getWorkExperience()));
                found = true;
            }
        }
        if (!found) {
            System.out.println("\n" +
                    "No employee found");
        }
    }
}
