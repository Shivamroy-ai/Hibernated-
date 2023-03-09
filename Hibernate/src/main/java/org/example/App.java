package org.example;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Student rahul=new Student();
        rahul.setId(1l);rahul.setStudentName("Rahul Tyagy"); rahul.setRollNo(202394030l);
        session.save(rahul);
        transaction.commit();
        session.close();
    }
}
