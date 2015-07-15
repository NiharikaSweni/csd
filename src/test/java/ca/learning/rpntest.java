package ca.learning;


import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import ca.learning.rpn;



@SuppressWarnings("deprecation")
public class rpntest extends TestCase{
	

	@Test
	public void testcheksum()
	{ String str="34 34 +"; 
	rpn rpn1 =new rpn();
		Assert.assertEquals(68,rpn1.checksum(str));
	}
		@Test
	public void testcheksum1()
	{ 
			String str="6 2 * 3 /"; 
	rpn rpn1 =new rpn();
	Assert.assertEquals(4,rpn1.checksum1(str));
	}
	
	boolean emp=true;
	@Test
	public void testchekempty()
	{ 
		String str=""; 
		rpn rpn1 =new rpn();
		Assert.assertEquals(emp,rpn1.checkepmty(str));
		System.out.println("Empty String");
		}

	


}
