import java.util.LinkedList;
import java.util.Scanner;

public class Clientes {

    public void ENI(Scanner teclado) {
        LinkedList lista = new LinkedList();
        int opcion = 0;
        int clientes = 0;
        String cliente;

        while (opcion != 3) {
            menu();
            opcion = teclado.nextInt();


            switch (opcion){
                case 1:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(String.format("Cliente n.°%d [%s]",i+1,lista.get(i)));
                    }

                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("¿Nombre?");
                    cliente = teclado.nextLine();
                    lista.add(cliente);
                    clientes++;
                    System.out.println(String.format("Cliente n.°%d [%s] añadido",clientes,lista.get(clientes-1)));
                    break;
                case 3:
                    System.out.println("\nVolviendo al menu principal . . .");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;

            }


        }
    }
        private static void menu(){
            System.out.println("-- Menú --");
            System.out.println("1 - Mostrar clientes");
            System.out.println("2 - Crear un cliente");
            System.out.println("3 - Salir");
        }
    }

