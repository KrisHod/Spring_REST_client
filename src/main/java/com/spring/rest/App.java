package com.spring.rest;

import com.spring.rest.configuration.MyConfig;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployeeById(2);
//        System.out.println(empById);

//        Employee employee = new Employee("Svetlana", "Kukushkina", "IT", 9000);
//        employee.setId(8);
//        communication.saveEmployee(employee);

        communication.deleteEmployeeById(8);

    }
}
