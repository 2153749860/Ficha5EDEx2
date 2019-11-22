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
public class MainDoubleLinkedUnorderedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ElementoNaoExisteException {
        DoubleLinkedUnorderedList lista1 = new DoubleLinkedUnorderedList();
        
        int opcao = 7;
        
        switch(opcao){
            case 0: //teste addToFront
                lista1.addToFront("D");
                lista1.addToFront("B");
                lista1.addToFront("A");
                lista1.addToFront("C");
                

                Iterator it3 = lista1.iterator();

                while (it3.hasNext()) {
                    String obj = (String) it3.next();
                    System.out.println(obj);
                }
                break;
                
            case 1: //teste addToFront com lista vazia
                lista1.addToFront("A");

                Iterator it2 = lista1.iterator();

                while (it2.hasNext()) {
                    String obj = (String) it2.next();
                    System.out.println(obj);
                }
                break;
            
            case 2: //teste addToRear
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("D");
                lista1.addToRear("B");

                Iterator it = lista1.iterator();

                while (it.hasNext()) {
                    String obj = (String) it.next();
                    System.out.println(obj);
                }
                break;
                
            case 3: //teste addToRear com lista vazia
                lista1.addToRear("A");

                Iterator it4 = lista1.iterator();

                while (it4.hasNext()) {
                    String obj = (String) it4.next();
                    System.out.println(obj);
                }
                break;
                
                
            case 4: //teste addAfter
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "C");
                
                
                Iterator it6 = lista1.iterator();

                while (it6.hasNext()) {
                    String obj = (String) it6.next();
                    System.out.println(obj);
                }
                break;
                
            case 5: //teste addAfter sem o elemento existir
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "S");
                
                
                Iterator it7 = lista1.iterator();

                while (it7.hasNext()) {
                    String obj = (String) it7.next();
                    System.out.println(obj);
                }
                break;
                
                
            case 6: //teste addAfter na tail
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "E");
                
                Iterator it8 = lista1.iterator();

                while (it8.hasNext()) {
                    String obj = (String) it8.next();
                    System.out.println(obj);
                }
                break;
                
            case 7: //teste addAfter na head
                lista1.addToRear("D");
                lista1.addToRear("B");
                lista1.addToRear("A");
                lista1.addToRear("C");
                lista1.addToRear("E");
                
                lista1.addAfter("X", "D");
                
                Iterator it9 = lista1.iterator();

                while (it9.hasNext()) {
                    String obj = (String) it9.next();
                    System.out.println(obj);
                }
                break;
                
        }
    }
    
}
