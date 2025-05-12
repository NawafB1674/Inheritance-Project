public class Stadium extends Facilities {
    private boolean watchingGame = false;
    private boolean touringTheStadium = false;

    public Stadium(String tName, String fName) {
        super(tName, fName);
    }

    public void tour() {
        touringTheStadium = true;
        System.out.println("You're now touring the beautiful SoFi Stadium!");
    }

    public void watchGame() {
        watchingGame = true;
        System.out.println("You're now watching a live Rams game! Go Rams!");
    }
}
