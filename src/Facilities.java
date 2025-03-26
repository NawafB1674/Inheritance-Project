public class Facilities {
    
    private String teamName;
    private String facilityName;

    public Facilities(String tName, String fName){
        teamName = tName;
        facilityName = fName;
        
    }

    public String getTeamName(){
        return teamName;
    }
    
    public String getFacilityName(){
        return facilityName;
    }


    public String toString(){
        return "Welcome to the home of the " + getTeamName() + ". We hope you enjoy your tour.";
    }
}
