public class Main {
    public static void main(String[] args) {
        vehiculo mivehiculo = new vehiculo(3);
        mivehiculo.addPuerta();
        System.out.println("mi vehiculo tiene " + mivehiculo.getNumPuertas() + " puertas.");
    }
}