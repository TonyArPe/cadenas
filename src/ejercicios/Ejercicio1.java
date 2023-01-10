package ejercicios;
import java.util.Arrays;


public class Ejercicio1 {
    //creamos un array de String que aparezca: nombre, apellidos, direccion, telefono
    //usamos un bucle mejorado aparezca en una linea cada uno de los valores:
    //nombre
    //apellidos
    //...
    //Un metodo que pasemos el array anterior y devuelva un Sting como una linea
    //"nombre, apellidos,direccion,telefono"
    //mostramos en consola la cadena anterior, pero en mayuscula
    //Pasamos la cadena anterior a un metodo que devuelva una nueva cadena
    //Pero sin espacios y en mayusculas:
    //"NOMBRE,APELLIDOS,DIRECCION,TELEFONO"
    //Un metodo, que se le pase la cadena anterior y nos devuelva el nombre
    //con el formato apellidos, nombre
    //Un metodo que se le pase el String anterior de apellidos y nombre, nos diga
    //cuantas vocales tiene entre apellidos y nombre
    public static void main(String[] args) {
        String[] datos = {"Antonio"," ", "Aragón"," ", "Calle Larios"," ", "56434783"};
        for (String dato: datos) {
            System.out.printf("%s%n", dato);
        }
        String csv1 = crearCampoCSV(datos);
        System.out.printf("CSV: %S%n", csv1);

        String csv2 = crearCampoCSVSinEspaciosYMayuculas(csv1);
    }

    private static String crearCampoCSVSinEspaciosYMayuculas(String csv1) {
        String csv = "";
        for (String dato: datos) {

        }
        return null;
    }

    private static String crearCampoCSV(String[] datos) {
        String csv = "";
        for (String dato: datos) {
            csv += dato +", ";
        }
        if (csv.isEmpty())
            return csv;
        return csv.substring(0, csv.length()-2);
    }

}
