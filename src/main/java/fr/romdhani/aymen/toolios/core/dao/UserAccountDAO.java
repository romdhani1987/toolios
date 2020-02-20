package fr.romdhani.aymen.toolios.core.dao;

import org.hibernate.Session;

public class UserAccountDAO extends DAO<Object> {
    public UserAccountDAO(Session session) {
        super(session);
    }

    public boolean create(Object obj) {
        return false;
    }

    public boolean delete(Object obj) {
        return false;
    }

    public boolean update(Object obj) {
        return false;
    }

    @Override
    public Object find(int id) {
        return null;
    }

}