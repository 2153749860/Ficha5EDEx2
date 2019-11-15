/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha5edex2;

/**
 *
 * @author tiago
 */
public class MainListADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedList lista1 = new DoubleLinkedList();

        int teste = 2;

        switch (teste) {
            case 0: //teste size com lista vazia
                System.out.println(lista1.size());
                break;
                
            case 1: //teste size com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                System.out.println(lista1.size());
                break;
                
            case 2: //teste isEmpty com lista vazia
                System.out.println(lista1.isEmpty());
                break;
                
            case 3: //teste isEmpty com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                System.out.println(lista1.isEmpty());
                break;

        }    
    }
    
}
