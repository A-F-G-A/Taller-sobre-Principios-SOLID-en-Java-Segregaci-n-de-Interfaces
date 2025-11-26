package Ejercicio_2;

public class Cajero implements Retiro {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado en cajero.");
    }
}