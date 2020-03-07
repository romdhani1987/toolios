package fr.romdhani.aymen.toolios.core.dao;


import fr.romdhani.aymen.toolios.core.orm.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ProductDAO extends DAO<Product> {
    private EntityManager entityManager;

    // standard constructors
    public Optional<Product> get(long id) {
        return Optional.ofNullable(entityManager.find(Product.class, id));
    }

    public List<Product> getAll() {
        Query query = entityManager.createQuery("SELECT p FROM Product p");
        return query.getResultList();
    }

    public void save(Product product) {
        executeInsideTransaction(entityManager -> entityManager.persist(product));
    }


    public void update(Product product, String[] params) {
        executeInsideTransaction(entityManager -> entityManager.merge(product));
    }


    public void delete(Product product) {
        executeInsideTransaction(entityManager -> entityManager.remove(product));
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