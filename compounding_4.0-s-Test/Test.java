package fuli_4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
	}
	@org.junit.Test
	 public void testinit() {
        	fuli_4 fuli = new fuli_4();
	 	double f = fuli.init(100000,10,3);
		 Assert.assertEquals(f, 134390, 3.0);
	 }
	//测试当输入值为空时，计算结果返回0.0
	@org.junit.Test
	public void testReturn() {
		fuli_4 fuli = new fuli_4();
		boolean se = false;
		fuli.run();
		double f  = Double.parseDouble(fuli.jTextField3.getText());
		if(f==0.00){
			se = true;
		}
		assertEquals(true,se);
	}
}
