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
        DoubleNode newNode = new DoubleNode(element);

        if (this.count == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
        }

        this.count++;
        this.modCount++;
    }

    private DoubleNode<T> find(T element) {
        DoubleNode<T> current = this.head;

        while (current != null) {
            if (current.getElement().equals(element)) {
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    @Override
    public void addAfter(T element, T atual) throws ElementoNaoExisteException {
        DoubleNode<T> current = this.find(atual);

        if (current == null) {
            throw new ElementoNaoExisteException("Elemento não existe!");
        }

        if (current.equals(this.tail)) {
            this.addToRear(element);
        } else {
            DoubleNode<T> newNode = new DoubleNode(element);
            newNode.setPrevious(current);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            (newNode.getNext()).setPrevious(newNode);
        }

    }

}
