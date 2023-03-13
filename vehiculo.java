public class vehiculo {
    private int numPuertas;

    public vehiculo(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void addPuerta() {
        numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}


