class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


public class Scenario5_CycleDetection {
    static boolean hasRedirectLoop(Node head){
        Node slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
        c.next=b;
        System.out.println(hasRedirectLoop(a));
    }
}
