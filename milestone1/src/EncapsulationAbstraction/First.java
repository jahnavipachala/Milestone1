package EncapsulationAbstraction;

import java.util.Scanner;

class Author
{
	public static String authorn;
	String name;
	String email;
	char gender;
	Author(String n,String e,char g)
	{
		this.name=n;
		this.email=e;
		this.gender=g;
	}
}
class Book 
{
	String name;
	double price;
	int qtyInstock;
	Author author;// = new Author(name,super.email,super.gender);
	public Author getAuthorsName(){
        return this.author;
    }
	public String getName(){
        return name;
    }
     public int getQtyinstock(){
        return qtyInstock;
    }

   public double getPrice(){
        return price;
    }
 public void setAuthor(Author newAuthor){
      author=newAuthor;
  }
 public void setName(String name){
      this.name=name;
  }
 public void setQtyinstock(int qtyInstock){
      this.qtyInstock=qtyInstock;
  }
 public void setPrice(double price){
      this.price=price;
  }
}
public class First {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter author name,email,gender:");
	String author=sc.next();
	String email=sc.next();
	char gen=sc.next().charAt(0);
	Author a1=new Author(author, email, gen);
	Book b1=new Book();
	System.out.println("Enter the Details of the book:");
	System.out.println("Enter Book name:");
	String name=sc.next();
	System.out.println("Enter Book Price:");
	double price=sc.nextDouble();
	System.out.println("Enter Book qtyInStock:");
	int qtyInStock=sc.nextInt();
	b1.setName(name);
	b1.setAuthor(a1);
	b1.setPrice(price);
	b1.setQtyinstock(qtyInStock);
	System.out.println("Book Details:");
	System.out.println("Book Name:"+b1.getName());
	System.out.println("Book Author:"+b1.getAuthorsName().name);
	System.out.println("Book Price:"+b1.getPrice());
	System.out.println("Book qtyInStock:"+b1.getQtyinstock());
}

}