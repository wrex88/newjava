public class Main {

	public static void main(String[] args) {
		//TODO: result(1;5)
		/*
		   1 + 2 + 3 + 4 + 5 = 15

		   1 + 2 = 3
		   3 + 3 = 6
		   6 + 4 = 10
		   10 + 5 = 15
		*/

		// int result = 1;
		// for (int i = 2; i <= 5; i++) {
		// 	result = result + i;
		// 	if (result % 2 == 0) {
		// 		System.out.println("����� " + result + " �������� ������");
		// 	} else {
		// 		System.out.println("����� " + result + " �������� ��������");
		// 	}
	
		// }		


		// int i = 2;
		// int result = 1;
		// while(i <= 5) {
		// 	result = result + i;
		// 	if (result % 2 == 0) {
		// 		System.out.println("����� " + result + " �������� ������");
		// 	} else {
		// 		System.out.println("����� " + result + " �������� ��������");
		// 	}
		// 	i++;
		// }

		int i = 2;
		int result = 1;
		do {
			result = result + i;
			if (result % 2 == 0) {
				System.out.println("����� " + result + " �������� ������");
			} else {
				System.out.println("����� " + result + " �������� ��������");
			}
			i++;
		} while(i <= 5);
		
		System.out.println("1 + 2 + 3 + 4 + 5 = " + result);
	}
}