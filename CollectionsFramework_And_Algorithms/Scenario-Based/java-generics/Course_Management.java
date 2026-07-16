import java.util.*;
abstract class CourseType{}
class ExamCourse extends CourseType{}
class AssignmentCourse extends CourseType{}
class ResearchCourse extends CourseType{}
class Course<T extends CourseType>{String name;T type;Course(String n,T t){name=n;type=t;}public String toString(){return name;}}
public class Main{
static void display(List<? extends CourseType> l){System.out.println("Types="+l.size());}
public static void main(String[]a){List<CourseType> list=Arrays.asList(new ExamCourse(),new AssignmentCourse());display(list);}
}