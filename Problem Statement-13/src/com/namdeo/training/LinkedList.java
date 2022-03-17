package com.namdeo.training;

class LinkedList
{
    Node head; 
 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    
    void printNthFromLast(int n)
    {
        Node main_ptr = head;
        Node ref_ptr = head;
 
        int count = 0;
        if (head != null)
        {
            while (count < n)
            {
                if (ref_ptr == null)
                {
                    System.out.println(n
                     + " is greater than the no "
                       + " of nodes  Value in the list -1");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
 
            if(ref_ptr == null)
            {
              
              if(head != null)
                System.out.println("Node no. " + n +
                                   " from last is " +
                                      head.data);
            }
            else
            {
                   
              while (ref_ptr != null)
              {
                  main_ptr = main_ptr.next;
                  ref_ptr = ref_ptr.next;
              }
              System.out.println("Node no.  from last second is : " +main_ptr.data);
                                
                                  
            }
        }
    }
 
   
    public void push(int new_data)
    {
        
        Node new_node = new Node(new_data);
 
        
        new_node.next = head;
 
        
        head = new_node;
    }
 
   
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.push(9);
 
        llist.printNthFromLast(8);
        llist.printNthFromLast(10);
    }
}
//