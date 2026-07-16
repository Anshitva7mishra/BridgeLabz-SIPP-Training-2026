import java.util.*;

public class BubbleSortSwapCount {
    
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt(),sw=0;
 int[] a=new int[n];
 for(int i=0;i<n;i++)a[i]=sc.nextInt();
 for(int i=0;i<n-1;i++){
  boolean s=false;
  for(int j=0;j<n-1-i;j++){
   if(a[j]>a[j+1]){
    int t=a[j];a[j]=a[j+1];a[j+1]=t;sw++;s=true;
   }
  }
  if(!s)break;
 }
 System.out.println(sw);
 System.out.println(Arrays.toString(a));
}

}
