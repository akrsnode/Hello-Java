import tst.classes.ex.Person;
import tst.classes.ex.Smartphone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/********************************
 * Created by Alex S.
 * on 19.11.2020
 *******************************/
public class Main {

	static int smt;

	public static void main(String[] args) {
		System.out.println("The app start here ...");
		System.out.println("----------||----------");


		Person muleder = new Person();

		//declarationAndInitialization();
		//goodAndBadVariableNames();
		//goodAndBadComments();
		//operators();
		//dataTypes();
		//comparison();
		//cycles();

		//classesAndInstances();
		//stringClass();
		//scanner();
		//collections();
		//enums();
		//oop();
		//objectComparison();
		//generics();
		//patternAndMatcher();

		//exceptions();
		//io();
		//serializationAndDeserialization();
		//properties();
		//threads();

		System.out.println("----------||---------");
		System.out.println("... The app ends here");
	}


	// part 1
	public static void declarationAndInitialization() {
		// deklaracja zmiennej
		String declaredButNotInitialized;

		// inicjalizacja zmiennej zmiennej
		declaredButNotInitialized = "a value 1";

		// deklaracja + inicjalizacja
		String declaredAndInitialized = "a value 2";

		// deklaracja + inicjalizacja null'em
		String declaredAndInitializedWithNull = null;

		System.out.println("Value of a variable = " + smt);
	}

	public static void goodAndBadVariableNames() {
		// Good naming:
		String userName;
		String externalCategoryList;
		String skuThatShouldBeExcluded;

		// Bad naming:
		String a;
		String b1;
		String isCorrect = "5";
	}

	public static void goodAndBadComments() {
		// Good comment
		/*
			We use multiplier of 5 due to business price change due to 13.11.18,
			Ticket in Jira: JIR-1003
		 */
		Integer priceMultiplier = 5;

		// Bad comment:
		/*
			Here we declare priceMultiplier variable
		 */
		Integer anotherPriceMultiplier = 5;
	}

	public static void operators(){

	}

	public static void dataTypes() {
		String name;
		char charElement;

		byte byteNumber;
		short shortNumber = 1;
		int number = 1;
		long longNumber;

		// smaller number can be assigned to a bigger number, but not a back around
		// number = shortNumber; // ok
		// shortNumber = number; // fail

		longNumber = 100000;

		float floatNumber;
		double doubleNumber;

		floatNumber = (float)1.1d;

		boolean correct;
	}

	public static void comparison() {
		int productPrice = 500;
		int payed = 400;

		String name = "samsung";

		if(productPrice == payed) {
			// ... A
		}

		if(productPrice == payed) {
			// ... A
		} else {
			// ... B
		}

		if(productPrice == payed) {
			// ... A
		} else if(productPrice < payed) {
			// ... B.1
		} else if(productPrice > payed) {
			// ... B.2
		} else {
			// ... C
		}

		String result;

		switch(name) {
			case "samsung":
				result = "Korea";
				break;

			case "iphone":
				result = "USA";
				break;

			default:
				result = "Unknown";
		}

		// very nasty case
		int nastyResult = 0;

		switch(name) {
			case "samsung":
				nastyResult += 1;

			case "iphone":
				nastyResult += 2;

			default:
				nastyResult += 3;
		}

		System.out.println("Name = " + name + ", nastyResult = " + nastyResult);
	}

	public static void cycles() {
		int counter = 10;

		for(int i = 0; i < counter; i++) {
			System.out.println("i = " + i);
		}

		boolean falseValue = false;

		while (falseValue) {
			System.out.println("we wont see it");
		}

		do {
			System.out.println("at least once");
		} while (falseValue);
	}

	// part 2
	public static void classesAndInstances() {
		Smartphone iphone = new Smartphone("iPhone 13", "BL12312", 3750, true);
		Smartphone samsung = new Smartphone("Samsung G21", "SG215", 4500, true);

		iphone.getCalculatedTimeBeforeTheNextRecharge();
	}

	public static void stringClass() {

	}

	public static void scanner() {
		//Scanner scan = new Scanner(System.in);
		//System.out.println(scan.next());
	}

	public static void collections(){
//		List<String> stringElements = Arrays.asList("", "");
//		LinkedList<String> stringElements = new LinkedList<>();
//		Set<String> stringElements = new HashSet<>();
//		Map<String, String> exMap = new TreeMap<>();
//		exMap.put("c", "value");
//		exMap.put("d", "value");
//		exMap.put("a", "value");
//		exMap.put("b", "value");
//
//		System.out.println(exMap);
	}

	public static void enums() {}

	public static void oop() {}

	public static void objectComparison() {}

	public static void generics() {}

	public static void patternAndMatcher() {
//		final String TEXT = "This 123 is a 123 String";
//		String regex = "[0-9]+";

		final String TEXT = "11.11.11, EUR=4.1, USD=3.3, SEK=2.2;" +
			"12.11.11, EUR=4.2, USD=3.3, SEK=2.2;13.11.11, EUR=4.5, USD=3.3, SEK=2.2;" +
			"14.11.11, EUR=5.2, USD=3.3, SEK=2.2;15.11.11, EUR=3.2, USD=3.3, SEK=2.2;16.11.11, EUR=1.2, USD=3.3, SEK=2.2;";
		String regex = "[0-9]{2}\\.[0-9]{2}\\.[0-9]{2}, EUR=[0-9]\\.[0-9]";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(TEXT);

//		while(matcher.find()) {
//			System.out.println(matcher.start() + " - " + matcher.end());
//		}

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

	// part 3
	public static void exceptions() {}

	public static void io() {}

	public static void serializationAndDeserialization() {}

	public static void properties() {}

	public static void threads() {}
}
