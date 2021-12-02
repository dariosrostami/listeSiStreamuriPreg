package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    static List<Integer> generareLista()
    {
        List<Integer> numere = new ArrayList<>();
        numere.add(1);
        numere.add(2);
        numere.add(7);
        numere.add(9);
        numere.add(100);
        return numere;
    }
    public static void main(String[] args)
    {
        List<Integer> lista = generareLista();

        // In noua lista
        // 1. numerele impare vor fi negative
        // 2. cele pare vor fi la patrat
        List<Integer> listaNoua = lista.stream().map(x -> {
            if (x%2 != 0)
                return -x;
            else
                return x*x;
        }).collect(Collectors.toList());

        for (int x: listaNoua) {
            System.out.print(x + " ");
        }
        System.out.println("Valori sortate: ");
        List<Integer> listaSortate = listaNoua.stream().sorted().collect(Collectors.toList());
        for (int x : listaSortate) {
            System.out.print(x + " ");
        }
        // filter - pt filtrarea pe o lista
        // filter(functiePtFiltrare)
        // functiePtFiltrare -
        // functie ce primeste ca parametru un elem din lista
        // trebuie sa returneze true daca elementul respecta criteriul de filtrare dorit
        // in caz contrar trebuie sa returneze false
        System.out.println("Valorile filtrate: ");
        listaNoua.stream().filter(x->x>=0).forEach(x->System.out.print(x + " "));
        // reduce
        // reduce stream-ul la un singur element
        // sintaxa : reduce(valInitiala, functieDeReducere)
        // sintaxa functieDeReducere: (raspFinal, elemCurent) -> instructiuni
        // functiaDeReducere returneaza valoarea pt raspunsul final considerand
        // ca deja s-a aplicat reducerea pt elementele precedente
        // si rez e in raspFinal

        // ex1: Vreau sa afisez produsul numerelor din lista initiala
        //Integer rezultatReducere = lista.stream().
        // ex2 : Vreau sa afisez produsul numerelor <30 din lista initiala
        // hint : mai intai filtreaza si apoi fa reducerea

        // ex3: Vreau din lista initiala sa obtin o noua lista unde
        // fiecare element e mai mare cu 5 fata de vechea valoarea
        // aceasta lista noua o voi afisa pe ecran
        // exemplu : (3, 7, 8) -----> (8, 12, 13)
        int k = lista.stream().reduce(1, (s, x)-> s*x);
        System.out.println("Ex 1: " + k);
        int l = lista.stream().filter(x-> x<30).reduce(1, (s, x)-> s*x);
        System.out.println("Ex2 : " + l);
        List<Integer> m = lista.stream().map(x->x+5).collect(Collectors.toList());
        System.out.println("Ex 3: " + m);
    }
}
