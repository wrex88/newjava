public class MyFirstGame {

	public static void main(String[] args) {
		int compNumber = 87;
		int userNumber = 40;

		System.out.println("��������� ������� ����� " + compNumber);
		while (userNumber != compNumber) {
			if (userNumber < compNumber) {
				System.out.println("��������� ���� ����� (" + userNumber + ") ������ ����, ��� ������� ���������");
				userNumber++;
			} else {
				System.out.println("��������� ���� ����� (" + userNumber + ") ������ ����, ��� ������� ���������");
				userNumber--;
			}
		}
		System.out.println("�� ������� �����: " + compNumber);
	}
}