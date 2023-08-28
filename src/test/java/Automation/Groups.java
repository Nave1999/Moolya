package Automation;

import org.testng.annotations.Test;

public class Groups {
@Test(groups="smoke" )
public void t1() {
	System.out.println("This is my first smoketest");
}
@Test(groups ="Regression")
public void t2() {
	System.out.println("This is my first Regression test");
}
@Test(groups="smoke" )
public void t3() {
	System.out.println("This is my second smoketest");
}
@Test(groups ="Regression")
public void t4() {
	System.out.println("This is my second Regression test");
}
}
