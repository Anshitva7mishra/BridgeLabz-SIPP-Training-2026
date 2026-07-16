import java.util.*;
abstract class WarehouseItem{
    String n;
    WarehouseItem(String n){
        this.n=n;
    }
    public String toString(){
        return n;
    }
}
class Electronics extends WarehouseItem{
    Electronics(String n){
        super(n);
    }
}
class Grocery extends WarehouseItem{
    Grocery(String n){
        super(n);
    }
}
class Furniture extends WarehouseItem{
    Furniture(String n){
        super(n);
    }
}
class Storage<T extends WarehouseItem>{
    List<T> items=new ArrayList<>();
    void add(T t){
        items.add(t);
    }
    List<T> get(){
        return items;
    }
}
public class Main{
    static void show(List<? extends WarehouseItem> l){
        for(var x:l)System.out.println(x);
    }
    public static void main(String[]a){
        Storage<Electronics>s=new Storage<>();
        s.add(new Electronics("Laptop"));
        show(s.get());
    }
}