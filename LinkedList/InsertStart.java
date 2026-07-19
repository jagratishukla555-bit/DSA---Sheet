public class InsertStart {
    
    class Node{
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
        }
    }
    Node head;
    Node insertFirst(int val){
        Node newNode = new Node(val);

        if(head == null)
        {
            head = newNode;
            return head;
        }

        if(head!=null)
        {
            newNode.next = head;
            head = newNode;
            return head;
        }
        return head;
    }

    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
             temp = temp.next;
        }
        
    }

    public static void main(String[] args) {
        InsertStart i = new InsertStart();
        i.insertFirst(10);
        i.insertFirst(20);
        i.insertFirst(40);
        i.insertFirst(30);
        i.display();
    }
}
