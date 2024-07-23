import java.util.Scanner;

public class Suma {
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
