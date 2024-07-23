/* ----------------------Division---------------------------------*/
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        float numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo nombre");
        float numero2 = entrada.nextInt();

        if (numero1 == 0) {
            System.out.println("El primer valor no puede ser 0");

        } else if (numero2 != 0) {
            float division = numero1 / numero2;
            System.out.println("la division es: " + division);
        } else {
            System.out.println("No se puede dividir entre 0.");
        }

    }
}


/*-----------------------Suma solo enteros---------------------------*/

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo nombre");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);

    }
}


/*-----------------------resta -----------------------------*/

import java.util.Scanner;

public class Resta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        int numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo nombre");
        int numero2 = entrada.nextInt();

        int suma = numero1 - numero2;
        System.out.println("La suma es: " + suma);

    }
}

*/------------------Multiplicacion-------------------------*/

import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer numero");
        float numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo nombre");
        float numero2 = entrada.nextInt();

        float mult = numero1 * numero2;
        System.out.println("La Multiplicacion es:" + mult);

    }
}
