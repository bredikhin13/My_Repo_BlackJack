import java.util.Scanner;

class shokolnik {
	public static int mark;
	
	public static void main(String[] args)
	{
		Prosnulsya();
	}
	public static void Prosnulsya()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Пр? Y/N");
		String s = "";
		s = sc.nextLine();
		if (s.equals("Y")){
			System.out.println("����� ������? Y/N");
			s = sc.nextLine();
			if (s.equals("Y")){
				mamFC();
			} else {
				System.out.println("���� ����?");
				s = sc.nextLine();
				if (s.equals("N")){
					Game();
				} else {
					Sobirat();
				}
			}
		}else {
			System.out.println("�������");
			System.out.println("���� � �����?");
			s = sc.nextLine();
			if(s.equals("Y"))
			{
				Sobirat();
			}
		}
	}
	
	
	public static void Sobirat() {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("������ ��������...");
		System.out.println("����� �� ����...");
		System.out.println("���� �� ����?");
		s= sc.nextLine();
		if(s.equals("Y")){
			Na_yroke();
		} else {
			System.out.println("���� � �����?");
			s = sc.nextLine();
			if (s.equals("Y")){
				Game();
			} else {
				System.out.println("���� �������?");
				s = sc.nextLine();
				if (s.equals("Y")){
					System.out.println("���� ������ � ��������...");
				} else {
					System.out.println("���� ���� � ��������...");
				}
			}
			Domoj();
		}
	}
	
	public static void Na_yroke(){
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("������ �� ����");
		System.out.println("��������?");
		s= sc.nextLine();
		if(s.equals("Y")){
			System.out.println("�������?");
			s= sc.nextLine();
			if(s.equals("Y")){
				mark = 5;
			} else {
				mark = 2;
			}
		}
		System.out.println("����� �����?");
		s = sc.nextLine();
		if(s.equals("Y")){
			System.out.println("���� �� �����?");
			s = sc.nextLine();
			if(s.equals("Y")){
				Na_yroke();
			} else {
				System.out.println("������ �����");
				Domoj();
			}
		}
	//	sc.close();
	}
	
	public static void Domoj() {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("�������� ������ ������� \n ����� � �����?");
		s = sc.nextLine();
		if(s.equals("Y")){
			if (mark == 5){
				System.out.println("������� +300 ���!!!");
			} else {
				System.out.println("������� �����");
			}
			
		} else {
			System.out.println("������ ������ ���������!!");
			System.out.println("���������?");
			s = sc.nextLine();
			if(s.equals("N")){
				System.out.println("������� �����");
			}
		}
		System.out.println("����");
		System.out.println("�����?");
		s = sc.nextLine();
		if(s.equals("Y")){
			System.out.println("������ � VK");
		} else {
			System.out.println("������ �����");
		}
		Sleep();
		
	}
	
	public static void Sleep() {
		System.out.println("��������� ����?");
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		if(s.equals("Y")){
			Prosnulsya();
		}
	}
	
	public static void Game() {		
		String s;
		System.out.println("������ � DOTA 2");
		System.out.println("�� ����?");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		if(s.equals("N")){
			System.out.println("������ �����");
		}
		Domoj();
	}
	
	public static void mamFC() {
		System.out.println("��� � ���� ��");
		Prosnulsya();
	}
}