
import java.util.*;

public class Scenario5_GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> groups=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            groups.computeIfAbsent(key,x->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        List<List<String>> res=groupAnagrams(arr);
        for(List<String> g:res){
            for(String s:g){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
