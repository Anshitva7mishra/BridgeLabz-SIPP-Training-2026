interface TextModeration {
    boolean checkOffensive(String post);
    default void displayModerationPolicy() {
        System.out.println("Text Policy: Abusive language is strictly prohibited.");
    }
    static boolean containsRestrictedWords(String post) {
        return post.toLowerCase().contains("abusive") || post.toLowerCase().contains("hate");
    }
}

interface SpamDetection {
    boolean checkSpam(String post);
    default void displayModerationPolicy() {
        System.out.println("Spam Policy: Excess promotional content will be flagged.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    @Override
    public boolean checkOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now") || post.toLowerCase().contains("click here") || post.toLowerCase().contains("free money");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class aiContentModeration {
    public static void main(String[] args) {
        String[] posts = {
            "Hello guys, have a great day!",
            "Click here to win free money now!",
            "This is abusive behavior from them.",
            "Buy now cheap products online!",
            "I love programming in Java."
        };

        ContentModerator moderator = new ContentModerator();
        moderator.displayModerationPolicy();
        System.out.println("\nAnalyzing Posts:");

        for (String post : posts) {
            boolean isSpam = moderator.checkSpam(post);
            boolean isOffensive = moderator.checkOffensive(post);
            String status;
            if (isSpam) {
                status = "Flagged as Spam";
            } else if (isOffensive) {
                status = "Flagged as Offensive";
            } else {
                status = "Valid Post";
            }
            System.out.println("\"" + post + "\" -> " + status);
        }
    }
}
