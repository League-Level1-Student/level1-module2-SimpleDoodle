package _05_unit_tests;

import static org.junit.Assert.assertEquals;

public class UnitTest {
public static void main(String[] args) {
	
	boolean Michael = boy(true); 
	assertEquals(false, Michael);
}

private static boolean boy(boolean b) {
	return false;
}
}
