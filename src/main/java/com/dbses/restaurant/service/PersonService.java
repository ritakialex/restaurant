package com.dbses.restaurant.service;

import com.dbses.restaurant.database.DatabaseConnectionException;
import com.dbses.restaurant.model.Person;
import java.sql.SQLException;

public class PersonService {
    public static String getName(final int id) throws SQLException, DatabaseConnectionException {
        return Person.getOne(id).getName();
    }
}
