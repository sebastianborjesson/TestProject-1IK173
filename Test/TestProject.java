import Project.Librarian;
import Project.LibraryStore;
import Project.Member;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;


public class TestProject {

    @Test
    public void testCreteAccount() {
        LibraryStore ls = mock(LibraryStore.class);
        Librarian cut = new Librarian(ls);

        cut.createAccount("hej","hej", 123);

        when(ls.getAllMembers()).thenReturn( new Member[]{ new Member("hej","hej",123)});

        verify(ls).getMember("hej", "hej",123);

    }
}
