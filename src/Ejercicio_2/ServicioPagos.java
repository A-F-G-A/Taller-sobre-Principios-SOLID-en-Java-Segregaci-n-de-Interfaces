package Ejercicio_2;

public class ServicioPagos implements PagoFactura {
    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura realizado por $" + monto);
    }
}