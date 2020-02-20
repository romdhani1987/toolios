package fr.romdhani.aymen.toolios;

import com.sun.prism.paint.Gradient;
import fr.romdhani.aymen.toolios.core.orm.*;


import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.HashSet;
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
        UserFunction userFunction = new UserFunction();
        userFunction.setName("software dev");
        UserAccount userAccount = new UserAccount("rom");
        userAccount.setlName("romdhani");
        userAccount.setfName("aymen");
        userAccount.setUserFuntion(userFunction);
        Project project = new Project();
        project.setTitle("test");
        Set<Project> projectSet = new HashSet<>();
        projectSet.add(project);
        userAccount.setUserProjectSet(projectSet);
        em.persist(userAccount);
        em.getTransaction().commit();
        //  createUserAccount("Gabi","Belabed");

    }

    private static void createUserAccount(String firstName,
                                          String lastName) {
        Transaction transaction = (Transaction) em.getTransaction();

    }
}
