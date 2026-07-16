import java.util.*;

public class BubbleSortStudentMarks {
    
public static void bubbleSort(int[] a){
 boolean swapped;
 for(int i=0;i<a.length-1;i++){
  swapped=false;
  for(int j=0;j<a.length-1-i;j++){
   if(a[j]>a[j+1]){
    int t=a[j];a[j]=a[j+1];a[j+1]=t;
    swapped=true;
   }
  }
  if(!swapped)break;
 }
}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++)a[i]=sc.nextInt();
 bubbleSort(a);
 System.out.println(Arrays.toString(a));
}

}
