import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class employeeSkillAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of skill scores: ");
        int n = input.nextInt();
        int[] skills = new int[n];
        System.out.println("Enter skill scores:");
        for (int i = 0; i < n; i++) {
            skills[i] = input.nextInt();
        }
        System.out.print("Enter target: ");
        int target = input.nextInt();
        
        List<Integer> currentTeam = new ArrayList<>();
        findTeams(skills, target, 0, currentTeam);
        input.close();
    }

    public static void findTeams(int[] skills, int target, int index, List<Integer> currentTeam) {
        if (target == 0) {
            System.out.println(currentTeam);
            return;
        }
        if (target < 0 || index == skills.length) {
            return;
        }
        
        findTeams(skills, target, index + 1, currentTeam);
        
        currentTeam.add(skills[index]);
        findTeams(skills, target - skills[index], index + 1, currentTeam);
        
        currentTeam.remove(currentTeam.size() - 1);
    }
}
