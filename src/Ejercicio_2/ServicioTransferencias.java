package Ejercicio_2;

public class ServicioTransferencias implements Transferencia {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia realizada por $" + monto);
    }
}