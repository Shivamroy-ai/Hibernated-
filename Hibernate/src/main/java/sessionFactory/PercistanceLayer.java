package sessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class PercistanceLayer {

    static Session session;
   static SessionFactory sessionFactory;
   static   Transaction transaction;
   static Configuration configuration;
    public PercistanceLayer()
    {
        super();
    }

    public static void createConnection_SaveData(Object entity) {
        createSession();
        session.save(entity);
        beginTransaction();

    }

    private static void createSession() {
        configuration=new Configuration();
        configuration.configure(new File("Hibernate/src/main/java/hibernate.cfg.xml"));
        sessionFactory=configuration.buildSessionFactory();
        System.out.println("Session Factory = "+sessionFactory);
        session=sessionFactory.openSession();
    }
    private static void beginTransaction() {
        transaction=session.beginTransaction();
        transaction.commit();
//        session.close();
    }

    public static <T> T get(Class<T> obj, Long id)
    {
        createSession();
        T orgObj= session.get(obj,id);
        beginTransaction();
        return  orgObj;
    }
    public static <T>T load(Class<T> obj,Long id)
    {
        createSession();
        T orgObj= session.load(obj,id);
        beginTransaction();
        return  orgObj;
    }

}
