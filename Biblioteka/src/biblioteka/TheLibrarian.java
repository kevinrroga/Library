<<<<<<< HEAD
package biblioteka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.print.Book;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TheLibrarian extends TheUser{
	protected String name;
	protected String surame;
	protected String email;
	protected String password;
	protected int PhoneNumber;
	protected double billNr;
	protected double booksNr;
	protected double profit;
	
	int i,j;
	public TheLibrarian (){
		
	}
	
	public TheLibrarian (String name, String surname, String email, String password)
	{
		super(name,surname,email,password);
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit)
	{
		this.profit= this.profit + profit;
	}
	public double getNrOfBooks() {
		return booksNr;
	}
	public void setNrOfBooks (double booksNO)
	{
		this.booksNr = this.booksNr + booksNr;
	}
	public double getNrOfBills() {
		return billNr;
	}
	public void addNrOfBills (double billsNr)
	{
		this.billNr = this.billNr + billNr;
	}
	
	public String toString2 ()
	{
		return getName() + "," + getSurname() + "," + getEmail() +"," + getPassword() +
				"," + getProfit() +"," + getNrOfBooks();
	}
	
	public String toString ()
	{
		return getName() + "," + getSurname() + "," + getEmail();
	}
	public void CheckOutBook (ArrayList<Book> books) throws NoBooksException
	{
		for (i=0;i<books.size();i++)
		{
				double price = books.get(i).getPurchasedPrice();
				setProfit(price);
				setNrOfBooks(1);
			
		}
	}
	
	public void CreateBill (ArrayList<Book>books)
	{
		try(FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\Biblioteka\\Doc1.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter p = new PrintWriter(bw);){
			for (int i=0;i<books.size();i++)
			{
				p.println(books.get(i).BillString());
			}
			
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}
}
	
	
	public ArrayList<Book> FixBill (ArrayList<Book> books)
	{
		for (i=0;i<books.size();i++)
		{
			for (j=i+1;j<books.size();j++)
			{
				if (books.get(i).getTitle().equals(books.get(j).getTitle()))
				{
					books.get(i).setSoldQuantity(books.get(i).getSoldQuantity()+2);
					books.remove(j);
				}
			}
		}
		return books;
	}
	
	public String revenue ()
	{
		return "Number of books sold ->  " +getNrOfBooks() +
				" Profit ->  " + getProfit();
	}
}
=======
package biblioteka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.print.Book;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TheLibrarian extends TheUser{
	protected String name;
	protected String surame;
	protected String email;
	protected String password;
	protected int PhoneNumber;
	protected double billNr;
	protected double booksNr;
	protected double profit;
	
	int i,j;
	public TheLibrarian (){
		
	}
	
	public TheLibrarian (String name, String surname, String email, String password)
	{
		super(name,surname,email,password);
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit)
	{
		this.profit= this.profit + profit;
	}
	public double getNrOfBooks() {
		return booksNr;
	}
	public void setNrOfBooks (double booksNO)
	{
		this.booksNr = this.booksNr + booksNr;
	}
	public double getNrOfBills() {
		return billNr;
	}
	public void addNrOfBills (double billsNr)
	{
		this.billNr = this.billNr + billNr;
	}
	
	public String toString2 ()
	{
		return getName() + "," + getSurname() + "," + getEmail() +"," + getPassword() +
				"," + getProfit() +"," + getNrOfBooks();
	}
	
	public String toString ()
	{
		return getName() + "," + getSurname() + "," + getEmail();
	}
	public void CheckOutBook (ArrayList<Book> books) throws NoBooksException
	{
		for (i=0;i<books.size();i++)
		{
				double price = books.get(i).getPurchasedPrice();
				setProfit(price);
				setNrOfBooks(1);
			
		}
	}
	
	public void CreateBill (ArrayList<Book>books)
	{
		try(FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\eclipse-workspace\\Biblioteka\\Doc1.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter p = new PrintWriter(bw);){
			for (int i=0;i<books.size();i++)
			{
				p.println(books.get(i).BillString());
			}
			
	}
	catch (IOException e1) {
		e1.printStackTrace();
	}
}
	
	
	public ArrayList<Book> FixBill (ArrayList<Book> books)
	{
		for (i=0;i<books.size();i++)
		{
			for (j=i+1;j<books.size();j++)
			{
				if (books.get(i).getTitle().equals(books.get(j).getTitle()))
				{
					books.get(i).setSoldQuantity(books.get(i).getSoldQuantity()+2);
					books.remove(j);
				}
			}
		}
		return books;
	}
	
	public String revenue ()
	{
		return "Number of books sold ->  " +getNrOfBooks() +
				" Profit ->  " + getProfit();
	}
}
>>>>>>> branch 'master' of https://github.com/kevinrroga/Library.git
