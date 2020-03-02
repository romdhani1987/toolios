package fr.romdhani.aymen.toolios.core.dao;


import fr.romdhani.aymen.toolios.core.orm.UserAccount;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class UserAccountDAO extends DAO<UserAccount> {
    private EntityManager entityManager;

    // standard constructors


    public Optional<UserAccount> get(long id) {
        return Optional.ofNullable(entityManager.find(UserAccount.class, id));
    }

      public List<UserAccount> getAll() {
        Query query = entityManager.createQuery("SELECT e FROM User e");
        return query.getResultList();
    }

     public void save(UserAccount user) {
        executeInsideTransaction(entityManager -> entityManager.persist(user));
    }


    public void update(UserAccount user, String[] params) {
        user.setEmail(Objects.requireNonNull(params[0], "Name cannot be null"));
        user.setLogin(Objects.requireNonNull(params[1], "Email cannot be null"));
        executeInsideTransaction(entityManager -> entityManager.merge(user));
    }


    public void delete(UserAccount user) {
        executeInsideTransaction(entityManager -> entityManager.remove(user));
           }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();
        }
        catch (RuntimeException e) {
            tx.rollback();
            throw e;
        }
    }
}