package fr.romdhani.aymen.toolios;


import fr.romdhani.aymen.toolios.core.orm.Project;
import fr.romdhani.aymen.toolios.core.orm.UserAccount;
import fr.romdhani.aymen.toolios.core.orm.UserRoles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Toolios
 */
public class App {
    private static EntityManager em;

    public static void main(String[] args) {
        System.out.println("Start Toolios!");
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("toolios_db");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        UserRoles userRoles = new UserRoles(UserRoles.UserRole.ADMIN);
        em.persist(userRoles);
        UserAccount userAccount = new UserAccount("aym.rom", "aymen", "rom", "toto@gmail.com", "0657883456", "manual", userRoles);
        Project project0 = new Project("project0");
        Project project1 = new Project("project1");
        Project project2 = new Project("project2");
        userAccount.addProject(project0);
        userAccount.addProject(project1);
        userAccount.addProject(project2);
        em.persist(userAccount);
        em.getTransaction().commit();
    }

}
