package Datos;

import java.sql.*;

public class conectarMysql {

    private static Connection conexion;
    private static String bd = "parroquia";
    public static String user = "root";
    public static String password = "12345";
    private static String host = "localhost";
    private static String server = "jdbc:mysql://" + host + "/" + bd;

    public static void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(server, user, password);
            System.out.println("Conexion a base de datos " + server + " ... OK");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver MySQL JDBC ... FAIL");
        } catch (SQLException ex) {
            System.out.println("Imposible realizar conexion con " + server + " ... FAIL");
        }
    }

    public static void desconectar() {
        try {
            conexion.close();
            System.out.println("Cerrar conexion con " + server + " ... OK");
        } catch (SQLException ex) {
            System.out.println("Imposible cerrar conexion ... FAIL");
        }
    }

    public static void ejecutar_sentencias(String sentencia) {
        conectar();
        try {
            PreparedStatement enrollItmt;
            enrollItmt = conexion.prepareStatement(sentencia);
            enrollItmt.execute();

        } catch (SQLException ex) {
            System.out.println("Imposible ejecutar sentencias ... FAIL");
        }
        desconectar();

    }

    public static ResultSet consulta_sql(String sentencia) {
        conectar();
        ResultSet rs = null;
        try {
            Statement s = conexion.createStatement();
            rs = s.executeQuery(sentencia);
        } catch (SQLException ex) {
            System.out.println("Imposible realizar consulta ... FAIL");
        }
        return rs;
    }
}
