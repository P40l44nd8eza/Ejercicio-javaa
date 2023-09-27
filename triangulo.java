//Determina si un triángulo es equilátero o isósceles.
public class main {
    public static void main(String[]args){
        int lado1 = 5;
        int lado2 = 5;
        int lado3 = 5;

        if (lado1== lado2 && lado2 ==lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1== lado2 || lado1== lado3 || lado2 ==lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println(
                    "El triángulo no es ni equilátero ni isósceles.");
        }
    }
}