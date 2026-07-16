import java.util.*;

public class EmployeeAttendanceRanking {
    
static class E{int id,att;E(int i,int a){id=i;att=a;}}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] ids=new int[n],att=new int[n];
 for(int i=0;i<n;i++)ids[i]=sc.nextInt();
 int k=sc.nextInt();
 for(int i=0;i<n;i++)att[i]=sc.nextInt();
 E[] e=new E[n];
 for(int i=0;i<n;i++)e[i]=new E(ids[i],att[i]);
 for(int i=0;i<n-1;i++){
  int m=i;
  for(int j=i+1;j<n;j++)
   if(e[j].att>e[m].att||(e[j].att==e[m].att&&e[j].id<e[m].id))m=j;
  E t=e[i];e[i]=e[m];e[m]=t;
 }
 int[] ans=new int[k];
 for(int i=0;i<k;i++)ans[i]=e[i].id;
 System.out.println(Arrays.toString(ans));
}

}
