import java.util.*;
interface Category{

}
class BookCategory implements Category{

}
class ClothingCategory implements Category{

}
class GadgetCategory implements Category{

}
class Product<T extends Category>{
    String name;
    double price;
    T cat;
    Product(String n,double p,T c){
        name=n;
        price=p;
        cat=c;
    }
    public String toString(){
        return name+" "+price;
    }
}
public class Main{
static <P extends Product<?>> void applyDiscount(P p,double per){
    p.price-=p.price*per/100;
}
public static void main(String[]args){
    Product<BookCategory>b=new Product<>("Java",500,new BookCategory());
    applyDiscount(b,10);
    System.out.println(b);
}
}