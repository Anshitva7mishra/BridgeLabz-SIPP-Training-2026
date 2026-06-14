import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = input.nextInt();
        
        String[][] stats = new String[games][3];
        int userWins = 0;
        int computerWins = 0;
        
        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter Rock, Paper, or Scissors: ");
            String userChoice = input.next();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            
            stats[i][0] = userChoice;
            stats[i][1] = computerChoice;
            stats[i][2] = winner;
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }
        
        String[][] finalStats = calculateStats(games, userWins, computerWins);
        displayResults(stats, finalStats);
        
        input.close();
    }
    
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);
        if (random == 0) return "Rock";
        if (random == 1) return "Paper";
        return "Scissors";
    }
    
    public static String getWinner(String user, String computer) {
        user = user.toLowerCase();
        computer = computer.toLowerCase();
        
        if (user.equals(computer)) {
            return "Tie";
        }
        
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
    public static String[][] calculateStats(int totalGames, int userWins, int computerWins) {
        double userPercentage = (double)userWins / totalGames * 100;
        double computerPercentage = (double)computerWins / totalGames * 100;
        
        String[][] stats = new String[2][2];
        stats[0][0] = "User Win %";
        stats[0][1] = String.format("%.2f%%", userPercentage);
        stats[1][0] = "Computer Win %";
        stats[1][1] = String.format("%.2f%%", computerPercentage);
        
        return stats;
    }
    
    public static void displayResults(String[][] gameStats, String[][] finalStats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-15s | %-15s | %-15s%n", "User Choice", "Computer Choice", "Winner");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < gameStats.length; i++) {
            System.out.printf("%-15s | %-15s | %-15s%n", gameStats[i][0], gameStats[i][1], gameStats[i][2]);
        }
        
        System.out.println("\nOverall Stats:");
        for (int i = 0; i < finalStats.length; i++) {
            System.out.println(finalStats[i][0] + ": " + finalStats[i][1]);
        }
    }
}
