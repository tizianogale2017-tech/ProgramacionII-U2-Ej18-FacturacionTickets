package Ejercicio18_facturacionTickets;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String numero;
    private String cliente;
    private List<ItemFactura> items = new ArrayList<>();

    public Factura(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void agregarItem(ItemFactura item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemFactura i : items) {
            total += i.calcularSubtotal();
        }
        return total;
    }

    public String getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }
}
