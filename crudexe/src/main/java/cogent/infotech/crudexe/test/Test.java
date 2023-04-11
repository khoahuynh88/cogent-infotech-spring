package cogent.infotech.crudexe.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.infotech.crudexe.dao.BookDao;
import cogent.infotech.crudexe.dto.Book;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		BookDao dao = (BookDao) ctx.getBean("bookDao");
		Book book = new Book();
		/*
		 * book.setId(102); book.setName("abc"); book.setPrice(10); int result =
		 * dao.create(book); //dao.delete(102); System.out.println(dao.readid(102));
		 */
		int id;
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		do {
			System.out.println("************Menu***************");
			System.out.println("1-> Add book");
			System.out.println("2-> Read single book");
			System.out.println("3-> Read all book");
			System.out.println("4-> Update book");
			System.out.println("5-> Delete book");
			System.out.println("6-> Exit");
			System.out.println("Please enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("How many record you wnat to add");
				int count = sc.nextInt();
				
				for (int i = 0; i < count; i++) {
					Book book1 = new Book();
					System.out.println("Enter book id");
					book1.setId(sc.nextInt());
					System.out.println("Enter book name");
					book1.setName(sc.next());
					System.out.println("Enter book price");
					book1.setPrice(sc.nextInt());
					int result=dao.create(book1);
				}
				break;

			case 2:
				System.out.println("Enter the book id you want to read");
				id = sc.nextInt();
				System.out.println( dao.readid(id));
				break;
			
			case 3:
				System.out.println(dao.read()); 
				break;
			case 4:
				
				System.out.println("Enter book id");
				int idc=sc.nextInt();
				
				book.setId(idc);
				System.out.println("Enter book name");
				book.setName(sc.next());
				System.out.println("Enter book price");
				book.setPrice(sc.nextInt());;
			
				dao.update(book);
				break;
			case 5:
				System.out.println("Enter the book id you want to delete");
				int i = sc.nextInt();
				dao.delete( i);
				break;
			case 6:
				System.exit(0);
			}

		} while (choice != 6);
	}

}
