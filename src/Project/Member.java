package Project;

public class Member {
    private int ID;
    private int personalNum;
    private String firstName;
    private String lastName;
    private String rank;
    private int [] numOfLoans = new int[10];
    private String [] borrowedBooks = new String[10];
    private boolean isBanned;
    private int numOfBans;

    public Member() {
    }

    public Member(String firstName, String lastName, String rank, int personalNum) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.rank=rank;
        this.personalNum=personalNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPersonalNum() {
        return personalNum;
    }

    public void setPersonalNum(int personalNum) {
        this.personalNum = personalNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int[] getNumOfLoans() {
        return numOfLoans;
    }

    public void setNumOfLoans(int[] numOfLoans) {
        this.numOfLoans = numOfLoans;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    public int getNumOfBans() {
        return numOfBans;
    }

    public void setNumOfBans(int numOfBans) {
        this.numOfBans = numOfBans;
    }
}