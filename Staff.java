import java.util.Scanner;

public class Staff {

	private String name; //����� ��������/�����������
	private String status;
	public static Staff[] emploees = new Staff[500]; //�������� ������� 500 ������ ��� �� ����������� Staff
	static int count = 0;

	//���������� ������������ ��� ������ ��� �� ���������� ��� ������������ Staff
	public Staff(String name, String status) {
		emploees[count] = this;
		count++;
		this.name = name;
		this.status = status;
	} //����� ������������
	
	//���������� ������� get ��� ��� ���� ��� ���������� String name
	public String getName() {
		return name;
	} //����� �������
	
	//���������� ������� get ��� ��� ���� ��� ���������� String status
	public String getStatus() {
		return status;
	} //����� �������
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public static void newEmploee() {
		
		Scanner input = new Scanner(System.in);
		boolean found=false;
		int pos_found = 0;
		
		System.out.print("�������� �� ����� ��� ������ ��� ����������: ");
		String name=input.nextLine();
		
		for (int i=0; i<emploees.length; i++) {
			if (emploees[i].getName()==name) {
				found=true;
				pos_found=i;
				break;
			}
		}
		
		Scanner input2 = new Scanner(System.in);
		String result;
		do {
			System.out.print("�������� �� ���������� ��� �������� (�/�): ");
			result=input2.nextLine();
		} while (result!="�" || result!="�");
		
		if(found==true) {
			emploees[pos_found].setStatus(result);
		}
		else {
			Staff st = new Staff(id, name, result);
		}
			
	}
	
} //����� ������