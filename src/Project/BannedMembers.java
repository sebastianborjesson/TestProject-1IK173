package Project;

public class BannedMembers {
    private int personalNum;
    private int ID;

    public BannedMembers(){

    };

    public BannedMembers(int PM, int ID) {
        this.personalNum = PM;
        this.ID = ID;
    }

    public int getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(int personalNum) {
        this.personalNum = personalNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
