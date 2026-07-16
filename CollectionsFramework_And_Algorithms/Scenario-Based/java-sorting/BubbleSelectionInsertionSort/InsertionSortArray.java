import java.util.*;

public class InsertionSortArray {
    
public static void insertionSort(int[] a){
 for(int i=1;i<a.length;i++){
  int key=a[i],j=i-1;
  while(j>=0&&a[j]>key){a[j+1]=a[j];j--;}
  a[j+1]=key;
 }
}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++)a[i]=sc.nextInt();
 insertionSort(a);
 System.out.println(Arrays.toString(a));
}

}
