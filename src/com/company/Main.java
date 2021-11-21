package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();
        numere.add(1);
        numere.add(2);
        numere.add(7);
        numere.add(32);
        numere.add(22);
        numere.add(29);
        numere.add(12);
        numere.add(132);
        numere.add(17);

        // afisez al 5lea element din lista
        System.out.println("Al 5lea element " + numere.get(4));
        // afisez al 2lea element din lista
        System.out.println("Al 2 lea element " + numere.get(1));

        // vreau sa afisez din lista doar numerele mai mici ca 50
        System.out.println("Numerele din lista mai mica ca 50");
        for (Integer x : numere) {
            if (x < 50)
                System.out.print(x + " ");
        }
        // vreau sa afisez din lista doar numerele pare
        for (Integer x : numere) {
            if (x % 2 == 0)
                System.out.println(x);
        }
        // vreau sa afisez suma numerelor din lista
        int S = 0;
        for (Integer z : numere) {
            S = S + z;
        }
        System.out.println("Suma este: " + S);
        // Vreau sa calculez produsul nr. pare din lista
        int P = 1;
        for (Integer x : numere) {
            if (x % 2 == 0)
                P = P * x;
        }
        System.out.println("Produsul este: " + P);
        // afisez fiecare element din lista pe cate o linie
        System.out.println("Afisare cu forEach pe stream din lista");
        numere.stream().forEach(elemCurent -> System.out.println(elemCurent));
    }


}
