package fr.romdhani.aymen.toolios.core.dao;

import fr.romdhani.aymen.toolios.core.orm.UserAccount;
import org.hibernate.Session;

import java.sql.Connection;

public class UserAccountDAO extends DAO<UserAccount> {
    public UserAccountDAO(Session session) {
        super(session);
    }

    public boolean create(UserAccount obj) {
        return false;
    }

    public boolean delete(UserAccount obj) {
        return false;
    }

    public boolean update(UserAccount obj) {
        return false;
    }

    @Override
    public UserAccount find(int id) {
        return null;
    }

}