package edu.wit.cs.comp1050;

/*
 * this program takes command line arugments
 * and prints out the result based on the arguments 
 * @author liuf
 */
public class PA3c {
	
	/**
	 * Error to display if the command-line arguments are invalid
	 */
	public static final String ERR_USAGE = "Please supply 2 numbers (x y).";
	
	/**
	 * Computes the distance using three methods
	 * from the origin to a point supplied via
	 * command-line arguments
	 * 
	 * @param args command-line args: x y
	 */
	public static void main(String[] args) {
		
		// replace the following line
		// with whatever code you see fit
		// in order to validate command-line
		// arguments and, if valid, construct
		// p via the two doubles supplied
		try
		{
			//checks to see if there are 2 inputs
			  if(args.length==2){
		            Point2D  a = new Point2D();
		            Point2D  b = new Point2D(Double.parseDouble(args[0]),Double.parseDouble(args[1]));

		            System.out.println("Point 1: "+ a);
		            System.out.println("Point 2: "+ b);
		            System.out.println("Static method distance: "+String.format("%.3f",Point2D.distance(a,b)));
		            System.out.println("Distance from P1: "+String.format("%.3f",a.distanceTo(b)));
		            System.out.println("Distance from P2: "+String.format("%.3f",b.distanceTo(a)));
		            System.exit(0);
		        }
			  //checks to see if there are 4 inputs
		        else if(args.length==4){
		            Point2D  a = new Point2D(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
		            Point2D  b = new Point2D(Double.parseDouble(args[2]),Double.parseDouble(args[3]));
		            System.out.println("Static method distance: "+String.format("%.3f",Point2D.distance(a,b)));
		            System.out.println("Distance from P1: "+String.format("%.3f",a.distanceTo(b)));
		            System.out.println("Distance from P2: "+String.format("%.3f",b.distanceTo(a)));
		            System.exit(0);

		        }
		        else{
		            System.out.println(ERR_USAGE);
		            System.exit(0);
		        }

		  
		   final Point2D p = new Point2D();
		   
		//////////////////////////////////////
		// !! DO NOT CHANGE THE LINES BELOW !!
		// 
		// They assume p has been
		// properly constructed and perform
		// all necessary output for the
		// program
		//////////////////////////////////////
		final Point2D o = new Point2D();
		System.out.printf("Point 1: %s%n", o);
		System.out.printf("Point 2: %s%n", p);
		System.out.printf("Static method distance: %.3f%n", Point2D.distance(o, p));
		System.out.printf("Distance from P1: %.3f%n", o.distanceTo(p));
		System.out.printf("Distance from P2: %.3f%n", p.distanceTo(o));
		}
		//catches the exception error
		catch(NumberFormatException ex)
		{
			System.out.println(ERR_USAGE);
		}
	}

}
