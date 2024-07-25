class CircularQueue{
    Node front =null;
    Node rare = null;

    static class Node{
        Node next;
        int val;

        Node(int val)
        {
            this.val = val;
            next =null;
        }
    }

    public void enQueue(int val)
    {
        System.out.println(val);
        Node newNode = new Node(val);
        if(rare==null)
        {
            front = rare = newNode;
            return;
        }
        rare.next = newNode;
        rare=newNode;
        rare.next= front;

    }

    public int deQueue()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = front.val;
        front = front.next;
        rare.next = front;
        return val;
    }

    @Override
    public String toString()
    {
        String s = "[" ;
        Node temp = front;
        while(temp.next!=front)
        {
        
            s = s+temp.val+", ";
            temp = temp.next;
        }

        s = s+temp.val+"]";
        return s;

    }

}



public class CircularQueueImp{
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);

        System.out.println("--- "+q.deQueue());

        System.out.println(q);

        
    }
}