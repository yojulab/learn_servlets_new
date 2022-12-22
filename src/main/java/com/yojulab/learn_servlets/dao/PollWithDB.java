package com.yojulab.learn_servlets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class PollWithDB {
    public void getQuestion(String questionsUid) throws SQLException{

        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM QUESTIONS_LIST " +
                        " WHERE QUESTIONS_UID = '"+questionsUid+"'";
        
        ResultSet resultSet = statement.executeQuery(query);
        HashMap<String, Object> result;
        while(resultSet.next()){
            resultSet.getString("QUESTIONS_UID");
            resultSet.getString("QUESTIONS");
            resultSet.getInt("ORDERS");
        }
    }
}
