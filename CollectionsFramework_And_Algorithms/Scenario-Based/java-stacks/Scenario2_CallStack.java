public class Scenario2_CallStack {
static class CallStack{
static class Frame{
String functionName;Frame next;
Frame(String n,Frame x){functionName=n;next=x;}
}
private Frame top=null;
void push(String n){top=new Frame(n,top);}
String pop(){if(isEmpty())throw new RuntimeException("No active call");String t=top.functionName;top=top.next;return t;}
String peek(){if(isEmpty())throw new RuntimeException("No active call");return top.functionName;}
boolean isEmpty(){return top==null;}
}
public static void main(String[] args){
CallStack cs=new CallStack();
cs.push("main");cs.push("solve");
System.out.println(cs.peek());
System.out.println(cs.pop());
}
}