import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockitoTest {

    @Mock
    List<String> mockedlist;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void mock_test1() {
        List mocklist = Mockito.mock(ArrayList.class);
        mocklist.add("one");
        Mockito.verify(mocklist).add("one");
        assertEquals(0, mocklist.size());
        Mockito.when(mocklist.size()).thenReturn(100);
        assertEquals(0, mocklist.size());

    }

    @Test
    public void mock_test2() {
        mockedlist.add("one");
        Mockito.verify(mockedlist).add("one");
        assertEquals(0, mockedlist.size());

        Mockito.when(mockedlist.size()).thenReturn(100);
        assertEquals(100, mockedlist.size());
    }
}
