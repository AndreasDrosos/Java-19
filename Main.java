import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		int choice;
		
		displayMenu(); //�������� �����
		choice=input1.nextInt();
			
		//������� ����������� �������� ������
		while (choice<0 || choice>2) {
			System.out.println("� ������� ��� �������� ��� ����� ������. �������� ����������� ����.");
			displayMenu(); //�������� �����
			choice = input1.nextInt();
		}
		
		switch(choice) {

		case 0:
			break; //������ ��� �� ����� ��������
		case 1:
			Student.newStudent(); 
			break;
		case 2:
			Staff.newEmploee();
			break;
		
		}

	}
	
	public static void displayMenu() {
		System.out.println("0. ������");
		System.out.println("1. ���������� ������������� �������");
		System.out.println("2. ���������� ������������� �����������");
		System.out.print("�������� ������� [0-2]: ");
	}

	Student s1 = new Student(8190064, "���������� ��������", "�");
	Student s2 = new Student(8190021, "���������� �����������", "�");
	Student s3 = new Student(8190036, "���������� ���������", "�");
	Student s4 = new Student(8190044, "������� ������", "�");
	Student s5 = new Student(8190106, "��������� ����������", "�");
	Student s6 = new Student(8190132, "������-������� �����������", "�");
	Student s7 = new Student(8190325, "������������ ���������", "�");
	
}
