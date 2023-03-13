package org.example;

import entity.Certificate;
import entity.IDCard;
import entity.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import sessionFactory.PercistanceLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!");
        Student vikas=new Student();
//        vikas.setId(4l);
        vikas.setStudentName("Vikas"); vikas.setRollNo(202387030l);
        Certificate certificate=new Certificate();
        certificate.setCaurseName("Java");
        certificate.setCaurseDuration(new Date());
        vikas.setCertificate(certificate);

//        I Card

        IDCard idCard=new IDCard();
        idCard.setAddress("167/24 Nagar Pure");
        idCard.setPhoneNo(8780078l);
        idCard.setIcardIssueDate(new Date());

        try { FileInputStream inputStream=new FileInputStream(new File("S:/LearningHub/Image/tree.jpg"));

            System.out.println("FileInputStream = "+inputStream.available());

            byte []image=new byte[inputStream.available()];
            inputStream.read(image);
            idCard.setImage(image);
        }
        catch (Exception e){e.printStackTrace();}

//        PercistanceLayer.createConnection_SaveData(idCard);
        PercistanceLayer.createConnection_SaveData(vikas);

        Student idCard1=(Student) PercistanceLayer.get(Student.class,1l);
        System.out.println(" Student Detail = "+idCard1.getCertificate());
        Student idCard3=(Student) PercistanceLayer.get(Student.class,1l);
        System.out.println(" Student Detail1 = "+idCard3.getStudentName());
        Student idCard2=(Student) PercistanceLayer.load(Student.class,1l);
        System.out.println(idCard2.getRollNo());

//       IDCard idCard1=(IDCard) PercistanceLayer.get(IDCard.class,1l);
//        System.out.println(" Student Detail = "+idCard1.getIcardIssueDate());
//        IDCard idCard3=(IDCard) PercistanceLayer.get(IDCard.class,1l);
//        System.out.println(" Student Detail1 = "+idCard3.getIcardIssueDate());
//        IDCard idCard2=(IDCard) PercistanceLayer.load(IDCard.class,29l); //It Show Exception
//        System.out.println(idCard2.getAddress());
    }
}
