package sessionFactory;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class PercistanceLayer {

    public PercistanceLayer()
    {
        super();
    }

    public static void createConnection_SaveData(Object entity) {
        Configuration configuration=new Configuration();
        configuration.configure(new File("Hibernate/src/main/java/hibernate.cfg.xml"));

        SessionFactory sessionFactory=configuration.buildSessionFactory();
        System.out.println("Session Factory = "+sessionFactory);
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
    }
}
