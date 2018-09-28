import java.util.Scanner;

public class HomeworkString {

	public static void main(String[] args) {
	//10
	//char[] name = {'Я','р','ы','ш','к','и','н',' ','И','г','о','р','ь'};
	//System.out.println(name);
		
	char [] name = new char [13];
		String string = "Ярышкин Игорь";
		System.out.println("Исходное имя: "+string);
		System.out.print("Имя в массиве: ");
	for (int i=0; i<string.length(); i++) {
		 name [i] = string.charAt(i);
		System.out.print(name[i]);
	}
	//проверка
	System.out.println(name);
	//10
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name: ");
    	String string1 = scanner.nextLine();
    	char [] name1; 
        name1 = new char [string1.length()];
	System.out.println("Исходное имя: "+string1);
	System.out.print("Имя в массиве: ");
for (int i=0; i<string1.length(); i++) {
	 name1 [i] = string1.charAt(i);
	System.out.print(name1[i]);
}
    scanner.close();
    
}
}