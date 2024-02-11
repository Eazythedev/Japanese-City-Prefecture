package Main;

import java.util.Scanner;

    class Main {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner utility for reading input from various sources.
		System.out.println("Enter the name of a city: ");
		String cityName = scanner.nextLine().trim();
		
		switch(cityName) { // Use switch instead of creating a condition for each pair of cities
			case "Tokyo":
			case "Hachioji":
				System.out.println("The city of " + cityName + " is in Tokyo prefecture.");
				break;
			case "Nagoya":
			case "Okazaki":
			case "Toyohashi":
				System.out.println("The city of " + cityName + " is in Aichi prefecture.");
				break;
			case "Higashiosaka":
			case "Sakai":
			case "Osaka":
				System.out.println("The city of " + cityName + " is in Osaka prefecture.");
				break;
			case "Kanazawa":
			case "Hakusan":
				System.out.println("The city of " + cityName + " is in Ishikawa prefecture.");
				break;
			case "Gifu":
			case "Takayama":
				System.out.println("The city of " + cityName + " is in Gifu prefecture.");
				break;
			case "Asakuchi":
			case "Setouchi":
				System.out.println("The city of " + cityName + " is in Okayama prefecture.");
				break;
			case "Himeji":
				System.out.println("The city of " + cityName + " is in Hyogo prefecture.");
				break;
			case "Fukuyama":
			case "Kure":
				System.out.println("The city of " + cityName + " is in Hiroshima prefecture.");
				break;
			case "Ube":
			case "Hofu":
			case "Shimonoseki":
				System.out.println("The city of " + cityName + " is in Yamaguchi prefecture.");
				break;
			case "Sendai":
			case "Tagajou":
			case "Iwanuma":
				System.out.println("The city of " + cityName + " is in Miyagi prefecture.");
				break;
			case "Sapporo":
			case "Asahikawa":
				System.out.println("The city of " + cityName + " is in Hokkaido prefecture.");
				break;
		}
	}
}
