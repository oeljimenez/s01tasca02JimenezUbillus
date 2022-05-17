package it.academy.java.sprint1.tasca2.n1exercisi1;

import java.util.List;

public class Venda {

    private List<Producte> productes;
    private Double preuTotal;

    public Double calcularTotal(List<Producte> productes) throws Exception {
        Double totalPrice = 0.0;
        try {
            if (productes.isEmpty()) {
                throw new VendaBuidaException("\nPer fer una venda primer has d’afegir productes\n");
            } else {
                for (Producte producte : productes) {
                    totalPrice = totalPrice + producte.getPreu();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return totalPrice;
    }
}
