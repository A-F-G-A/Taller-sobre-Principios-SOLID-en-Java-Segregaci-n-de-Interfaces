package Ejercicio_3;

public class Camion implements Condu_ISPV, TransporteMercancia {
    @Override
    public void conducir() {
        System.out.println("El camión está avanzando.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancía.");
    }
}
