package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
	@Test(groups="smoke")
	public void mangoTest()
	{
		System.out.println("mango");
		System.out.println("apple");
	}
}
