package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;
 
public class Principal {
 
    public static void main(String[] args) {
        List<Ordenador> lista = new ArrayList<Ordenador>();
 
        Ordenador o1 = new Ordenador("A1", "Ordenador gaming", 4, "Principal_Ordenador");
        Ordenador o2 = new Ordenador("B1", "Ordenador ofimatica", 2, "Principal_Ordenador");
        lista.add(o1);
        lista.add(o2);
 
        for (Ordenador o : lista) {
 
            System.out.println(o.getId());
            System.out.println(o.getPotencia());
            System.out.println(o.getDescripcion());
 
        }
         
        Lavadora l1= new Lavadora("L1","Standard","Lavadora normal",  "Principal_Lavadora");
        Lavadora l2= new Lavadora("L2","VIP","Lavadora avanzada",  "Principal_Lavadora");
                 
        List<Lavadora> lista2= new ArrayList<Lavadora>();
        lista2.add(l1);
        lista2.add(l2);
 
        for (Lavadora l : lista2) {
 
            System.out.println(l.getId());
            System.out.println(l.getModelo());
            System.out.println(l.getDescripcion());
 
        }
 
    }
 
}