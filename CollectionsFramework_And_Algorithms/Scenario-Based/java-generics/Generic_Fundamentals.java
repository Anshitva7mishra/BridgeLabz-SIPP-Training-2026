import java.util.*;
class Pair<T,U>{T first;U second;Pair(T f,U s){first=f;second=s;}public String toString(){return first+" "+second;}}
class Stack<T>{ArrayList<T> a=new ArrayList<>();void push(T x){a.add(x);}T pop(){return a.remove(a.size()-1);}boolean empty(){return a.isEmpty();}}
class Repository<T>{List<T> list=new ArrayList<>();void add(T t){list.add(t);}List<T> getAll(){return list;}}
public class Main{
static <T extends Comparable<T>> T findMax(T[] arr){T m=arr[0];for(T x:arr)if(x.compareTo(m)>0)m=x;return m;}
static void print(List<?> l){for(Object o:l)System.out.println(o);}
public static void main(String[]args){
Pair<String,Integer> p=new Pair<>("Age",21);
System.out.println(p);
Stack<Integer>s=new Stack<>();s.push(10);s.push(20);System.out.println(s.pop());
Integer[]a={4,7,2,9};System.out.println(findMax(a));
Repository<String> r=new Repository<>();r.add("A");r.add("B");print(r.getAll());
}}