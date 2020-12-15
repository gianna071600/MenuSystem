/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmenu2;

/**
 *
 * @author USER
 * @param <E>
 */
public class SNode <E>{
   
    private E element;
    private SNode<E> next;
    
    public SNode(E element, SNode<E> next){
        this.element = element;
        this.next = next;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(E element) {
        this.element = element;
    }

    /**
     * @return the next
     */
    public SNode<E> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(SNode<E> next) {
        this.next = next;
    }
    
    
}
