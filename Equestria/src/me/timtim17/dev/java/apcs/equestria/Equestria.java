package me.timtim17.dev.java.apcs.equestria;

/**
 * A Java class for the Chapter 3 Lab: Equestria.
 * <br>
 * <br>
 * <a href="https://drive.google.com/file/d/0B-TdrHYrs1yhQm52TnlaYmtNZGM/view?usp=sharing" alt="Lab Specifications" title="Lab Specifications">Lab Specifications</a>
 * <br>
 * <a href="https://drive.google.com/file/d/0B-TdrHYrs1yhTUJQZFlHSWU0SU0/view?usp=sharing" alt="Map of Equestria" title="Map of Equestria">Map of Equestria</a>
 * 
 * @author Austin Jenchi (<a href="http://www.github.com/timtim17/" alt="GitHub" title="GitHub">timtim17</a>)
 */
public class Equestria {
	/**
	 * A method that, when run, will output some tests.
	 * 
	 * @param args Unused.
	 * @throws Exception if any methods within throws an Exception.
	 */
	public static void main(String[] args) throws Exception {
		/* Distance */
		System.out.println("Distance from Baltimare (31, 9); to Manehattan (34, 16) = " + distance(31,  9,  34,  16));
		System.out.println("Dinstance from Los Pegasus (6, 6) to Neighagra Falls (22, 18) = " + distance(6, 6, 22, 18));
		System.out.println("Distance from the Badlands (25, 3); to Ponyville (16, 11) = " + distance(25, 3, 16, 11));
		
		/* Princess Luna */
		// Her circular trip is a circle with a diameter of (27 - 10), which is 17.
		System.out.println("Distance for roadTrip = " + roadTrip(17));
		
		// Her triangular trip is a triangle at three cities: Baltimare (31, 9), Manehattan (34, 16), and Los Pegasus (6, 6)
		lunaTour(31, 9, 34, 16, 6, 6);
		
		System.out.println("The longest distance from A (" + 31 + ", " + 9 + "), B (" + 34 + ", " + 16 + "), and C (" + 6 + ", " + 6 + ") = " +
						   longestTrip(31, 9, 34, 16, 6, 6));
	}
	
