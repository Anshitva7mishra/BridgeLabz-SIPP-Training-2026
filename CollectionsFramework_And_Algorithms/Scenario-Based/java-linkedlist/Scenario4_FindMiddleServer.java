class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public class Scenario4_FindMiddleServer {
    static Node findMiddleServer(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println(findMiddleServer(head).val);
    }
}
