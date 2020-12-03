package jaba.shvelidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try {

            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");


            Statement myStatement = myConn.createStatement();


            String query = " UPDATE CAR SET price='47000' WHERE id=1";

            myStatement.executeUpdate(query);
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


