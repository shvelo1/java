package jaba.shvelidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver");
        Connection myConn = DriverManager.
                getConnection ("jdbc:h2:tcp://localhost/~/test", "sa","123");
        System.out.println("connected");


        Statement myStatement = myConn.createStatement();


        String query= "INSERT INTO CAR (id, manufacturer , model , price) VALUES ('1','BMW','BMW Z4', '50000');";

        myStatement.executeUpdate(query);
        System.out.println("success");

    }

}

