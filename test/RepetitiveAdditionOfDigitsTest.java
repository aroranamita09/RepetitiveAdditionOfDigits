package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitiveAdditionOfDigitsTest {

    RepetitiveAdditionOfDigits obj;
    @Before
    public void setUp() throws Exception {
        obj = new RepetitiveAdditionOfDigits();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void checkIt()
    {
        assertEquals(2,obj.checkIt(2));
    }

    @Test
    public void summer() {
        assertEquals(2,obj.summer(2));
    }
}
