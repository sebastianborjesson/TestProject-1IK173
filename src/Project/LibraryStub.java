package Project;

import java.util.ArrayList;
import java.util.List;

public class LibraryStub extends LibraryStore{

    List<Member> members = null;


    public void MemberStub(){
        members = new ArrayList<Member>();
    }

    public void addMember(String fNamn, String eNamn, int pNummer){
        Member m = new Member(fNamn, eNamn, pNummer);
        members.add(m);

    }

}
