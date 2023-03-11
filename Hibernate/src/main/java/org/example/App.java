package org.example;

import entity.IDCard;
import entity.Student;
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

//        I Card

        IDCard idCard=new IDCard();
        idCard.setAddress("155/24");
        idCard.setPhoneNo(89078678l);
        idCard.setIcardIssueDate(new Date());

        try { FileInputStream inputStream=new FileInputStream(new File("S:/LearningHub/Image/tree.jpg"));

            System.out.println("FileInputStream = "+inputStream.available());

            byte []image=new byte[inputStream.available()];
            inputStream.read(image);
            idCard.setImage(image);
//            int read = inputStream.read();
//            byte []image=(byte[]) read ;
//             idCard.setImage();
        }
        catch (Exception e){e.printStackTrace();}


        PercistanceLayer.createConnection_SaveData(idCard);

    }
}
