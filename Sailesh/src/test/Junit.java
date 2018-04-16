package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class Junit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("sailesh");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		

		System.out.println("mom");
	}

	@Before
	public void setUp() throws Exception {
		

		System.out.println("sarathi");
	}

	@After
	public void tearDown() throws Exception {
		

		System.out.println("medecare");
	}

	@Test
	public void test() {

		System.out.println("healthcare");
	}

}
