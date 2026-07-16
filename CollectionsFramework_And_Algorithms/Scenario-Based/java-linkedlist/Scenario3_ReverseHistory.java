class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public class Scenario3_ReverseHistory {
    static Node reverseHistory(Node head){
        Node prev=null,curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
        head.next.next=new Node(3);
        head=reverseHistory(head);
        print(head);
    }
}
