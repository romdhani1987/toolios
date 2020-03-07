package fr.romdhani.aymen.toolios.core.dao;


import fr.romdhani.aymen.toolios.core.orm.Company;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class CompanyDAO extends DAO<Company> {
    private EntityManager entityManager;

    // standard constructors
    public Optional<Company> get(long id) {
        return Optional.ofNullable(entityManager.find(Company.class, id));
    }

    public List<Company> getAll() {
        Query query = entityManager.createQuery("SELECT c FROM Company c");
        return query.getResultList();
    }

    public void save(Company company) {
        executeInsideTransaction(entityManager -> entityManager.persist(company));
    }


    public void update(Company company, String[] params) {

        executeInsideTransaction(entityManager -> entityManager.merge(company));
    }


    public void delete(Company company) {
        executeInsideTransaction(entityManager -> entityManager.remove(company));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}