package Ejercicio18_facturacionTickets;

public class CajaRegistradora {
    private ImpresoraFiscal impresora;

    public CajaRegistradora(ImpresoraFiscal impresora) {
        this.impresora = impresora;
    }

    public void cerrarVenta(Factura factura) {
        if (factura.getItems().isEmpty()) {
            System.out.println("No se puede cerrar una venta sin ítems.");
            return;
        }
        System.out.println("Cerrando venta " + factura.getNumero() + "... enviando a la impresora fiscal.");
        impresora.imprimirDocumento(factura);
    }
}
