import java.util.*;
abstract class JobRole{}
class SoftwareEngineer extends JobRole{}
class DataScientist extends JobRole{}
class ProductManager extends JobRole{}
class Resume<T extends JobRole>{String candidate;T role;Resume(String c,T r){candidate=c;role=r;}}
public class Main{
static void pipeline(List<? extends JobRole> roles){System.out.println("Roles:"+roles.size());}
public static void main(String[]a){
Resume<SoftwareEngineer> r=new Resume<>("Alice",new SoftwareEngineer());
pipeline(Arrays.asList(new SoftwareEngineer(),new DataScientist(),new ProductManager()));
System.out.println(r.candidate);
}}
