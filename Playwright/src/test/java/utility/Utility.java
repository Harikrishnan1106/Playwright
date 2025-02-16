package utility;

import org.apache.commons.text.RandomStringGenerator;

public class Utility {
	public static String generateRandomName() {
		
		RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z') // Generates only
																									// lowercase letters
				.build();
		String firstName = capitalize(generator.generate(6));
		return firstName;
	}

	private static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
	}
}
