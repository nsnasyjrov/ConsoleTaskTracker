package Project.Task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Date;


public class TaskControlMethods {

    // Объект SessionFactr
    static SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

    public void createTask(String description) {
        try(Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Task task = new Task();
            task.setDescription(description);
            session.save(task);
            transaction.commit();
        }
    }
}
