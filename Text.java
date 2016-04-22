package name.feisky.android.test;
import android.test.AndroidTestCase;
import junit.framework.Assert;

public class PersonServiceTest extends AndroidTestCase{
	public void testSave()throws Exception{
		PersonService service=new PersonService();
		service.save(null);
	}
	//加法运算
	public void testAdd()throws Exception{
		PersonService service=new PersonService();
		int result=service.add(1, 2);
		Assert.assertEquals(3, result);
		Assert.assertEquals(2, result);
	}
	//减法运算
	public void testAdd1()throws Exception{
		PersonService service=new PersonService();
		int result=service.add1(1, 2);
		Assert.assertEquals(-1, result);
		Assert.assertEquals(0.5, result);
	}
	//乘法运算
	public void testAdd2()throws Exception{
		PersonService service=new PersonService();
		int result=service.add2(1, 2);
		Assert.assertEquals(2, result);
		Assert.assertEquals(3, result);
	}
	//除法运算
	public void testAdd3()throws Exception{
		PersonService service=new PersonService();
		int result=service.add3(1, 2);
		Assert.assertEquals(0.5, result);
		Assert.assertEquals(1, result);
	}
}

