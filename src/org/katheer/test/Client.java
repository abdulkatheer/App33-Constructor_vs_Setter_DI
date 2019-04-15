package org.katheer.test;

import org.katheer.bean.Student;

public class Client {
    public static void main(String[] args) {
        //1. Constructor makes object immutable. If we want to change or update existing value, we've create a new object
        //Setter makes object mutable. We can update values at any point of time.
        Student std1 = new Student("S101", "Katheer", "Dindigul");
        Student std2 = new Student();
        std2.setSid("S102");
        std2.setSname("Abdul");
        std2.setSadd("Madurai");
        //updation
        std2.setSname("Dhanalakshmi");

        //2. Constructor DI makes bean less readable. We don't know which value will be set to which property
        //Setter DI increases readability by showing the property name in the method name itself

        //3. Constructor DI needs all the resources ready before creation
        //Setter DI is possible even if some values are not available. Default values will be set.
        //Student std3 = new Student("Abdul");
        Student std4 = new Student();
        std4.setSname("Abdul");

        //4. If both constructor DI and Setter DI is used in a bean, values set by Constructor DI
        // will be overridden by the values set by Setter DI
        Student std5 = new Student("S103", "Vinoth", "Dindigul");
        std5.setSadd("Chennai");

        //5. Circular dependency issue will raise only in the case of constructor DI, not in setter DI.

        //6. Constructor DI is recommended only if a bean has large no of properties.
        //Setter DI is recommended for small no of properties.
    }
}
