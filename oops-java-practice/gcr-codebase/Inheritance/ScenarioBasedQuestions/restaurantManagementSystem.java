interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is preparing meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving customers.");
    }
}

public class restaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Marco", "C001");
        Waiter waiter = new Waiter("Sarah", "W001");

        chef.performDuties();
        waiter.performDuties();
    }
}
