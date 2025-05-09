public class LockerRoom extends Facilities{
    private int lockerNum;

    public LockerRoom(String tName, String fName, int locker){
        super(tName,fName);
        lockerNum = locker;
    }

    public int getLockerNum(){
        return lockerNum;
    }

    @Override
    public String toString(){
        return "You have arrived at locker #"+getLockerNum();
    }
}
