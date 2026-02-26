import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mascota mascota = new mascota("Max", "Perro", 3, 10.5, true);

        System.out.println("ESTADO INICIAL:");
        mascota.mostrarFicha();

        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Cumplir años");
        System.out.println("2. Engordar");
        System.out.println("3. Adelgazar");
        System.out.println("4. Cambiar estado a enfermo");
        System.out.println("5. cambiar estado a saludable");

        int opcion = sc.nextInt();

        if (opcion == 1) {

            System.out.println("¿Cuántos años desea aumentar?");
            int años = sc.nextInt();
            mascota.cumplirAnios(años);



        } else if (opcion == 2) {

            System.out.println("¿Cuántos kilos desea aumentar?");
            double kilos = sc.nextDouble();
            mascota.engordar(kilos);

        } else if (opcion == 3) {

            System.out.println("¿Cuántos kilos desea disminuir?");
            double kilos = sc.nextDouble();
            mascota.adelgazar(kilos);

        } else if (opcion == 4) {

            mascota.enfermar();

        } else if (opcion == 5) {

            mascota.recuperarSalud();

        } else {

            System.out.println("Opción no válida");
        }

        System.out.println("\nESTADO FINAL:");
        mascota.mostrarFicha();

        sc.close();
    }
}