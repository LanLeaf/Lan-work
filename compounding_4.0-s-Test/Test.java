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
	//测试当输入值为空时，计算结果提示请正确输入
	@org.junit.Test
	public void testReturn() {
		fuli_4 fuli = new fuli_4();
		boolean se = false;
		fuli.run();
		if(fuli.jLabel9.getText()=="请正确输入数据在执行运算"){
			se = true;
		}
		assertEquals(true,se);
	}
	
	//测试当输入值为0时，计算结果提示请正确输入
	@org.junit.Test
	public void testRun() {
		fuli_4 fuli = new fuli_4();
		boolean se = false;
		fuli.jTextField0.setText("0");
		fuli.jTextField1.setText("0");
		fuli.jTextField2.setText("0");
		fuli.run();
		if(fuli.jLabel9.getText()=="请正确输入数据在执行运算"){
			se = true;
		}
		assertEquals(true,se);
	}
}
