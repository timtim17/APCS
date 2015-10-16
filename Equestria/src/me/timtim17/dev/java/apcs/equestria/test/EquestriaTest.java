package me.timtim17.dev.java.apcs.equestria.test;

import static org.junit.Assert.*;

import org.junit.Test;

import me.timtim17.dev.java.apcs.equestria.Equestria;

public class EquestriaTest {

	@Test
	public void testDistance() {
		assertEquals(7.615773105863909, Equestria.distance(31, 9, 34, 16), 1D);
		assertEquals(20, Equestria.distance(6, 6, 22, 18), 1D);
		assertEquals(12.041594578792296, Equestria.distance(25, 3, 16, 11), 1D);
	}

	@Test
	public void testRoadTrip() {
		assertEquals(53.40707511102649, Equestria.roadTrip(17), 1D);
	}

	@Test
	public void testAngle() throws Exception {
		// http://www.mathsisfun.com/algebra/trig-cosine-law.html
		// TODO: Make test cases with specific values.
		Equestria.angle(9, 5, 8, 1);
		Equestria.angle(9, 5, 8, 2);
		assertEquals(62.2, Equestria.angle(9, 5, 8, 3), 1D);
	}
	
	@Test(expected=Exception.class)
	public void testAngleExceptionLessThanOne() throws Exception {
		Equestria.angle(0, 0, 0, 0);
	}
	
	@Test(expected=Exception.class)
	public void testAngleExceptionGreaterThanThree() throws Exception {
		Equestria.angle(0, 0, 0, 4);
	}
	
	@Test
	public void testAngleRadiansFalse() throws Exception {
		// TODO: Make test cases with specific values.
		Equestria.angle(9, 5, 8, 1, false);
		Equestria.angle(9, 5, 8, 2, false);
		assertEquals(62.2, Equestria.angle(9, 5, 8, 3, false), 1D);
	}

	@Test
	public void testAngleRadiansTrue() throws Exception {
		// TODO: Make test cases with specific values.
		Equestria.angle(9, 5, 8, 1, true);
		Equestria.angle(9, 5, 8, 2, true);
		assertEquals(1.085595, Equestria.angle(9, 5, 8, 3, true), 1D);
	}

	@Test
	public void testLongestTripThreeCoords() {
		fail("Not yet implemented");
	}

	@Test
	public void testLongestTripFourCoords() {
		fail("Not yet implemented");
	}

	@Test
	public void testLongestTripCoordArray() {
		fail("Not yet implemented");
	}
	
	@Test(expected=Exception.class)
	public void testLongestTripCoordArrayInvalidLength() throws Exception {
		Equestria.longestTrip(new double[][]{{1, 0}});
	}
	
	@Test(expected=Exception.class)
	public void testLongestTripCoordArrayInvalidCoord() throws Exception {
		Equestria.longestTrip(new double[][]{{1, 0}, {0}});
	}
}
