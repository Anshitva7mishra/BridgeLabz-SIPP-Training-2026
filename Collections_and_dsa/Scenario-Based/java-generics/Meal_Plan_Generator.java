interface MealPlan{
    String name();
}
class VegetarianMeal implements MealPlan{
    public String name(){
        return "Vegetarian";
    }
}
class VeganMeal implements MealPlan{
    public String name(){
        return "Vegan";
    }
}
class KetoMeal implements MealPlan{
    public String name(){
        return "Keto";
    }
}
class Meal<T extends MealPlan>{
    T plan;
    Meal(T p){
        plan=p;
    }
}
public class Main{
static <T extends MealPlan> void generate(Meal<T> m){
    System.out.println("Generated "+m.plan.name());
}

public static void main(String[]a){
    generate(new Meal<>(new VeganMeal()));
}
}