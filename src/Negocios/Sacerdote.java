package Negocios;

import Datos.*;

public class Sacerdote {
    public static void insertar_sacerdote(int per_id, String per_nombres, String per_apellidos, String per_fecha_nacimiento, String
    per_ciudad_nacimiento, String per_pais_nacimiento, String per_direccion, String per_fecha_bautizo, int
    per_libro_bautizo, int per_folio_bautizo, int per_acta_bautizo, int parr_id, String fecha_ordenacion, String cuen_contraseña){
        
        String sentencia = "call sp_insertar_sacerdote("+per_id+", '"+per_nombres+ "', '"+per_apellidos+"', '"+per_fecha_nacimiento+"', '"+
        per_ciudad_nacimiento+"', '"+per_pais_nacimiento+"', '"+per_direccion+"', '"+per_fecha_bautizo+"', "+
        per_libro_bautizo+", "+per_folio_bautizo+", "+per_acta_bautizo+", "+parr_id+", '"+fecha_ordenacion+"', '"+cuen_contraseña+"');";
        conectarMysql.ejecutar_sentencias(sentencia);
    }
}
