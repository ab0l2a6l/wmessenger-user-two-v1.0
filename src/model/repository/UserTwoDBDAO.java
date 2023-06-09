package model.repository;

import model.entity.UserTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserTwoDBDAO implements UserTwoDBDAORead, UserTwoDBDAOWrite {
    private final String url = "jdbc:mysql://localhost:3306/firstdb";
    private final String username = "root";
    private final String password = "Am311865186";

    private String query;

    private Statement statement;
    private Connection connection;

    public UserTwoDBDAO() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
            System.out.println("connected");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<UserTwo> findByALl(long id) throws Exception {
        query = "select * from messenger where messenger_id = " + id;
        ResultSet set = statement.executeQuery(query);
        List<UserTwo> userTwoList = new ArrayList<>();
        while (set.next()) {
            UserTwo userTwo = new UserTwo();
            userTwo.setId(set.getInt("messenger_id"));
            userTwo.setText(set.getString("messenger_text"));
            userTwoList.add(userTwo);
        }
        return userTwoList;
    }

    @Override
    public void save(UserTwo userTwo) throws Exception {
        query = "insert into messenger (messenger_id , messenger_text) values ("
                + userTwo.getId() + " , \"" + userTwo.getText() + "\")";
        statement.executeUpdate(query);
        System.out.println(query);

    }

    @Override
    public void close() throws Exception {
        statement.close();
        connection.close();
        System.out.println("disconnected");
    }
}
