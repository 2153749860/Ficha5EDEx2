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
public class DoubleLinkedUnorderedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> { 

    @Override
    public void addToFront(T element) {
        DoubleNode newNode = new DoubleNode(element);

        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.setPrevious(newNode);
            newNode.setNext(this.head);
            this.head = newNode;
        }

        this.count++;
        this.modCount++;
    }

    @Override
    public void addToRear(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(T element, T atual) throws ElementoNaoExisteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
