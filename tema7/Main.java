import java.util.Scanner;

//Main

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 5) {
            menu();
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    Dado dado6 = new Dado();
                    Dado dado10 = new Dado(10);
                    Dado dado12 = new Dado(12);
                    int suma = 0;
                    do {
                        suma += dado6.tirarDado();
                        System.out.println("Dado de 6 caras: " + dado6.ultCara);
                        suma += dado10.tirarDado();
                        System.out.println("Dado de 10 caras: " + dado10.ultCara);
                        suma += dado12.tirarDado();
                        System.out.println("Dado de 12 caras: " + dado12.ultCara);
                        if (suma < 20) {
                            suma = 0;
                            System.out.println("Los dados no suman 20 o más");
                        }
                    } while (suma < 20);
                    System.out.println("Bien! Los dados suman " + suma);
                    break;
                case 2:
                        Clientes clientes = new Clientes();
                        clientes.ENI(teclado);
                    break;
                case 3:
                        Cuadricula cuadricula = new Cuadricula();
                        int fila = (int) (Math.random() * 10);
                        int columna = (int) (Math.random() * 10);
                        cuadricula.depositarBarco(fila, columna);
                        //cuadricula.visualizacion();
                    while (true) {
                        System.out.println("Introduce las coordenadas para disparar: ");
                        System.out.println("X: ");
                        int x = teclado.nextInt();
                        System.out.println("Y: ");
                        int y = teclado.nextInt();
                        if (cuadricula.disparar(x, y,"Has")) {
                            break;
                        }
                        cuadricula.visualizacion();
                    }
                    break;
                case 4:
                        Cuadricula jugador = new Cuadricula();
                        Cuadricula maquina = new Cuadricula();
                        int xj = (int) (Math.random() * 10);
                        int yj = (int) (Math.random() * 10);
                        int xm = (int) (Math.random() * 10);
                        int ym = (int) (Math.random() * 10);
                        jugador.depositarBarco(xj, yj);
                        maquina.depositarBarco(xm,ym);
                        int k = 0, l = 0;
                        boolean distintos;
                        //cuadricula.visualizacion();
                    while (true) {
                        System.out.println("Tu turno");
                        System.out.println("Introduce las coordenadas para disparar: ");
                        System.out.println("X: ");
                        int x = teclado.nextInt();
                        System.out.println("Y: ");
                        int y = teclado.nextInt();
                        if (jugador.disparar(x, y,"Has")) {
                            break;
                        }
                        jugador.visualizacion();
                        //bucle para que la maquina no repita posiciones
                        distintos = false;
                        while(!distintos){
                            int i = (int) (Math.random() * 10);
                            int j = (int) (Math.random() * 10);
                            if (i!=k && j!=l){
                                k=i;
                                l=j;
                                distintos = true;
                            }
                        }
                        System.out.println("Turno de la maquina");
                        if (maquina.disparar(k,l,"La maquina ha")){
                            break;
                        }
                        maquina.visualizacion();
                    }
                    break;
                case 5:
                    System.out.println("\nSaliendo . . .");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        }

        
        
    }

    private static void menu(){
        System.out.println("\nEscoja que ejercicio quiere ejecutar: ");
        System.out.println("1.- Los dados");
        System.out.println("2.- Los clientes");
        System.out.println("3.- Micro guerra de barcos V3 ");
        System.out.println("4.- Micro guerra de barcos V4 ");
        System.out.println("5. Salir\n");
    }
}
