package Ejercicio18_facturacionTickets;

public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora(new ImpresoraFiscal());

        Factura factura = new Factura("0001-00004567", "Mesa 8");
        factura.agregarItem(new ItemFactura("Milanesa", 2, 8500.0));
        factura.agregarItem(new ItemFactura("Gaseosa", 3, 2200.0));
        factura.agregarItem(new ItemFactura("Flan", 2, 3500.0));

        caja.cerrarVenta(factura);
    }
}
