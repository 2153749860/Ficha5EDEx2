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
public class DoubleLinkedOrderedList<T> extends DoubleLinkedList<T> implements OrderedListADT<T> {

    public DoubleLinkedOrderedList() {
        super();
    }

    @Override
    public void add(T element) {
        if (element instanceof Comparable) {
            Comparable<T> x = (Comparable<T>) element;

            DoubleNode<T> newNode = new DoubleNode<>(element);

            //meter no inicio sem nada
            if (this.isEmpty()) {
                this.head = newNode;
                this.tail = newNode;
            }

            //menor que head
            if (x.compareTo(this.head.getElement()) < 0) {
                newNode.setNext(this.head);
                this.head.setPrevious(newNode);
                this.head = newNode;
            }

            //maior que tail
            if (x.compareTo(this.tail.getElement()) > 0) {
                newNode.setPrevious(this.tail);
                this.tail.setNext(newNode);
                this.tail = newNode;
            } //estar no meio
            else {
                DoubleNode<T> current = this.head;

                boolean adicionado = false;

                while (current != null && adicionado == false) {
                    if (x.compareTo(current.getElement()) < 0) {
                        newNode.setNext(current);
                        newNode.setPrevious(current.getPrevious());

                        (current.getPrevious()).setNext(newNode);
                        current.setPrevious(newNode);
                        adicionado = true;

                    }

                    current = current.getNext();
                }
            }

            this.count++;
            this.modCount++;
        }
    }
}
