import java.util.*;
public class ScenarioAstronomerSearch{
static int binary(int[]a,int x){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==x)return m;if(a[m]<x)l=m+1;else r=m-1;}return-1;}
static int rotated(int[]a,int x){int l=0,r=a.length-1;while(l<=r){int m=l+(r-l)/2;if(a[m]==x)return m;if(a[l]<=a[m]){if(x>=a[l]&&x<a[m])r=m-1;else l=m+1;}else{if(x>a[m]&&x<=a[r])l=m+1;else r=m-1;}}return-1;}
static int first(int[]a,int x){int l=0,r=a.length-1,ans=-1;while(l<=r){int m=l+(r-l)/2;if(a[m]>=x){if(a[m]==x)ans=m;r=m-1;}else l=m+1;}return ans;}
static int last(int[]a,int x){int l=0,r=a.length-1,ans=-1;while(l<=r){int m=l+(r-l)/2;if(a[m]<=x){if(a[m]==x)ans=m;l=m+1;}else r=m-1;}return ans;}
static int min(int[]a){int l=0,r=a.length-1;while(l<r){int m=l+(r-l)/2;if(a[m]>a[r])l=m+1;else r=m;}return l;}
public static void main(String[]args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();int t=sc.nextInt();System.out.println(binary(a,t));System.out.println(rotated(a,t));System.out.println(first(a,t));System.out.println(last(a,t));System.out.println(min(a));}}