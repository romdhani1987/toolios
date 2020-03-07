package fr.romdhani.aymen.toolios.core.dao;


import fr.romdhani.aymen.toolios.core.orm.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ProjectDAO extends DAO<Project> {
    private EntityManager entityManager;

    // standard constructors
    public Optional<Project> get(long id) {
        return Optional.ofNullable(entityManager.find(Project.class, id));
    }

    public List<Project> getAll() {
        Query query = entityManager.createQuery("SELECT p FROM Project p");
        return query.getResultList();
    }

    public void save(Project project) {
        executeInsideTransaction(entityManager -> entityManager.persist(project));
    }


    public void update(Project project, String[] params) {
        executeInsideTransaction(entityManager -> entityManager.merge(project));
    }


    public void delete(Project project) {
        executeInsideTransaction(entityManager -> entityManager.remove(project));
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