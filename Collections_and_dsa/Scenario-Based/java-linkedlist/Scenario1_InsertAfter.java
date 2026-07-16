class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public class Scenario1_InsertAfter {
    static void insertAfter(Node current, int trackId) {
        if(current==null) return;
        Node newNode=new Node(trackId);
        newNode.next=current.next;
        current.next=newNode;
    }

    static void print(Node head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(4);
        insertAfter(head.next,3);
        print(head);
    }
}
