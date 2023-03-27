package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class matlibTest {
    
    @Test
    public void testisEven(int value){
        boolean result = matlib.isEven(8);
        assertTrue(result);
    }
}

