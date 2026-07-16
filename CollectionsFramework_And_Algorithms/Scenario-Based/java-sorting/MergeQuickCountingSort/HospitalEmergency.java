import java.util.*;
public class HospitalEmergency{
 static int part(int[]a,int l,int r){int p=a[r],i=l;for(int j=l;j<r;j++)if(a[j]>p){int t=a[i];a[i]=a[j];a[j]=t;i++;}int t=a[i];a[i]=a[r];a[r]=t;return i;}
 static int sel(int[]a,int l,int r,int k){if(l==r)return a[l];int p=part(a,l,r);if(p==k)return a[p];return p>k?sel(a,l,p-1,k):sel(a,p+1,r,k);}
 public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int k=sc.nextInt();System.out.println(sel(a,0,n-1,k-1));}
}
