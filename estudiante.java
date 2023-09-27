//Verifica si un estudiante ha aprobado si su nota es mayor
// o igual a 70 o si ha
//obtenido un resultado de "Aprobado" en su evaluación.
public class main {
    public static void main(String[]args){
int nota=60;
String resultado="reprobado";
if(nota >= 70 || resultado.equals("Aprobado") ){
    System.out.println("El alumno esta aprobado");
}else{
    System.out.println("El alumno reprobo");
}
    }
}