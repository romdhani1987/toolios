package fr.romdhani.aymen.toolios;


import fr.romdhani.aymen.toolios.core.orm.Project;
import fr.romdhani.aymen.toolios.core.orm.UserAccount;
import fr.romdhani.aymen.toolios.core.orm.UserRoles;

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
        UserAccount userAccount = new UserAccount("aym.rom","aymen","rom","toto@gmail.com","0657883456","manual");
        Project project = new Project("project0");
        Project project1 = new Project("project1");
        Project project2 = new Project("project2");
        em.persist(project);
        em.persist(project1);
        em.persist(project2);
        userAccount.addProject(project);
        userAccount.addProject(project1);
        userAccount.addProject(project2);
        em.persist(userAccount);
        em.getTransaction().commit();
    }

}
