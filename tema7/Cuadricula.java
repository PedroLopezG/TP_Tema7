

public class Cuadricula {

    final int T = 10;
    int tabla[][] = new int [T][T];
    String[][] interfaz = new String[T][T];

    
    public Cuadricula() {
        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                tabla[j][i]=0;
            }
        }

        for (int j=0;j<T;j++){
            for (int i=0;i<T;i++){
                interfaz[j][i]="?";
            }
        }
    }

    public void depositarBarco(int x, int y){
        tabla[x][y] = 1;
    }

    public boolean disparar(int x, int y, String player){
        if(tabla[x][y] == 1){
            System.out.println(String.format("%s hundido el barco",player));
            return true;
        }else{
            System.out.println("Agua!");
            interfaz[x][y] = "~";
            return false;
        }
    }

    public void visualizacion(){
        for (int j=0;j<interfaz.length;j++){
            for (int i=0;i< interfaz.length;i++){
                System.out.print(" "+interfaz[j][i]);
            }
            System.out.println("");
        }
    }
}