	/**
	 * Calculates the distance between two points.
	 * 
	 * Uses the distance formula {@code distance = sqrt((x2-x1)^2 + (y2-y1)^2)}
	 * 
	 * @param x1 The x coordinate of the first point.
	 * @param y1 The y coordinate of the first point.
	 * @param x2 The x coordinate of the second point.
	 * @param y2 The y coordinate of the second point.
	 * @return The distance between the two points.
	 */
	public static double distance(double x1, double y1, double x2, double y2) {
		// return squareRoot((x2-x1)^2+(y2-y1)^2)
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	/**
	 * Returns the length of a circular road trip (the circumference of the circle).
	 * 
	 * @param diameter The diameter of the circle.
	 * @return The length of the trip (the circumference).
	 */
	public static double roadTrip(double diameter) {
		// return circumference
		// C = d*pi
		return diameter * Math.PI;
	}
		
	/**
	 * Prints the lengths and angles of a triangle with the passed in points.
	 * 
	 * @see City
	 * @see #distance(double, double, double, double)
	 * @see #angle(double, double, double)
	 * @see #angle(double, double, double, boolean)
	 * @param x1 The x coordinate of the first point.
	 * @param y1 The y coordinate of the first point.
	 * @param x2 The x coordinate of the second point.
	 * @param y2 The y coordinate of the second point.
	 * @param x3 The x coordinate of the third point.
	 * @param y3 The y coordinate of the third point.
	 */
	public static void lunaTour(double x1, double y1, double x2, double y2, double x3, double y3) {
		/*
		 * city 1 = (x1, y1) = a
		 * city 2 = (x2, y2) = b
		 * city 3 = (x3, y3) = c
		 */
		
		City a = new City(x1, y1),
			 b = new City(x2, y2),
			 c = new City(x3, y3);
		
		/*
		 * find the distance between a & b, b & c, c & a
		 */
		
		double ab = distance(a.getX(), a.getY(), b.getX(), b.getY()),
			   bc = distance(b.getX(), b.getY(), c.getX(), c.getY()),
			   ca = distance(c.getX(), c.getY(), a.getX(), a.getY());
		
		/* get the angles */
		
		try {
			double angleA = angle(bc, ca, ab, 1),
				   angleB = angle(bc, ca, ab, 2),
				   angleC = angle(bc, ca, ab, 3);
			
			System.out.println("Distance from A (" +
					   a.getX() + ", " + a.getX() + ") to B (" +
					   b.getX() + ", " + b.getY() + ") = " + ab);
			System.out.println("Distance from B (" +
					   		   b.getX() + ", " + b.getX() + ") to C (" +
					   		   c.getX() + ", " + c.getY() + ") = " + bc);
			System.out.println("Distance from C (" +
					   	       c.getX() + ", " + c.getX() + ") to A (" +
					   	       a.getX() + ", " + a.getY() + ") = " + ca);
			
			System.out.println("Angle for city A = " + angleA + " degrees");
			System.out.println("Angle for city B = " + angleB + " degrees");
			System.out.println("Angle for city C = " + angleC + " degrees");
		} catch (Exception e) {
			// Oops... there was a mistake.
			e.printStackTrace();
			return;
		}
	}
	
	/**
	 * Returns either the A, B, or C angle of a triangle given three lengths. Uses <a href="http://mathworld.wolfram.com/LawofCosines.html">The Law of Cosines</a>.
	 * 
	 * @throws Exception if an invalid whichAngle is passed in.
	 * @param lenA The length a of a triangle.
	 * @param lenB The length b of a triangle.
	 * @param lenC The length c of a triangle.
	 * @param whichAngle The angle value to return. A = 1, B = 2, C = 3
	 * @return The requested angle of the triangle in degrees.
	 */
	public static double angle(double lenA, double lenB, double lenC, int whichAngle) throws Exception {
		if(whichAngle < 1 || whichAngle > 3) {
			throw new Exception("Invald whichAngle. A = 1, B = 2, C = 3");
		}
		
		/*
		 * Law of cosines: http://mathworld.wolfram.com/LawofCosines.html
		 * a^2 = b^2 + c^2 - 2bc*cos(A)
		 * b^2 = a^2 + c^2 - 2ac*cos(B)
		 * c^2 = a^2 + b^2 - 2ab*cos(C)
		 *            |
		 *            |
		 *            |
		 *           \ /
		 *            v
		 * acos((-a^2 + b^2 + c^2) / 2bc) = A
		 * acos((a^2 - b^2 + c^2) / 2ac) = B
		 * acos((a^2 + b^2 - c^2) / 2ab) = C
		 */
		
		if(whichAngle == 1) {
			return Math.toDegrees(Math.acos((-Math.pow(lenA, 2) + Math.pow(lenB, 2) + Math.pow(lenC, 2)) / (2 * lenB * lenC)));
		} else if(whichAngle == 2) {
			return Math.toDegrees(Math.acos((Math.pow(lenA, 2) - Math.pow(lenB, 2) + Math.pow(lenC, 2)) / (2 * lenA * lenC)));
		} else {
			return Math.toDegrees(Math.acos((Math.pow(lenA, 2) + Math.pow(lenB, 2) - Math.pow(lenC, 2)) / (2 * lenA * lenB)));
		}
	}
	
	/**
	 * Same as {@link #angle(double, double, double, int)} but can optionally return radians.
	 * 
	 * @see #angle(double, double, double, int)
	 * @throws Exception if an invalid whichAngle is passed in.
	 * @param lenA The length a of a triangle.
	 * @param lenB The length b of a triangle.
	 * @param lenC The length c of a triangle.
	 * @param whichAngle The angle value to return. A = 1, B = 2, C = 3
	 * @param radians Whether to return radians or degrees.
	 * @return The requested angle of the triangle in either degrees or radians.
	 */
	public static double angle(double lenA, double lenB, double lenC, int whichAngle, boolean radians) throws Exception {
		double angleInDeg = angle(lenA, lenB, lenC, whichAngle);
		
		return radians ? Math.toRadians(angleInDeg) : angleInDeg;
	}
	
	/**
	 * 
	 * @throws Exception if {@link #longestTrip(double[][])} throws an exception.
	 * @see #longestTrip(double[][])
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @return
	 */
	public static double longestTrip(double x1, double y1, double x2, double y2, double x3, double y3) throws Exception {
		return longestTrip(new double[][] {{x1, y1}, {x2, y2}, {x3, y3}});
	}
	
	/**
	 * 
	 * @throws Exception if {@link #longestTrip(double[][])} throws an exception.
	 * @see #longestTrip(double[][])
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @param x4
	 * @param y4
	 * @return
	 */
	public static double longestTrip(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) throws Exception {
		return longestTrip(new double[][] {{x1, y1}, {x2, y2}, {x3, y3}, {x4, y4}});
	}
	
	/**
	 * 
	 * @see #distance(double, double, double, double)
	 * @param coords A list of coordinates in {@code [[x, y], ...]} form.
	 * @return The greatest distance returned from {@link #distance(double, double, double, double)}.
	 * @throws Exception if less than two coordinates given or each coordinate does not have exactly two points.
	 */
	public static double longestTrip(double[][] coords) throws Exception {
		/* Verify that there are enough coords of the correct length. */
		if(coords.length < 2) {
			throw new Exception("Not enough coords given. Min 2.");
		}
		
		for(double[] coord : coords) {
			if (coord.length != 2) throw new Exception("Invalid coord. Expecting length of 2.");
		}
		
		/*
		 * number of combinations = nCr = n!/(r!(n-r)!)
		 * n = coords.length
		 * r = 2 (2 coords per combo)
		 */
		int n = coords.length,
		    r = 2;
		double[] distances = new double[factorial(n) / (factorial(r) * factorial(n - r))];
		int index = 0;
		
		for(int i = 0; i < coords.length - 1; i++) {
			for(int j = i + 1; j < coords.length; j++) {
				distances[index] = distance(coords[i][0], coords[i][1], coords[j][0], coords[j][1]);
				index++;
			}
		}
		
		double max = 0;
		for(double d : distances) {
			if(d > max) max = d;
		}
		
		return max;
	}
	
	// http://stackoverflow.com/questions/891031/is-there-a-method-that-calculates-a-factorial-in-java
	private static int factorial(int n) {
        int fact = 1; // this  will be the result
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
	}
	
	/**
	 * A class to quickly store city coords.
	 */
	private static class City {
		private double x;
		private double y;
		
		public City(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public double getX() {return x;}
		
		public double getY() {return y;}
	}
}
