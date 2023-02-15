
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Book> books=new TreeSet<>(new BookOrderToName());
		TreeSet<Book> books1=new TreeSet<>(new BookOrderToPage());
		
		//Sayfa sayısı ve tarihler gerçeği yansıtmamaktadır.
		
		books.add(new Book("Mai Ve Siyah",250,"Halide Edip Adıvar","1938"));
		books.add(new Book("Araba Sevdası",175,"Recaizade Mahmut Ekrem","1915"));
		books.add(new Book("Aşk-ı Memnu",450,"Halit Ziya Uşaklıgil","1935"));
		books.add(new Book("Tutunamayanlar",650,"Oğuz Atay","1945"));
		books.add(new Book("Şermin",125,"Tevfik Fikret","1912"));
		
		//A-Z ye isimleri sıralar 
		for(Book b:books) {
			System.out.println(b.getName());
		}
		
		System.out.println("-------------------------------------------");
		
		books1.add(new Book("Mai Ve Siyah",250,"Halide Edip Adıvar","1938"));
		books1.add(new Book("Araba Sevdası",175,"Recaizade Mahmut Ekrem","1915"));
		books1.add(new Book("Aşk-ı Memnu",450,"Halit Ziya Uşaklıgil","1935"));
		books1.add(new Book("Tutunamayanlar",650,"Oğuz Atay","1945"));
		books1.add(new Book("Şermin",125,"Tevfik Fikret","1912"));
		
		//Sayfa sayılarını azdan çoğa sıralar.
		
		for(Book b1:books1) {
			System.out.println(b1.getPageNumber());
		}
		
		
		
	}

}
