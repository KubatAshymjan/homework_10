package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("kubat",Person.class);
        System.out.println("kubat: "+ person);

        Person person1 = context.getBean("adilet",Person.class);
        System.out.println("\nadilet: " + person1);
        context.close();
    }
}
