interface StreamingService {
    void playMovie(String movie);
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service: Premium Account Active.");
    }
}

interface GamingService {
    void playGame(String game);
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service: GamePass Ultra Active.");
    }
}

class SmartTV implements StreamingService, GamingService {
    @Override
    public void playMovie(String movie) {
        System.out.println("SmartTV: Streaming movie -> " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("SmartTV: Launching game -> " + game);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class multiServiceSmartTV {
    public static void main(String[] args) {
        String[] movies = {"Inception", "Interstellar", "The Dark Knight"};
        String[] games = {"Halo", "Forza", "Fifa"};

        SmartTV tv = new SmartTV();
        tv.showSubscriptionDetails();
        System.out.println();

        for (String m : movies) {
            tv.playMovie(m);
        }
        for (String g : games) {
            tv.playGame(g);
        }
    }
}
