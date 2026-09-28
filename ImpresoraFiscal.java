package Ejercicio18_facturacionTickets;

public class ImpresoraFiscal {
    public void imprimirDocumento(Factura factura) {
        System.out.println("==================================");
        System.out.println("         TICKET FACTURA");
        System.out.println("==================================");
        System.out.println("N°: " + factura.getNumero());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("----------------------------------");
        for (ItemFactura i : factura.getItems()) {
            System.out.printf("%-16s %d x %8.2f = %9.2f%n", i.getDescripcion(), i.getCantidad(), i.getPrecioUnitario(), i.calcularSubtotal());
        }
        System.out.println("----------------------------------");
        System.out.printf("TOTAL: %27.2f%n", factura.calcularTotal());
        System.out.println("==================================");
    }
}
