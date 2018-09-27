package time;

import java.time.chrono.JapaneseDate;

//The Japanese Imperial Era is scheduled to change to the new era on May 1st, 2019.
public class JapaneseNewEra {

	public JapaneseNewEra() {
		
		JapaneseDate date1 = JapaneseDate.of(2018, 5, 1);
		System.out.println(date1);
		
		JapaneseDate date2 = JapaneseDate.of(2019, 5, 1);
		System.out.println(date2);
		
		
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new JapaneseNewEra();

	}

}
