import java.util.*;
public class Scenario4_NextGreaterElement{
static int[] nextBusierDay(int[] v){
int[] ans=new int[v.length];
Arrays.fill(ans,-1);
Deque<Integer> st=new ArrayDeque<>();
for(int i=0;i<v.length;i++){
while(!st.isEmpty()&&v[i]>v[st.peek()])ans[st.pop()]=v[i];
st.push(i);
}
return ans;
}
public static void main(String[] args){
System.out.println(Arrays.toString(nextBusierDay(new int[]{4,5,2,25})));
}
}