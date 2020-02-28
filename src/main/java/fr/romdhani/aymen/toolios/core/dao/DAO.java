package fr.romdhani.aymen.toolios.core.dao;


public abstract class DAO<T> {


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