public class Scenario1_UndoBuffer {
static class UndoBuffer{
private String[] data;
private int top;
UndoBuffer(int maxDepth){data=new String[maxDepth];top=-1;}
boolean push(String edit){if(top==data.length-1)return false;data[++top]=edit;return true;}
String pop(){if(isEmpty())throw new RuntimeException("Nothing to undo");return data[top--];}
String peek(){if(isEmpty())throw new RuntimeException("Nothing to peek");return data[top];}
boolean isEmpty(){return top==-1;}
}
public static void main(String[] args){
UndoBuffer u=new UndoBuffer(3);
u.push("Edit1");u.push("Edit2");
System.out.println(u.peek());
System.out.println(u.pop());
}
}