package fr.romdhani.aymen.toolios;


import fr.romdhani.aymen.toolios.core.orm.Project;
import fr.romdhani.aymen.toolios.core.orm.UserAccount;
import fr.romdhani.aymen.toolios.core.orm.UserFunction;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * Toolios
 */
public class App {
    private static EntityManager em;

    public static void main(String[] args) {
        System.out.println("Start Toolios!");
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("toolios-db");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        UserFunction userFunction = new UserFunction();
        userFunction.setFunction_name("software dev");
        UserAccount userAccount = new UserAccount("test");
        userAccount.setL_name("romdhani");
        userAccount.setF_name("aymen");
        userAccount.setUser_function(userFunction);
        Project project = new Project();
        project.setTitle("test");
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        project.setCreation_timestamp(ts);
        userAccount.setORM_Project(Set.of(project));
        em.persist(project);
        em.persist(userAccount);
        em.getTransaction().commit();


    }

    private static void createUserAccount(String firstName,
                                          String lastName) {
        Transaction transaction = (Transaction) em.getTransaction();

    }
}
