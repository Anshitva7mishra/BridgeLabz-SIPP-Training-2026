import java.util.*;
public class MergePatientIDs{
    static void sort(long[]a,int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        sort(a,l,m);sort(a,m+1,r);
        long[]t=new long[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r)t[k++]=a[i]<=a[j]?a[i++]:a[j++];
        while(i<=m)t[k++]=a[i++];
        while(j<=r)t[k++]=a[j++];
        System.arraycopy(t,0,a,l,t.length);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        sort(a,0,n-1);
        for(long v:a)System.out.print(v+" ");
    }
}
