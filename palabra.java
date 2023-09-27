//Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra
//"Python"
public class main {
    public static void main (String[]args){
        String texto = "Java es un lenguaje de programación popular.";

        // Verifica si la cadena contiene "Java" y no contiene "Python"
        if (texto.contains("Java") && !texto.contains("Python")) {
            System.out.println(
                    "La cadena contiene 'Java' y no contiene 'Python'.");
        } else {
            System.out.println("La cadena no cumple los criterios.");
        }
    }
}