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
    public static void main(String[] args) throws EmptyCollectionException, ElementoNaoExisteException {
        DoubleLinkedList lista1 = new DoubleLinkedList();

        int teste = 14;

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

            case 4: //teste removeFirst com lista vazia
                lista1.removeFirst();
                break;

            case 5: //teste removeFirst com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                System.out.println(lista1.toString());
                lista1.removeFirst();
                System.out.println(lista1.toString());

                break;
                
            case 6: //teste removeFirst com apenas 1 elemento
                lista1.add(1);
                System.out.println(lista1.toString());
                lista1.removeFirst();
                System.out.println(lista1.toString());

                break;
                
            case 7: //teste removeLast sem elementos na lista
                lista1.removeLast();
                System.out.println(lista1.toString());
                
                break;
                
            case 8: //teste removeLast com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                System.out.println(lista1.toString());
                lista1.removeLast();
                System.out.println(lista1.toString());
                
                break;
                
            case 9: //teste removeLast com apenas 1 elemento na lista
                lista1.add(1);
                System.out.println(lista1.toString());
                lista1.removeLast();
                System.out.println(lista1.toString());
                break;
                
            case 10: //teste remove de elemento que nao existe
                lista1.add(1);
                lista1.add(2);
                System.out.println(lista1.toString());
                lista1.remove(3);
                break;
                
            case 11: //teste remove com apenas 1 elemento na lista
                lista1.add(1);
                lista1.remove(1);
                
                System.out.println(lista1.toString());
                break;
                
            case 12: //teste remove com alguns elementos na lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                
                System.out.println(lista1.toString());
                
                lista1.remove(2);
                
                System.out.println(lista1.toString());
                break;
                
            case 13: //teste remove tail da lista
                lista1.add(1);
                lista1.add(2);
                lista1.add(3);
                lista1.add(4);
                
                System.out.println(lista1.toString());
                
                lista1.remove(4);
                
                System.out.println(lista1.toString());
                break;
                
            case 14: //teste remove com lista vazia
                System.out.println(lista1.toString());
                lista1.remove(1);
                
        }
    }

}
