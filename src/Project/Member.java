package Project;

import java.util.Date;

public class Member {
    private int ID;
    private int personalNum;
    private String firstName;
    private String lastName;
    private String rank;
    private int numOfLoans;
    private String [] borrowedBooks = new String[10];
    private boolean isSuspended=false;
    private int numOfSusp;
    private Date suspendedDate;

    public Member() {
        }


    public Member(int personalNum, String firstName, String lastName, String rank) {
        this.personalNum = personalNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public Member(int ID, int personalNum, String firstName, String lastName, String rank) {
        this.personalNum = personalNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public Member(int ID, int personalNum, String firstName, String lastName, String rank, int numOfLoans, boolean isSuspended, int numOfSusp, Date suspendedDate) {
        this.ID = ID;
        this.personalNum = personalNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
        this.numOfLoans = numOfLoans;
        this.isSuspended = isSuspended;
        this.numOfSusp = numOfSusp;
        this.suspendedDate = suspendedDate;
    }

    public boolean isSuspended() {
        return isSuspended;
    }

    public void setSuspended(boolean suspended) {
        isSuspended = suspended;
    }

    public Date getSuspendedDate() {
        return suspendedDate;
    }

    public void setSuspendedDate(Date suspendedDate) {
        this.suspendedDate = suspendedDate;
    }

    public Member(String fNamn, String eNamn, int pNummer) {
        this.firstName = fNamn;
        this.lastName = eNamn;
        this.personalNum = pNummer;
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

    public int getNumOfLoans() {
        return numOfLoans;
    }

    public void setNumOfLoans(int numOfLoans) {
        this.numOfLoans = numOfLoans;
    }

    public int getNumOfBans() {
        return numOfSusp;
    }

    public void setNumOfBans(int numOfBans) {
        this.numOfSusp = numOfBans;
    }
}
