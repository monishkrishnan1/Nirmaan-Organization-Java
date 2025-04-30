package Day_15;
import java.util.*;

public class UI {

	public static void main(String[] args) {
		
		Library lib = new Library();
		
		Scanner scan = new Scanner(System.in);
		
		boolean isBook = true;
		
		while(isBook) {
			
			System.out.println("Enter 1 to Add the Book Details..");
			System.out.println("Enter 2 to Update the Book Details..");
			System.out.println("Enter 3 to Show the Book Details..");
			System.out.println("Enter 0 to Exit the Library..");
			int key = scan.nextInt();
			
			if(key==1) {
				
				System.out.println("Book id: ");
				int id = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Book Name: ");
				String bookName = scan.nextLine();
				
				System.out.println("Book Author: ");
				String author = scan.nextLine();
				
				System.out.println("Book price: ");
				double price = scan.nextDouble();
				
				lib = new Library(id, bookName, author, price);
				
				
//				lib.setId(id);
//				lib.setBookName(bookName);
//				lib.setAuthor(author);
//				lib.setPrice(price);
				
			}else if(key==2) {
				
				System.out.println("Book id: ");
				int id = scan.nextInt();
				scan.nextLine();
				
				System.out.println("Book Name: ");
				String bookName = scan.nextLine();
				
				System.out.println("Book Author: ");
				String author = scan.nextLine();
				
				System.out.println("Book price: ");
				double price = scan.nextDouble();
				
				
				
				
				lib.setId(id);
				lib.setBookName(bookName);
				lib.setAuthor(author);
				lib.setPrice(price);
				
			}else if(key==3) {
				System.out.println(lib);
				
			}else if(key==0) {
				isBook = false;
			}
		}
	}

}
