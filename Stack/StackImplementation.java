class Stack{
    Node root;
    
    static class Node{
        int data;
        Node next = null;
        
        Node(int data){
            this.data = data;
        }
    }
    
    public boolean isEmpty()
    {
        if(root==null) return true;
        return false;
    }
    
    public void push(int data)
    {
        Node newNode = new Node(data);
        if(root ==null)
        {
            root = newNode;
            return;
        }
        Node temp = root;
        root = newNode;
        newNode.next = temp; 
    }
    
    public int pop()
    {
        int popData = Integer.MIN_VALUE;
        if(root==null)
        {
            System.out.println("Stack is empty");
            return popData; 
        }
        popData = root.data;
        root = root.next;
        return popData;
    }
    
    public int peek()
    {
        if(root==null)
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return root.data;
    }
    
    public int size()
    {
        int count =0;
        Node temp = root;
        while(temp!=null)
        {
            count++;
        }
        return count;
    }
   
    
    @Override
    public String toString()
    {
        String s = "[ ";
        Node temp = root;
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

public class StackImplementation {
    public static void main(String[] args) {
       
       Stack s = new Stack();
       
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
       
       System.out.println(s);
       System.out.println("peek value "+s.peek());
       System.out.println(s);
       System.out.println("poped value " + s.pop());
       System.out.println(s);        
    }
}


