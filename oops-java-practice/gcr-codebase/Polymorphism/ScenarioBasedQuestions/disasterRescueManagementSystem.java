abstract class RescueTeam {
    private String teamId;
    private String location;

    public RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getLocation() {
        return location;
    }

    public abstract void performDuty();
}

class MedicalTeam extends RescueTeam {
    public MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("MedicalTeam " + getTeamId() + " at " + getLocation() + " is providing first aid and medical care.");
    }
}

class FireRescueTeam extends RescueTeam {
    public FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("FireRescueTeam " + getTeamId() + " at " + getLocation() + " is extinguishing fires and rescuing survivors.");
    }
}

class FoodSupplyTeam extends RescueTeam {
    public FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("FoodSupplyTeam " + getTeamId() + " at " + getLocation() + " is distributing food and drinking water.");
    }
}

public class disasterRescueManagementSystem {
    public static void findTeamByLocation(RescueTeam[] teams, String location) {
        System.out.println("\nSearching for teams at location: " + location);
        boolean found = false;
        for (RescueTeam t : teams) {
            if (t.getLocation().equalsIgnoreCase(location)) {
                t.performDuty();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No teams found at location: " + location);
        }
    }

    public static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("\nTeams with ID prefix \"" + prefix + "\":");
        boolean found = false;
        for (RescueTeam t : teams) {
            if (t.getTeamId().startsWith(prefix)) {
                System.out.println("- ID: " + t.getTeamId() + " | Location: " + t.getLocation() + " | Type: " + t.getClass().getSimpleName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No teams found with ID prefix: " + prefix);
        }
    }

    public static void countAndDisplayMaxDeployments(RescueTeam[] teams) {
        int medical = 0, fire = 0, food = 0;
        for (RescueTeam t : teams) {
            if (t instanceof MedicalTeam) medical++;
            else if (t instanceof FireRescueTeam) fire++;
            else if (t instanceof FoodSupplyTeam) food++;
        }

        System.out.println("\n--- Deployments Count ---");
        System.out.println("Medical Teams: " + medical);
        System.out.println("Fire Rescue Teams: " + fire);
        System.out.println("Food Supply Teams: " + food);

        int max = Math.max(medical, Math.max(fire, food));
        System.out.print("Category with maximum deployments: ");
        if (max == medical && max == fire && max == food) {
            System.out.println("All categories are tied with " + max + " deployments.");
        } else {
            boolean first = true;
            if (max == medical) {
                System.out.print("MedicalTeam");
                first = false;
            }
            if (max == fire) {
                if (!first) System.out.print(", ");
                System.out.print("FireRescueTeam");
                first = false;
            }
            if (max == food) {
                if (!first) System.out.print(", ");
                System.out.print("FoodSupplyTeam");
            }
            System.out.println(" (" + max + " deployments)");
        }
    }

    public static void main(String[] args) {
        RescueTeam[] teams = new RescueTeam[6];
        teams[0] = new MedicalTeam("MED01", "New York");
        teams[1] = new FireRescueTeam("FIR01", "New York");
        teams[2] = new FoodSupplyTeam("FOD01", "Boston");
        teams[3] = new MedicalTeam("MED02", "Chicago");
        teams[4] = new FoodSupplyTeam("FOD02", "New York");
        teams[5] = new MedicalTeam("MED03", "Boston");

        System.out.println("Performing Duties Polymorphically:");
        for (RescueTeam t : teams) {
            t.performDuty();
        }

        findTeamByLocation(teams, "New York");
        displayTeamsByPrefix(teams, "MED");
        countAndDisplayMaxDeployments(teams);
    }
}
