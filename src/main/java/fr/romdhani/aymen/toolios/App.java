package fr.romdhani.aymen.toolios;



import fr.romdhani.aymen.toolios.core.orm.Project;
import fr.romdhani.aymen.toolios.core.orm.UserAccount;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;


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
       UserAccount userAccount=new UserAccount("HS");
        Project project=new Project("pr1");
        em.persist(project);
        userAccount.setORM_Project(new HashSet(){
            { add(project); }
        });
        em.persist(userAccount);
        em.getTransaction().commit();
    }

 }
