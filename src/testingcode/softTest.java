package testingcode;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import soft_2.calculater;





public class softTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test2numberpositive() {
		calculater c=new calculater();
		int x=10;
		int y=90;
				int res=c.add(x,y);
				assertTrue (res==100);
		
	}
	
	@Test
	public void test2numbernegative() {
		calculater c=new calculater();
		int x=-10;
		int y=-90;
				int res=c.add(x,y);
				assertTrue (res==-100);
		
	}
	@Test
	public void test2numberwithdiffsign() {
		calculater c=new calculater();
		int x=-10;
		int y=90;
				int res=c.add(x,y);
				assertTrue (res==80);
		
	}
	

}
