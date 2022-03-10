import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoja que ejercicio quiere ejecutar: ");
        menu();
        int opcion = teclado.nextInt();

        switch(opcion){
            case 1:
                Dado dado6 = new Dado();
                Dado dado10 = new Dado(10);
                Dado dado12 = new Dado(12);
                int suma = 0;
                do{
                    suma += dado6.tirarDado();
                    System.out.println("Dado de 6 caras: "+ dado6.ultCara);
                    suma += dado10.tirarDado();
                    System.out.println("Dado de 10 caras: "+ dado10.ultCara);
                    suma += dado12.tirarDado();
                    System.out.println("Dado de 12 caras: "+ dado12.ultCara);
                    if(suma < 20){
                        suma = 0;
                        System.out.println("Los dados no suman 20 o más");
                    }
                }while(suma < 20);
                System.out.println("Bien! Los dados suman "+suma);
            break;
            case 2:

            break;
            case 3:

            break;
            case 4:
            
            break;
        }
        
        
    }

    private static void menu(){
        System.out.println("Ejercicios: ");
        System.out.println("1.- Los dados");
        System.out.println("2.- Los clientes");
        System.out.println("3.- Micro guerra de barcos V3 ");
        System.out.println("4.- Micro guerra de barcos V4 ");
    }
}
