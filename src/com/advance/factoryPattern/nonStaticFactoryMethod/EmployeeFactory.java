package com.advance.factoryPattern.nonStaticFactoryMethod;

/**
 * Created by svmga on 02-Apr-17.
 */
public class EmployeeFactory {

    public  Employee getEmployee(String type) {

        if (type.equals("manager") || type.equals("developer") || type.equals("tester")) {
            Employee employee = new Employee();
            employee.setId(-1);
            employee.setFirstName("dummy");
            employee.setLastName("dummy");
            employee.setType(type);
            return employee;
        } else {
            return null;
        }
    }
}
