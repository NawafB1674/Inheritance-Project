public class Weightroom extends Facilities{
    private String excercise;
    private String excerciseEquipment;
    
    public Weightroom(String tName, String fName, String exercise, String equipment){
        super(tName,fName);
        excercise = exercise;
        excerciseEquipment = equipment;
    }
public String getExcercise(){
    return excercise;
}

public String getEquipment(){
    return excerciseEquipment;
}


}