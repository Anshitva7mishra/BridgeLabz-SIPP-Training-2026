import java.util.*;
public class QuickFlightPrices{
    static int p(long[]a,int l,int r){
        long x=a[r];int i=l;
        for(int j=l;j<r;j++)if(a[j]<=x){long t=a[i];a[i]=a[j];a[j]=t;i++;}
        long t=a[i];a[i]=a[r];a[r]=t;return i;
    }
    static void q(long[]a,int l,int r){
        if(l<r){int m=p(a,l,r);q(a,l,m-1);q(a,m+1,r);}
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[]a=new long[n];
        for(int i=0;i<n;i++)a[i]=sc.nextLong();
        q(a,0,n-1);
        for(long v:a)System.out.print(v+" ");
    }
}
