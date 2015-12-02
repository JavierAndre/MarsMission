package marsmission;

public class SRBEngineModel extends Stage2EngineModel {

	/*	
	 * Class Instance Variables
	 * 
	 */
	
	private int		diameter;			// Meters
	private int		length;				// Meters
	private int		weight;				// Kg
	private double	acceleration;		// Newtons per second
	private int		totalThurst;		// Newtons
	private double	totalImpulse;		// Newtons per second
	private String	propellent;
	
	/*
	 * Class Constants
	 * 
	 */

	// SRB
	public static final String 	SRB				 		= "SRB";	
	public static final int		BURN_TIME 				= 126;								// Seconds
	public static final int		DIAMETER 		 		= 12;								// Feet
	public static final int		LENGTH			 		= 177;								// Feet
	public static final int		WEIGHT			 		= 1600000;							// Pounds of weight
	public static final double	THRUST	 				= 3600000;							// Pounds of thrust per booster
	public static final double	TOTAL_THRUST	 		= 7200000;							// Pounds of thrust for 2 boosters
	public static final String	PROPELLENT		 		= "Polybutadiene Acrylonitrile";
	
	// British Imperial Units
	//
	// 1 pound-force per second squared is the force necessary to accelerate 1 pound-mass at the rate of 1 foot per second per second.
	public static final double	LB_FORCE_TO_NEWTON		= 4.44822;							// Newtons per pound-force per second squared
	public static final double	LBS_TO_KG	 			= 0.453592;
	public static final double	FEET_TO_METERS			= 0.3048;
	
	// SI Units
	//
	// The newton is the SI unit of force necessary to accelerate a one kilogram mass at a rate of one meter per second squared.	
	public static final double	NEWTON_TO_LB_FORCE		= 0.224809;							// Pounds-force per second squared
	public static final double  KG_TO_LBS				= 2.20462;
	
	// Other
	public static final double	EARTH_GRAVITY	 		= 9.807;							// Meters/sec squared
	
	/*
	 * Constructors
	 * 
	 */
	
	public SRBEngineModel(int type, String model, String organization, 
						  int diameter, int length, int weight, int totalThurst, String propellent) {

		super(type, model, organization);
		
		this.diameter 		= diameter;
		this.length 		= length;
		this.weight 		= weight;
		this.totalThurst 	= totalThurst;
		this.propellent 	= propellent;
		
		acceleration();
	}
	
	/*
	 * Acceleration in Newtons per second
	 * 
	 * acceleration = force / mass
	 * acceleration = Newtons / Kg
	 * 
	 */
	
	public double acceleration() {
		double mass 	= weightToMass(weight);
		double newtons 	= poundsToN(totalThurst);
		acceleration 	= newtons / mass;
		return acceleration;
	}

	/*
	 * Total Impulse
	 * 
	 * Total Impulse is obtained by multiplying thrust by time,
	 * the units are pound-seconds (lb-sec.), when English units are used,
	 * or Newton-seconds (N-s) when SI units are used.
	 */
	
	public double totalImpulse() {
		totalImpulse = THRUST * BURN_TIME;
		return totalImpulse;
	}
	
	/*
	 * Conversion methods
	 * 
	 */

	public static double feetToMeters(int feet) {
		return feet * FEET_TO_METERS;
	}
	
	public static double poundsToKg(double pounds) {
		return pounds * LBS_TO_KG;
	}
	
	public static double weightToMass(int kgs) {
		return kgs / EARTH_GRAVITY;
	}
	
	public static double poundsToN(int pounds) {
		return pounds * LB_FORCE_TO_NEWTON;
	}
}
