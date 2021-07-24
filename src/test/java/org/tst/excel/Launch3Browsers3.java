package org.tst.excel;

import org.testng.annotations.Test;

public class Launch3Browsers3 {
	
	@Test(priority=-10)
	public void tc0()
	{
		System.out.println("method 21"+Thread.currentThread());
	}
	@Test(priority=1)
	public void tc1()
	{
		System.out.println("method 22"+Thread.currentThread());
	}
	@Test(priority=10, invocationCount=3)
	public void tc2()
	{
		System.out.println("method 23"+Thread.currentThread());
	}
	@Test(priority=5,enabled=false)
	public void tc23()
	{
		System.out.println("method 24"+Thread.currentThread());
	}
	@Test()
	public void tc21()
	{
		System.out.println("method 25"+Thread.currentThread());
	}
	@Test()
	public void tc22()
	{
		System.out.println("dog 25"+Thread.currentThread());
	}
}
