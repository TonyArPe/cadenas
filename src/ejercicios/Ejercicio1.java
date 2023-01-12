package ejercicios;



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
        String[] datos = {"Antonio" , "Aragon" , "calle Larios" , "56434783"};
        for (String dato: datos) {
            System.out.printf("%s%n", dato);
        }
        String csv1 = crearCampoCSV(datos);
        System.out.printf("CSV: %S%n", csv1);

        String csv2 = crearCampoCSVSinEspaciosYMayuculas(csv1);
        System.out.printf("CSV: %S%n", csv2);

        String csv3 = crearApellidosNombreMinuscula(csv2);
        System.out.printf("CSV: %s%n", csv3);

        int numeroVocalesNombre = contarVocalesDeNombre(csv1.toLowerCase());
        System.out.printf("%s tiene %d vocales%n", csv1, numeroVocalesNombre);
    }


    private static int contarVocalesDeNombre(String nombre) {
        int contadorVocales = 0;
        for (int i = 0; i < nombre.length(); i++) {
            //if (nombre.toLowerCase().charAt(i) == 'a' || nombre.toLowerCase().charAt(i) == 'e' || nombre.toLowerCase().charAt(i) == 'i' || nombre.toLowerCase().charAt(i) == 'o' || nombre.toLowerCase().charAt(i) == 'u');
            switch (nombre.charAt(i)) {
                case 'a':
                    contadorVocales++;
                    break;
                case 'e':
                    contadorVocales++;
                    break;
                case 'i':
                    contadorVocales++;
                    break;
                case 'o':
                    contadorVocales++;
                    break;
                case 'u':
                    contadorVocales++;
                    break;
            }
        }
        return contadorVocales;
    }
        private static String crearApellidosNombreMinuscula (String csv2){
            String[] csv3 = csv2.split(",");
            return csv3[1].toLowerCase() + " " + csv3[0].toLowerCase();
        }

        private static String crearCampoCSVSinEspaciosYMayuculas (String csv1){
            String csv2 = "";
            return csv2 = csv1.replaceAll(", ", ",").toUpperCase();

        }

        private static String crearCampoCSV (String[]datos){
            String csv = "";
            for (String dato : datos) {
                csv += dato + ", ";
            }
            if (csv.isEmpty())
                return csv;
            return csv.substring(0, csv.length() - 2);
        }

    }
