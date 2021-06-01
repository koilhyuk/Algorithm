package programers.step2;

public class PhoneNumberList {
	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421" };

		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (i != j) {
					if (phone_book[j].startsWith(phone_book[i]) == true) {
						answer = false;
						System.err.println(answer);
					}
					
					
				}
			}
		}
		System.err.println(answer);
	}
}
