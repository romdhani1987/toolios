package fr.romdhani.aymen.toolios;

import com.sun.prism.paint.Gradient;
import fr.romdhani.aymen.toolios.core.orm.Address;


import fr.romdhani.aymen.toolios.core.orm.Company;
import fr.romdhani.aymen.toolios.core.orm.GroupActivity;
import fr.romdhani.aymen.toolios.core.orm.UserGroup;
import org.hibernate.Transaction;

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
                .createEntityManagerFactory("toolios-db");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Address adress = new Address();
        adress.setStreet("9b rue de giessen");
        adress.setCity("selestat");
        adress.setCode("67600");
        Company company = new Company("rs2d", 25L);
        company.setAddress(adress);
        UserGroup usergrp = new UserGroup(company);
        GroupActivity groupActivity=new GroupActivity("soft");
        usergrp.setGroupActivity(groupActivity);
        em.persist(company);
        em.persist(usergrp);

        System.out.println("adress:" + adress.toString());
        em.getTransaction().commit();
        //  createUserAccount("Gabi","Belabed");

    }

    private static void createUserAccount(String firstName,
                                          String lastName) {
        Transaction transaction = (Transaction) em.getTransaction();

    }
}
