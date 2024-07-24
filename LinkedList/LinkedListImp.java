class LinkedList{
    Node head ;
    
    static class Node{
        int data ;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    
// -------------------------------Adding new element in last in linked list ----------------------------------------

    public  void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

// ----------------------------------Adding new element in start -------------------------------------------------------

public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

// -----------------------------------------Adding new element at index---------------------------------------

public void add(int index, int data)
{
    if(index == 0)
    {
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    
    for(int i=0; i<index-1 && temp.next!=null; i++)
    {
       
        temp = temp.next;
    }
     if (temp == null || temp.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
    }
    newNode.next = temp.next;
    temp.next = newNode;
    
}

// -------------------------------------------- remove element at index--------------------------------------------------
public void removeAt(int index){
    
    if(index==0)
    {
        head = head.next;
        return;
    }
    
    Node temp = head;
    for(int i=0; i<index-1 && temp.next!=null; i++)
    {
        temp = temp.next;
    }
    if (temp == null || temp.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    temp.next = temp.next.next;
}

//--------------------------------------------Access Element ----------------------------------------------------------

public int get(int index){
    Node temp = head;
    
    for(int i=0; i<index && temp.next!=null; i++)
    {
        temp= temp.next;
    }
    return temp.data;

}

//--------------------------------------------Searching for element ------------------------------------------------------

public int search(int data) {
        Node temp = this.head;
        int index = 0;

        while (temp != null) {
            if (temp.data == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }


// -------------------------------------------updating an element --------------------------------------------------------

public void update(int index, int newData) {
        Node temp = this.head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        temp.data = newData;
    }


// -------------------------------------------Reverse the linked list-------------------------------------------------------


public void reverse()
{
    Node current = head;
    Node prev = null;
    Node next = null;
    
    while(current!=null)
    {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}

//-------------------------------------------- override toString method to print the Linked List--------------------
    public String toString()
    {
        String linkedList =" [ ";
        Node temp = head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                linkedList = linkedList+temp.data;
            }
            else{
                linkedList = linkedList+ temp.data+", ";
            }
            temp = temp.next;
        }
        linkedList = linkedList+" ]";
        return linkedList;
    }
}

public class LinkedListImp{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);
        
    }
}
