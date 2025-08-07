package ru.task.java.chapter6.task14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ImprovedVersionCloseAllMethodTest {

    @Test
    void testAllCloseSuccessfully() throws Exception {
        AutoCloseable mock1 = mock(AutoCloseable.class);
        AutoCloseable mock2 = mock(AutoCloseable.class);
        ArrayList<AutoCloseable> elems = new ArrayList<>();
        elems.add(mock1);
        elems.add(mock2);
        ImprovedVersionCloseAllMethod.closeAll(elems);
        verify(mock1).close();
        verify(mock2).close();
    }

    @Test
    void testOneThrowsException() throws Exception {
        AutoCloseable mock1 = mock(AutoCloseable.class);
        AutoCloseable mock2 = mock(AutoCloseable.class);
        doThrow(new RuntimeException("fail1")).when(mock1).close();
        doNothing().when(mock2).close();
        ArrayList<AutoCloseable> elems = new ArrayList<>();
        elems.add(mock1);
        elems.add(mock2);
        Exception thrownException = null;
        try {
            ImprovedVersionCloseAllMethod.closeAll(elems);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            thrownException = e;
        }
        assertNotNull(thrownException);
        assertTrue(thrownException instanceof RuntimeException || thrownException.getCause() != null);
        assertEquals(0, thrownException.getSuppressed().length);
        assertEquals("fail1", thrownException.getMessage());
    }

    @Test
    void testMultipleExceptions() throws Exception {
        AutoCloseable mock1 = mock(AutoCloseable.class);
        AutoCloseable mock2 = mock(AutoCloseable.class);
        doThrow(new RuntimeException("fail1")).when(mock1).close();
        doThrow(new RuntimeException("fail2")).when(mock2).close();
        ArrayList<AutoCloseable> elems = new ArrayList<>();
        elems.add(mock1);
        elems.add(mock2);
        Exception thrownException = null;
        try {
            ImprovedVersionCloseAllMethod.closeAll(elems);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            thrownException = e;
        }
        assertNotNull(thrownException);
        assertTrue(thrownException instanceof RuntimeException || thrownException.getCause() != null);
        Throwable[] suppressed = thrownException.getSuppressed();
        assertEquals(1, suppressed.length);
        String[] messages = {suppressed[0].getMessage()};
        assertTrue(messages[0].equals("fail2") || messages[0].equals("fail1"));
    }

    @Test
    void testNullElementsAreSkipped() throws Exception {
        AutoCloseable mock1 = mock(AutoCloseable.class);
        ArrayList<AutoCloseable> elems = new ArrayList<>();
        elems.add(null);
        elems.add(mock1);
        ImprovedVersionCloseAllMethod.closeAll(elems);
        verify(mock1).close();
    }
}

