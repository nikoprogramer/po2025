import java.util.*;


public class lotto{
	public static void main(String[] args) {
		Random rand = new Random();
		
		Set<Integer> lottoNumbers = new HashSet<>();
		
		while (lottoNumbers.size() < 6) {
			int number = rand.nextInt(49) + 1;
			lottoNumbers.add(number);
		}
		
		List<Integer> sorted = new ArrayList<>(lottoNumbers);
		Collections.sort(sorted);
		
		System.out.println("Wylosowane liczby Lotto: " + sorted);
	}
}