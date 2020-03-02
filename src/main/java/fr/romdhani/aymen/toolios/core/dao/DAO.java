package fr.romdhani.aymen.toolios.core.dao;


import fr.romdhani.aymen.toolios.core.orm.UserAccount;

import java.util.List;

public abstract class DAO<T> {

    public abstract List<T> getAll();


}