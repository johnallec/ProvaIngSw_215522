package main_package;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.joda.time.JodaTimePermission;


public class MyListUtilTest {
	
	private static MyListUtil mlu;
	
	@BeforeClass
	public static void init() {
		mlu = new MyListUtil();
	}
	
	@Before
	public static void before() {
		System.out.println("Test starts at -> " + LocalDate.now());
	}
	
	@After
	public static void after() {
		System.out.println("Test ends at -> " + LocalDate.now());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void MyListUtilWorkIncrease() {
		Object[] array = {3,2,4,5,1,6,7,8};
		Object[] expected = {1,2,3,4,5,6,7,8};
		assertEquals(expected,mlu.sort(array,0));
		Object[] expected2 = {8,7,6,5,4,3,2,1};
		assertEquals(expected2,mlu.sort(array,1));
	}
	
	@SuppressWarnings("deprecation")
	@Test(timeout = 100)
	public void MyListUtilWorkInTime() {
		Object[] array = new Object[10000];
		for(int i=array.length, j=0; i > 0; --i,++j) {
			array[j]=i;
		}
		Object[] expected = new Object[array.length];
		for(int i=0; i < array.length; ++i) {
			expected[i]=i+1;
		}
		assertEquals(expected,mlu.sort(array,0));
		assertEquals(array,mlu.sort(array,1));
	}
	
	@AfterClass
	public static void done() {
		System.out.println("All Done! -> " + LocalDate.now());
	}
}
