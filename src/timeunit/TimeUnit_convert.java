package timeunit;

import java.util.concurrent.TimeUnit;

//-Converts the given time duration in the given unit to this unit.
//-Conversions from finer to coarser granularities truncate, solose precision.
// For example, converting 999 millisecondsto seconds results in 0.
//-Conversions from coarser tofiner granularities with arguments that would numerically overflow
// saturate to Long.MIN_VALUE if negative or Long.MAX_VALUE if positive. 

//For example, to convert 10 minutes to milliseconds, use: TimeUnit.MILLISECONDS.convert(10L, TimeUnit.MINUTES)
public class TimeUnit_convert {

	public TimeUnit_convert() {
		
		TimeUnit unit = TimeUnit.SECONDS;						//To what we want to convert
		long converted = unit.convert(60l, TimeUnit.MINUTES);
		
		System.out.println("60 minutes is " + converted + " seconds");
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new TimeUnit_convert();

	}

}
