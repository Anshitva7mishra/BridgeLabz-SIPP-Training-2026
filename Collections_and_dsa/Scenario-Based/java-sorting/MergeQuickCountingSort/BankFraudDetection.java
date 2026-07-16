import java.util.*;
public class BankFraudDetection{
 static long c;
 static void s(long[]a,int l,int r){
  if(l>=r)return;int m=(l+r)/2;s(a,l,m);s(a,m+1,r);
  int j=m+1;for(int i=l;i<=m;i++){while(j<=r&&a[i]>3*a[j])j++;c+=j-(m+1);}
  long[]t=new long[r-l+1];int p=l,q=m+1,x=0;
  while(p<=m&&q<=r)t[x++]=a[p]<=a[q]?a[p++]:a[q++];
  while(p<=m)t[x++]=a[p++];while(q<=r)t[x++]=a[q++];
  System.arraycopy(t,0,a,l,t.length);
 }
 public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();long[]a=new long[n];for(int i=0;i<n;i++)a[i]=sc.nextLong();s(a,0,n-1);System.out.println(c);}
}
