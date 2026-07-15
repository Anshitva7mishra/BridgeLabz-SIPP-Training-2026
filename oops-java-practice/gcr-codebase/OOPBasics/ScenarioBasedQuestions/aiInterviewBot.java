class InterviewBot {
    private String botName;
    private String technology;

    public InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    public void conductInterview() {
        System.out.println("Bot " + botName + " is conducting an interview on " + technology + ".");
    }
}

public class aiInterviewBot {
    public static void main(String[] args) {
        InterviewBot bot1 = new InterviewBot("InterviewerA", "Java");
        InterviewBot bot2 = new InterviewBot("InterviewerB", "Python");
        InterviewBot bot3 = new InterviewBot("InterviewerC", "React");

        bot1.conductInterview();
        bot2.conductInterview();
        bot3.conductInterview();
    }
}
