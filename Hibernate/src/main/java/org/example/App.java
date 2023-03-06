package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Configuration configuration=new Configuration();
        configuration.configure(new File("Hibernate/src/main/java/hibernate.cfg.xml"));

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println("Session Factory = "+sessionFactory);
    }
}
