import java.util.Random;

//Ejercicio 1

public class Dado {
    public int numCaras;
    public int ultCara;

    public Dado(int numCaras) {
        this.numCaras = numCaras;
    }

    public Dado(){
        this.numCaras = 6;
    }

    public int getNumCaras() {
        return this.numCaras;
    }

    public void setNumCaras(int numCaras) {
        this.numCaras = numCaras;
    }

    public int getUltCara() {
        return this.ultCara;
    }

    public int tirarDado(){
        Random r = new Random();
        this.ultCara = r.nextInt(1, this.numCaras+1);
        return this.ultCara;
    }


    



    
}
