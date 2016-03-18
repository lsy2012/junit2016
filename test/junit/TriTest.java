package junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class TriTest {
	 private double input1;
	 private double input2;
	 private double input3;
	 private double expected; 
	 private Triangle t = null;
	 
	 public TriTest(double input1,double input2,double input3,double expected){ 
	 this.input1 = input1;
	 this.input2 = input2;
	 this.input3 = input3;
	 this.expected = expected;
	 }
	 
	 @Before
	 public void setUp(){
	 t = new Triangle(); }
	 
	 @Parameters
	 public static Collection<Object[]> getData(){
	 return Arrays.asList(new Object[][]{ 
	 {1,1,1,3},
	 {2,3,5,0},
	 {3,3,3,3},
	 {2,2,3,2},
	 {3,4,5,1}
	 }); }
	 
	 @Test
	 public void testJudge() {
	 assertEquals(this.expected,t.Judge(input1, input2,input3),0);
	 
	/*@Test
	public void testJudge() {
		Triangle t = new Triangle(); 
        double configure=t.Judge(1,2,4); 
        assertEquals(3,configure,0); 
	}*/

}}
