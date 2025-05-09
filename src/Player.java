public class Player {
    private String name;
    private String position;
    private int num;

    public Player(String name, String position, int num){
        name = "unknown";
        position = "unknown";
        num = 0;
            }

    public String getName(){
        return name;

    }
    public String getPosition(){
        return position;
    }
    public int getNum(){
        return num;
    }
}