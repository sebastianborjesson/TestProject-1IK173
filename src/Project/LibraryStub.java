package Project;

import java.util.ArrayList;
import java.util.List;

public class LibraryStub extends LibraryStore{

    ArrayList<Member> members = new ArrayList<>();


    public LibraryStub(){
        members = new ArrayList<Member>();
    }

    public void addMember(String fNamn, String eNamn, String rank, int pNummer){
        Member m = new Member(pNummer, fNamn, eNamn, rank);
        members.add(m);
    }

}
