
package Negocios;

import Datos.*;
import java.sql.*;

public class Iniciar_Sesion {
    public static ResultSet iniciar_sesion(int usuario, String contrasena){
        ResultSet rs = conectarMysql.consulta_sql("call sp_iniciar_sesion("+ usuario +", '" + contrasena +"');");
        return rs;
    }
}
