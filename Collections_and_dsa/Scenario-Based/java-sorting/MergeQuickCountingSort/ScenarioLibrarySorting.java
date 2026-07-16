import java.util.*;

public class ScenarioLibrarySorting {
    static void mergeSort(int[]a,int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        int[]t=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<=m)t[k++]=a[i++];
        while(j<=r)t[k++]=a[j++];
        System.arraycopy(t,0,a,l,t.length);
    }
    static int lomuto(int[]a,int l,int r){
        int p=a[r],i=l;
        for(int j=l;j<r;j++)if(a[j]<=p){int x=a[i];a[i]=a[j];a[j]=x;i++;}
        int x=a[i];a[i]=a[r];a[r]=x;
        return i;
    }
    static void quickSort(int[]a,int l,int r){
        if(l<r){
            int p=lomuto(a,l,r);
            quickSort(a,l,p-1);
            quickSort(a,p+1,r);
        }
    }
    static void countingSort(int[]a,int max){
        int[]c=new int[max+1];
        for(int v:a)c[v]++;
        int k=0;
        for(int i=1;i<=max;i++)while(c[i]-->0)a[k++]=i;
    }
    public static void main(String[]args){
        Random rd=new Random();
        int[]sizes={100,1000,10000};
        for(int n:sizes){
            int[]a=new int[n];
            for(int i=0;i<n;i++)a[i]=rd.nextInt(1000000);
            int[]b=a.clone(),c=a.clone();
            long s=System.nanoTime();mergeSort(a,0,n-1);long m=System.nanoTime()-s;
            s=System.nanoTime();quickSort(b,0,n-1);long q=System.nanoTime()-s;
            int[]g=new int[n];
            for(int i=0;i<n;i++)g[i]=1+rd.nextInt(20);
            s=System.nanoTime();countingSort(g,20);long ct=System.nanoTime()-s;
            System.out.println("Size "+n+" Merge="+m+"ns Quick="+q+"ns Count="+ct+"ns");
        }
    }
}
