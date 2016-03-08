/**
 * Given a number <i>n</i>, print the number:
 *
 * <ul>
 *   <li>If it is divisible by 3 return "fizz"</li>
 *   <li>If it is divisible by 5 return "buzz"</li>
 *   <li>If it is divisible by 15 return "fizzbuzz"</li>
 *   <li>Otherwise, return the number as a string</li>
 * </ul>
 *
 * @author Ron Ziroby Romero
 *
 */
public class FizzBuzzer {

	public String buzz(Integer n) {
		if (isDivisibleBy(n, 3 * 5)) {
			return "fizzbuzz";
		}
		if (isDivisibleBy(n, 3)) {
			return "fizz";
		}
		if (isDivisibleBy(n, 5)) {
			return "buzz";
		}
		return n.toString();
	}

	/**
	 * Is n divisible by divisor>
	 *
	 * @param n -- the number to check
	 * @param divisor -- the number to divide by
	 * @return whether n is divisible by divisor
	 */
	private boolean isDivisibleBy(int n, int divisor) {
		return (n % divisor) == 0;
	}

}
