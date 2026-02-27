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
            System.out.println("4. salir");
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

            }
        }while (op!=4);



        sc.close();
    }
}