package fr.romdhani.aymen.toolios.core.dao;

import org.hibernate.Session;

import java.sql.Connection;


public abstract class DAO<T> {
    protected Session session  = null;

    public DAO(Session session){
        this.session = session;
    }

    /**
     *
     * @param obj
     * @return boolean
     */
    public abstract boolean create(T obj);

    /**
     *
     * @param obj
     * @return boolean
     */
    public abstract boolean delete(T obj);

    /**
     *
     * @param obj
     * @return boolean
     */
    public abstract boolean update(T obj);

    /**
     *
     * @param id
     * @return T
     */
    public abstract T find(int id);
}