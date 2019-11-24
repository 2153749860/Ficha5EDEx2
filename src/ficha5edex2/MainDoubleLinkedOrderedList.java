/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex2;

import java.util.Iterator;

/**
 *
 * @author tiago
 */
public class MainDoubleLinkedOrderedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                DoubleLinkedOrderedList<String> lista1 = new DoubleLinkedOrderedList();

        int teste = 2;

        switch (teste) {
            case 0: //teste add se nao existir elementos
                lista1.add("C");

                Iterator it = lista1.iterator();

                while (it.hasNext()) {
                    String obj = (String) it.next();
                    System.out.println(obj);
                }
                break;
                
            case 1: //teste add se for menor que o head
                lista1.add("C");
                lista1.add("B");

                Iterator it2 = lista1.iterator();

                while (it2.hasNext()) {
                    String obj = (String) it2.next();
                    System.out.println(obj);
                }
                break;
                
            case 2: //teste add se for mior que o tail
                lista1.add("C");
                lista1.add("D");

                Iterator it3 = lista1.iterator();

                while (it3.hasNext()) {
                    String obj = (String) it3.next();
                    System.out.println(obj);
                }
                break;
        }
    }
    
}
