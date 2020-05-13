package Project;

public class Meny extends Librarian {
    public static void main(String[] args) {


/*
        Librarian lb= new Librarian();
        LibraryStub lbs=new LibraryStub();
        lb.createAccount(lbs,"Joakim", "Österberg","Student",12345);
        lb.createAccount(lbs,"Joakim", "Österberg","Student",12348);
        lb.createAccount(lbs,"Joakim", "Österberg","Student",12342);
        System.out.println(lb.getMedlem());*/

        LibraryStore lbs= new LibraryStore();
        for (BannedMembers bm: lbs.getAllBannedMembers()) {
            System.out.println(bm.getID());

        }
        //lbs.getAllBannedMembers(1234567890);


        }
    }

