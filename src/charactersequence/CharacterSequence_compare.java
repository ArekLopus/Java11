package charactersequence;

//-Compares two CharSequence instances lexicographically.
//-Returns anegative value, zero, or a positive value if the first sequence is lexicographically
// less than, equal to, or greater than the second, respectively. 

//The lexicographical ordering of CharSequence is defined as follows.
//Consider a CharSequence cs of length len to be a sequence of char values, cs[0] to cs[len-1].
//Suppose k is the lowest index at which the corresponding char values from each sequence differ.
//The lexicographic ordering of the sequences is determined by a numeric comparison of the char values cs1[k] with cs2[k].
//If there is no such index k, the shorter sequence is considered lexicographically less than the other.
//If the sequences have the same length, the sequences are considered lexicographically equal.
public class CharacterSequence_compare {

	public CharacterSequence_compare() {
		
		int compare1 = CharSequence.compare("girl", "boy");
		System.out.println(compare1);
		
		int compare2 = CharSequence.compare("girl", "girl");
		System.out.println(compare2);
		
		int compare3 = CharSequence.compare("hello", "world");
		System.out.println(compare3);
		
		System.out.println("\n--- Main Thread Finished ---");
	}

	public static void main(String[] args) {
		new CharacterSequence_compare();

	}

}
