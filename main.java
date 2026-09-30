
import java.util.Scanner;

// Crea un programa que pida la edad y el salario de una persona 
// Ademas el programa debe presentar un menu el cual contiene.
// 1. si es medico.
// 2. si es programador.
// 3. si es abogado.
// si es medico el salario se incrementa en $200 USD
// si es programador el salario se incrementa al 15% del salario
// si es abogado el salario se incrementa 50$ USD siempre y cuando sea mayor de 60 años


public class main {

    public static void main(String[] args){

        int edad;
        double salario;
        int opcion;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Ingresa la edad: ");
        edad = entrada.nextInt();

        System.out.println("Ingrese el salario: ");
        salario = entrada.nextDouble();

        System.out.println("##");
        System.out.println("1. Es medico");
        System.out.println("2. Es programador");
        System.out.println("3. Es abogado");
        System.out.println("Ingresa una opción");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                
                break;
            default:
                throw new AssertionError();
        }




    }
}