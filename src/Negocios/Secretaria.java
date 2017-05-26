package Negocios;

import Datos.*;

public class Secretaria {
    public static void insertar_secretaria(int id, String contrasena){
        String sentencia = "call sp_insertar_secretaria("+id+", '"+contrasena+"');";
        conectarMysql.ejecutar_sentencias(sentencia);
    }
}
