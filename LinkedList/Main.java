import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
    this.data = data;
    }
}

class LinkedListInsertion {
    Node head;

    void insert(int data)
    {
    Node newNode = new Node(data);

    if(head == null)
    {
        head = newNode;
        return;
    }

    Node temp = head;

    while(temp.next != null)
    {
        temp = temp.next;
    }
    temp.next = newNode;
    }

    void display()
    {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp= temp.next;
        }
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListInsertion li = new LinkedListInsertion();
         System.out.print("N:");
        int n = sc.nextInt();
        int value;
        for(int i=0; i<n; i++)
        {
            value = sc.nextInt();
            li.insert(value);
        }

        li.display();
       
        
    }
}
