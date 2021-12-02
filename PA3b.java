package edu.wit.cs.comp1050;

/*
 * this program takes 6 numbers from the command line
 * @author liuf
 */
public class PA3b {
	
	/**
	 * Error to display if the command-line arguments are invalid
	 */
	public static final String ERR_USAGE = "Please supply 6 numbers (a-f).";
	
	/**
	 * Error to display if the equation has no solution
	 */
	public static final String ERR_NOSLTN = "The equation has no solution.";
	
	/**
	 * Number of required parameters (a-f)
	 */
	public static final int NUM_PARAMS = 6;
	
	/**
	 * Validates command-line arguments and returns
	 * parameters if valid
	 * 
	 * @param args command-line arguments
	 * @return if valid an array of parameters, else null
	 */
	public static double[] validateArgs(String[] args)
	{
		double [] a = new double[NUM_PARAMS];
		//checks to see if the args and the array length match up
		if(a.length != args.length)
		{
			return null;
		}
		else
		{
			//cycles through the array and adds the numbers to the array
			for(int i = 0; i < args.length; i++)
			{
				try
				{
					a[i] = Double.parseDouble(args[i]);
				}
				catch(Exception e)
				{
					return null;
				}
			}
		}
		return a; // replace with your code
	}

	/**
	 * Uses command-line arguments to create 
	 * an instance of the linear equation,
	 * and reports the outcome
	 * 
	 * @param args command-line arguments, interpreted as equation parameters
	 */
	public static void main(String[] args) 
	{
		//checks if the variable from the valudateArgs is null 
		if(validateArgs(args)==null)
		{
			System.out.println(ERR_USAGE);
			System.exit(1);
		}
		double [] a = validateArgs(args);
		//creates an object from the linear equation class
		LinearEquation b = new LinearEquation(a);
		if(! b.isSolvable())
		{
			System.out.println(ERR_NOSLTN);
		}
		else
		{
			System.out.printf("Solution: x=%.3f, y=%.3f%n", b.getX(), b.getY());
		}
	}

}
