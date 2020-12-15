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
public class SList <E>{
    
    private SNode<E> head,tail;
    private int size;
    
    public SList(){
        head = null;
        tail =null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public E first(){
       return head.getElement();
    }
    
    public E last(){
        return tail.getElement();
    }
    
    public void addFirst(E element){
        SNode<E> newNode = new SNode<>(element,null);
        
            if (size() == 0){
                tail = newNode;
            } 
            newNode.setNext(head);
                head = newNode;
                size++;
    }
    
    public void addLast(E element){
        SNode<E> newNode = new SNode<>(element, null);
       
            if (size () == 0){
            head = newNode;
            }
        
            tail.setNext(newNode);
            tail = newNode;
            size++;
    }
    
    public E removeFirst() throws EmptyListException{
        SNode<E> temp = head;
        head = head.getNext();
        
            if (head == null){
                throw new EmptyListException ();
            }
            
            temp.setNext(null);
            size--;
            
            return temp.getElement();
    }
    
    public void displayList(SList<CustomerData> DataList) {
        SNode<CustomerData> temp = (SNode<CustomerData>) head;
        for (int count = 0; count < DataList.size(); count++) {
            System.out.print("Customer Name : "+temp.getElement().getCustomer() + "\n\n");
            System.out.print("MilkTea Ordered : "+temp.getElement().getMilktea() + " \n");
            System.out.print("Price : "+temp.getElement().getMprice() + " \n\n");
            System.out.print("Fries Ordered : "+temp.getElement().getFries() + " \n");
            System.out.print("Price : "+temp.getElement().getFprice() + " \n\n");
            System.out.print("Burger Ordered : "+temp.getElement().getBurger() + " \n");
            System.out.print("Price : "+temp.getElement().getBprice() + " \n\n");

            temp = temp.getNext();
        }
    }
}