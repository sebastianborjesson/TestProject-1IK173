package Project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LibrarianTest {

    private LibraryStore ls = mock(LibraryStore.class);
    private Librarian cut = new Librarian(ls);


    @Test
    void createAccount() {
       /* cut.createAccount(972379, " Bullen","korv","Student");

        when(ls.getAllMembers()).thenReturn(new Member[]{
                new Member(1234,972379, "Bullen","Korv","Student", 0,0,false,0,null)
        });
        assertEquals(cut.).addMember(1234,972379,"Bullen", "Korv", "Student");

        assertEquals();

        */


    }

    @Test
    void checkBanned() {
    }

    @Test
    void banMember() {
    }

    @Test
    void suspendMember() {
    }

    @Test
    void deleteMember() {
    }

    @Test
    void borrowBook() {

    }

    @Test
    void returnBook() {
    }
}