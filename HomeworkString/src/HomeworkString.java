import java.util.Scanner;

public class HomeworkString {

	public static void main(String[] args) {
	//10
	//char[] name = {'�','�','�','�','�','�','�',' ','�','�','�','�','�'};
	//System.out.println(name);
		
	char [] name = new char [13];
		String string = "������� �����";
		System.out.println("�������� ���: "+string);
		System.out.print("��� � �������: ");
	for (int i=0; i<string.length(); i++) {
		 name [i] = string.charAt(i);
		System.out.print(name[i]);
	}
	//��������
	System.out.println(name);
	//10
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    	String string1 = scanner.nextLine();
    	char [] name1; 
        name1 = new char [string1.length()];
	System.out.println("�������� ���: "+string1);
	System.out.print("��� � �������: ");
for (int i=0; i<string1.length(); i++) {
	 name1 [i] = string1.charAt(i);
	System.out.print(name1[i]);
}
    scanner.close();
    
}
}