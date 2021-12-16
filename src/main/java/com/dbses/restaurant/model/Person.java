package com.dbses.restaurant.model;

import com.dbses.restaurant.database.DatabaseConfig;
import com.dbses.restaurant.database.DatabaseConnectionException;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class Person {

    private int id;
    private String name;
    private String surname;
    private int age;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(int id, String name, String surname, int age, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static Person getOne(final int id) throws DatabaseConnectionException, SQLException {
        Connection conn = DatabaseConfig.getConnection();
        conn.createStatement().executeQuery(String.format("call getPerson(%1s)", id));
        /*
            Retrieve values from result
        */
        final String name = "name";
        final String surname = "name";
        final int age = 34;
        final Date dateOfBirth = new Date();

        conn.close();
        return new Person(id, name, surname, age, dateOfBirth);
    }

}
