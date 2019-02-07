package com.arquitecturajava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
 
public class Principal2 {
 
    public static void main(String[] args) {
        List<Ordenador> lista = new ArrayList<Ordenador>();
 
        Ordenador o1 = new Ordenador("A1", "Ordenador gaming", 4, "Principal_Ordenador");
        Ordenador o2 = new Ordenador("B1", "Ordenador ofimatica", 2, "Principal_Ordenador");
        lista.add(o1);
        lista.add(o2);
 
     
        Lavadora l1= new Lavadora("L1","Standard","Lavadora normal",  "Principal_Lavadora");
        Lavadora l2= new Lavadora("L2","VIP","Lavadora avanzada",  "Principal_Lavadora");
                 
        List<Lavadora> lista2= new ArrayList<Lavadora>();
        lista2.add(l1);
        lista2.add(l2);
         
        imprimirListaCualquiera(lista);
        imprimirListaCualquiera(lista2);
         
     
    }
     
    public static void imprimirListaCualquiera(List<?> lista) {
         
        for(Object c: lista) {
             
            Method[] metodos=c.getClass().getMethods();
            for(Method m: metodos) {
                 
                //System.out.println(m.getName());
                 
                if (m.getName().equals("getId") || m.getName().equals("getDescripcion") || m.getName().equals("getNombre")) {
                     
                    try {
                        String cadena=(String) m.invoke(c, null);
                        System.out.println(cadena);
                    } catch (IllegalAccessException | IllegalArgumentException
                            | InvocationTargetException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                 
            }
        }
         
    }
 
}