package Training;

public class Main {
	public static void main(String[] args) {
		/*
		Read input from keyboard
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.print("Enter age: ");

		int num = myObj.nextInt();  // Read user input
		System.out.println("Factorial of " + num + " is " + fact(num));  // Output user input
		*/

		int num = 6;
		System.out.println("Factorial of " + num + " is " + tasks.fact(num));
		//Area calculation
		double area = tasks.area("circle", 5, 7);
		if (area != 0) {
			System.out.println("Area is " + area);
		} else {
			System.out.println("It is not possible to calculate area");
		}
		int[] input_array = {3, 3, 1, 1, 1, 1, 2};
		//Sort function
		tasks.sort(input_array);

		//Age check
		tasks.print_age(num);

		//Age check 2
		System.out.println(tasks.print_age1(num));

		//String to array
		tasks.string_to_array("sdsd fgfgg ioio");

		//string concat
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
		System.out.println(str3);

		int[] input_array1 = {3, 1};

		tasks.reverse(input_array1);
		tasks.second_largest_element(input_array);

		System.out.println("circle - " +  tasks.area(4));
		System.out.println("trinagle - " +  tasks.area(2, 1, 3));
		System.out.println("rectangle - " + tasks.area(4, 5));

		int[] input_array2 = {4, 1, 1, 2, -5, 0, 9, -1, 65, -10};
		int[] input_array3 = {-4, -5};
		int[] input_array4 = {4, 1, 1, 2, 9, 0, -5};
		double[] input_array5 = {-2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("Two positive numbers: " + tasks.two_positive_numbers(input_array2));
		tasks.count_and_product(input_array3);

		tasks.task003(input_array2);
		tasks.task004(input_array4);
		tasks.task005(input_array5);
		tasks.task006(input_array2);
		tasks.task007(input_array2);
		tasks.task008(input_array2);


	}




}