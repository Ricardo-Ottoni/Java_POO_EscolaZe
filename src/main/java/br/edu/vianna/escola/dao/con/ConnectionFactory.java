package br.edu.vianna.escola.dao.con;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    public static final String url = "jdbc:mysql://localhost:3306/fpoo";
    public static final String user = "aluno1";
    public static final String PASSWORD = "aluno";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(url,
                    user,
                    PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver não ecnontrado, contate o suporte!!!");
        } catch (SQLException e) {
            System.out.println("não conectou no banco, contate o suporte!!!");
        }
        return null;

    }

    public static void main(String[] args) {

        Connection c = getConnection();

        System.out.println("connectou");
        //System.out.println(c.getCatalog());

    }


}
