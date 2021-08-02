package com.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:xe","system","oracle");
        Statement statement = con.createStatement();

        int processCapacity = 20000;
        putAndGet(processCapacity,statement);

        processCapacity = 100000;
        putAndGet(processCapacity, statement);
    }

    public static void putAndGet(int processCapacity, Statement statement) throws SQLException {
        int currentNumber;
        long beginTime;
        long endTime;
        Random rand = new Random();

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < processCapacity; i++) {
            randomNumbers.add(rand.nextInt());
        }

        statement.executeQuery("CREATE TABLE NUMBERS (id INTEGER not NULL ," +
                "value integer not NULL)");
        beginTime = System.currentTimeMillis();
        for (int i = 0; i < processCapacity; i++) {
            currentNumber = randomNumbers.get(i);
            statement.executeUpdate("INSERT INTO NUMBERS (id, value)" + "VALUES("+ i +", " + currentNumber + ")");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for put process :" + ((double) (endTime - beginTime)) / 1000);

        beginTime = System.currentTimeMillis();
        for (int i = 0; i < processCapacity; i++) {
            statement.executeQuery("SELECT * FROM NUMBERS WHERE value = "+ randomNumbers.get(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for get process :" + ((double)(endTime-beginTime))/1000);

        statement.executeUpdate("DROP TABLE NUMBERS");
    }
}


