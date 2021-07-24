package org.tst.excel;

import org.testng.annotations.Test;

public class Launch3Browsers2 {
	
	@Test(priority=-10)
	public void tc0()
	{
		System.out.println("method 11"+Thread.currentThread());
	}
	@Test(priority=1)
	public void tc1()
	{
		System.out.println("method 21"+Thread.currentThread());
	}
	@Test(priority=10, invocationCount=3)
	public void tc2()
	{
		System.out.println("method 13"+Thread.currentThread());
	}
	@Test(priority=5,enabled=false)
	public void tc23()
	{
		System.out.println("method 14"+Thread.currentThread());
	}
	@Test()
	public void tc21()
	{
		System.out.println("method 5"+Thread.currentThread());
	}
}
