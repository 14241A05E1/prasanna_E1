import src.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Main {
    public static Date Date1( String s) throws ParseException
            {
          
Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s);
            return date1;}


	public static void main(String[] args) throws ParseException {
            Student ob1;
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
            ob1 = new Student(1,"prasanna",Date1("9/8/1997"),98.9);
            
	

}}