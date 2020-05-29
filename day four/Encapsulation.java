1. books
import java.util.*;
import java.io.*;

class Author{
    public static String email;
   public static char gender;
    public static String name;
    Author(String n,String e,char g)
    {
        name=n;
        email=e;
        gender=g;
    }
    
    
}
class Book{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=100;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=10;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("The name of the author is :"+Author.name);
       System.out.println("The email id is :"+Author.email);
       System.out.println("The gender is :"+Author.gender);
    }
    
}
class Books{
    public static void main(String args[])
    {
        Book b=new Book("Computer Networks");
        Author a=new Author("amy","xxx.cse@rmd.ac.in",'f');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQtyInStock());
        b.getAuthor();
        
    }
}
2.polymorphism
public class Poly {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}

}
public class Shape {
	
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
	

}
public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}
}

public class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
3.polymorphism
class Fruits

{    

  protected char name, taste, size  ;

 scanner sc = new scanner ( system. in );

 

  public void eat ( ) // overridden method.

 {

       scanner sc = new scanner ( system. in );

       system. out. println ( "enter the name of the fruit " ) ;

       name = nextChar ( ) ;

       system. out. println ( " please provide the taste of the fruit " ) ;

       taste = nextChar ( ) ;

       system. out. println ( " Name of the fruit is: " + name ) ;

       system. out. println ( " Taste of the fruit is: " + taste ) ;  

    }

}

class apple extends fruit

{

  void eat ( ) // overriding method

  {

       system. out. println ( " Name of the fruit is Apple " ) ;

       system. out. println ( " Taste of the fruit is sweet " ) ;

    }  

}

class orange extends fruit

{

   public void eat ( ) // overriding method

  {

       system. out. println ( " Name of the fruit is Orange " ) ;

       system. out. println ( " Taste of the fruit is sour " ) ;

    }

}

class Main

{

 public static void main ( string args )

  {

    apple A = new apple ( ) ;

     A . eat ( ) ;

    orange O = new orange ( ) ;

    O . eat ( ) ;

  }

}

