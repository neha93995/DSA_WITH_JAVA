

class Queue{

    Node front;
    Node rare;
    static int size = 0;

    static class Node{
        Node next = null;
        int val ;

        Node( int val)
        {
            this.val = val;
            this.next = null;
            
        }
    }

    public void enqueue(int val)
    {
        Node temp = rare;
        Node newNode = new Node(val);
        if(temp==null)
        {
            rare = newNode;
            front = newNode;
            
        }
        else{
            rare.next = newNode;
            rare = newNode;
        }
        size++;
        
    }
 
    public void dequeue()
    {
        if(front==null)
        {
            return;
        }
        Node temp = front.next;
        front = temp;
        size--;

    }
    
    public int front()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.val;
    }

    public int rare()
    {
        if(rare==null)
        {
            System.out.println("Queueu is Empty");
            return -1;
        }
        return rare.val;
    }

    public boolean isEmpty()
    {
        if(rare==null)
        {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString()
    {
        String s = "[" ;
        Node temp = front;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                s = s+temp.val+", ";
            }
            else{
                s = s+temp.val;
            }
            temp = temp.next;
        }

        s = s+"]";
        return s;

    }

}




public class QueueImplementation{
    public static void main(String args[])
    {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.dequeue();
       
        System.out.println(q.front());
        System.out.println(q.rare());
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
        System.out.println(q.size);

    }
}