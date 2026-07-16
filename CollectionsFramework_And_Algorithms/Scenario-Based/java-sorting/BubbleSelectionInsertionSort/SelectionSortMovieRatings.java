import java.util.*;

public class SelectionSortMovieRatings {
    
public static void selectionSort(int[] a){
 for(int i=0;i<a.length-1;i++){
  int m=i;
  for(int j=i+1;j<a.length;j++)if(a[j]<a[m])m=j;
  int t=a[i];a[i]=a[m];a[m]=t;
 }
}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++)a[i]=sc.nextInt();
 selectionSort(a);
 System.out.println(Arrays.toString(a));
}

}
