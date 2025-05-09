public class Cafe extends Facilities{
    private String drink;
    private String food;

    public Cafe(String tName, String fName, String d, String f){
        super(tName,fName);
        drink = d;
        food = f;
    }

    public String getDrink(){
        return drink;
    }

    public String getFood(){
        return food;
    }




}
