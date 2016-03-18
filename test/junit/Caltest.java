package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Caltest {

	@Test
	public void testAdd() {
		Calcuator calcuator=new Calcuator(); 
        double result=calcuator.add(1,2); 
        assertEquals(3,result,0); 
	}

	
}
