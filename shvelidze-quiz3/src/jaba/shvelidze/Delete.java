package jaba.shvelidze;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try {

            Class.forName("org.h2.Driver");
            Connection myConn = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "123");

            int deletedRows;
            try (Statement myStatement = myConn.createStatement()) {
                String query = "DELETE FROM CAR WHERE manufacturer='BMW'";

                deletedRows = myStatement.executeUpdate(query);
            }
            System.out.println("deleted : "+deletedRows+" Row");
            System.out.println("Succsess");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
