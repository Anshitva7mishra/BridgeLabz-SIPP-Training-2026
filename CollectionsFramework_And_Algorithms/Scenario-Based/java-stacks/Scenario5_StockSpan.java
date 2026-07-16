import java.util.*;
public class Scenario5_StockSpan{
static int[] loadSpan(int[] load){
int[] span=new int[load.length];
Deque<Integer> st=new ArrayDeque<>();
for(int i=0;i<load.length;i++){
while(!st.isEmpty()&&load[st.peek()]<=load[i])st.pop();
span[i]=st.isEmpty()?i+1:i-st.peek();
st.push(i);
}
return span;
}
public static void main(String[] args){
System.out.println(Arrays.toString(loadSpan(new int[]{100,80,60,70,60,75,85})));
}
}