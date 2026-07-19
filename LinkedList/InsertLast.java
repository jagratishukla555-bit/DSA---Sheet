
class Node{
    int val;
    Node next;

    Node(int val){
    this.val=val;
    }

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}

public class InsertLast {
    Node head;

    
    Node insert(int value){

        Node newNode = new Node(value);

        if(head == null)
        {
            head = newNode;
            return head;
        }

        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }


    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        
        InsertLast il = new InsertLast();
        il.insert(10);
        il.insert(20);
        il.insert(30);
        il.insert(40);

        il.display();

        il.insert(50);
       System.out.println();
        il.display();
    }
    
}
