import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<mascota> lstlista = new ArrayList<>();


        //List<String> lstNombres = new ArrayList<>();
        //lstNombres.add(personaje1);

        int op;


        //menu de interaccion

        do{
            System.out.println("1. Crear mascota");
            System.out.println("2. mostrar la lista");
            System.out.println("3. buscar mascota en la lista");
            System.out.println("4. cambiar edad de una mascota");
            System.out.println("5. cambiar peso de una mascota");
            System.out.println("6. cambiar estado de una mascota a (enfermo, saludable)");
            System.out.println("7. salir");
            System.out.println("selecciona una opcion");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("1. crear un objeto");

                    System.out.println("Ingrese el nombre de la mascota");
                    String nombre = sc.next();

                    System.out.println("Ingrese la especie del animal");
                    String especie = sc.next();

                    System.out.println("Ingrese la edad");
                    int edad = sc.nextInt();

                    System.out.println("Ingrese el peso");
                    double peso = sc.nextDouble();

                    System.out.println("Esta saludable");



                    boolean saludable = sc.nextBoolean();



                    mascota pz1 = new mascota(nombre, especie, edad, peso, saludable);

                    lstlista .add(pz1);
                    break;

                case 2 :
                    for (mascota mostarFicha : lstlista){
                        System.out.println(mostarFicha);

                    }
                    break;
                case 3 :
                    String nombre1;
                    System.out.println("ingrese el nombre de la mascota");
                    nombre1 = sc.next();

                    if (lstlista.isEmpty()){
                        System.out.println("LA LISTA NO TIENE ELEMENTOS");

                    }

                    mascota mas1 = null;

                    for (mascota mostrarFicha: lstlista){
                        if(mostrarFicha.getNombre().equalsIgnoreCase(nombre1)){
                            mas1 = mostrarFicha;
                            System.out.println(mas1.toString());
                        }
                    }
                    break;
                case 4 :

                    String nombreModificar;

                    System.out.println("Ingrese el nombre de la mascota:");
                    nombreModificar = sc.next();



                    mascota mascotaEncontrada = null;

                    for (mascota m : lstlista) {
                        if (m.getNombre().equalsIgnoreCase(nombreModificar)) {
                            mascotaEncontrada = m;
                            break;
                        }
                    }

                    if (mascotaEncontrada != null) {


                        System.out.println("Ingrese la nueva edad:");
                        int nuevaEdad = sc.nextInt();

                        int edadActualizada = mascotaEncontrada.cambiarEdad(nuevaEdad);

                        System.out.println("Nueva edad: " + edadActualizada);

                    } else {
                        System.out.println("Mascota no encontrada.");
                    }
                    break;
                case 5:
                    String nombreModificarPeso;

                    System.out.println("Ingrese el nombre de la mascota:");
                    nombreModificarPeso = sc.next();

                    mascota mascotaEncontradaPeso = null;

                    for (mascota m : lstlista) {
                        if (m.getNombre().equalsIgnoreCase(nombreModificarPeso)) {
                            mascotaEncontradaPeso = m;
                            break;
                        }
                    }

                    if (mascotaEncontradaPeso != null) {


                        System.out.println("Ingrese el nuevo peso:");
                        double nuevoPeso = sc.nextDouble();

                        double pesoActualizado = mascotaEncontradaPeso.cambiarPeso(nuevoPeso);

                        System.out.println("Nuevo peso: " + pesoActualizado);

                    } else {
                        System.out.println("Mascota no encontrada.");
                    }

                    break;

                case 6:
                    String nombreModificarSalud;

                    System.out.println("Ingrese el nombre de la mascota:");
                    nombreModificarSalud = sc.next();

                    mascota mascotaEncontradaSalud = null;

                    for (mascota m : lstlista) {
                        if (m.getNombre().equalsIgnoreCase(nombreModificarSalud)) {
                            mascotaEncontradaSalud = m;
                            break;
                        }
                    }

                    if (mascotaEncontradaSalud != null) {

                        System.out.println("Ingrese el nuevo estado (true = saludable, false = enfermo):");
                        boolean nuevoEstado = sc.nextBoolean();

                        boolean estadoActualizado =
                                mascotaEncontradaSalud.cambiarSalud(nuevoEstado);

                        System.out.println("Nuevo estado: " +
                                (estadoActualizado ? "Saludable" : "Enfermo"));

                    } else {
                        System.out.println("Mascota no encontrada.");
                    }

                    break;

                case 7 :

                    System.out.println("saliendo del sistema...");
                    break;
            }
        }while (op!=7



        );



        sc.close();
    }
}