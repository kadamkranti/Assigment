package assigment;
import java.util.Scanner;
public class assigment1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String string1 = sc.nextLine();
			char string2 = sc.next().charAt(0);
			int length = string1.length();
			char []array = new char[length];
			for(int i = 0; i < length; i++) {
				if(string1.charAt(i) == string2) {
					string1.replace(string1.toString(), " ");
					System.out.println();
				}
				else {
					array[i] = string1.charAt(i);
				}
			}
			for(char i : array) {
				System.out.print(i);
			}
			sc.close();
		}
	}