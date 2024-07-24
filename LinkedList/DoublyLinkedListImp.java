
class DoubleLinkedList{
    Node head;
    Node tail;
    
    static class Node{
        int data;
        Node prev = null;
        Node next = null;
        
        Node(int data){
            this.data = data;
        }
        
    }
    
// ---------------------------------------------------------------- Adding element at last  -------------------------------------

    public void add(int data){
        
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    
// ---------------------------------------------------------------- deleting element in beginning-------------------------------------

    public void deleteFirst(){
        if(head == null)
        {
            return;
        }
        if(head == tail)
        {
            head=null;
            tail=null;
            return;
        }
        head = head.next;
        head.prev = null;
        
    }
    
// ---------------------------------------------------------------- deleting  element in last -------------------------------------

    public void deleteLast()
    {
        if(tail==null) return;
        if(head==tail)
        {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        
    }

// ----------------------------------------deleting element in give position-------------------------------------
    
    public void deleteAt(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i=0; i<index && temp!=null; i++)
        {
            temp = temp.next;
        }
        if(temp==null)
        {
            System.out.println("index out of bound ");
            return;
        }
        if(temp==tail)
        {
            deleteLast();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

// --------------------------------------------------------- traversing in forward direction----------------------------------------

    
    public void traverseForward()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // --------------------------------------------------------- traversing in backward direction----------------------------------------

    public void traverseBackward()
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    
    
    
    @Override
    public String toString()
    {
        String s = "[ ";
        Node temp = head;
        while(temp!=null)
        {
            s = s+ temp.data;
            if(temp.next!=null)
            {
                s = s+", ";
            }
            temp = temp.next;
        }
        s = s+" ]";
        return s;
    }
    
}

public class DoublyLinkedListImp {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.add(1);
        dl.add(2);
        dl.add(3);
        dl.add(4);
        dl.add(5);
        dl.deleteFirst();
        dl.deleteLast();
        dl.deleteAt(0);
       
        System.out.println(dl);
        dl.traverseForward();
        dl.traverseBackward();
        
    }
}


