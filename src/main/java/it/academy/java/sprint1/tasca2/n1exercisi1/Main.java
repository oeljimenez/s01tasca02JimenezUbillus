package it.academy.java.sprint1.tasca2.n1exercisi1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Tasca 02. Exceptions (Spring1), Nivell 1, Exercisi 1\n");

        Venda venda = new Venda();
        List<Producte> productes = new ArrayList<>();
        productes.add(new Producte("cadira", 150.00 ));
        productes.add(new Producte("pilota", 15.65 ));
        productes.add(new Producte("cullera", 1.63 ));

        System.out.println(venda.calcularTotal(productes));

        venda.calcularTotal(new ArrayList<Producte>());

        //add ArrayIndexOutOfBoundsException Exception
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println ( "Last element: " + intArray[5]);
    }
}
