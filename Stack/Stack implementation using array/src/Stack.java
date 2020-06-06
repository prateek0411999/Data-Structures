import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import oracle.jdbc.pool.OracleDataSource;




public class Stack{
	
 public static void main(String args[])
 
 
 {
	 Connection con=null;
	 ResultSet rset=null;
	 String s = null;

	 int a = 0;
	 
	 OracleDataSource ods;
	try {
		ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		con=ods.getConnection("vikas","icsd");
		System.out.println("connection established");
		PreparedStatement stmt=con.prepareStatement("select * from tbl1");
		rset=stmt.executeQuery();
		while(rset.next())
		{
			s=rset.getString("strname");
			a=rset.getInt("strid");
			
			System.out.println(s+ " "+ a);
		}
		
		con.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter size of the stack");
	 int n,i = 0;
	 n=sc.nextInt();
	 int TOP=-1;
	 int val=0;
	 int stack[]=new int[n];
	 
	 
	 while(i != 4)
	 {
		 System.out.println("1   PUSH");
		 System.out.println("2   POP");
		 System.out.println("3   DISPLAY");
		 System.out.println("4   EXIT");
		 System.out.print("Enter your choice");
		 i=sc.nextInt();
		 
		 switch(i)
		 {
		 case 1:
			 System.out.println("Enter the element to add");
			 val=sc.nextInt();

			 if(TOP==n)
			 {
				 System.out.println("OVERfLOW");
			 }
			 else
			 {
				 
				 TOP=TOP+1;
				 stack[TOP]=val;
			 }
			 break;
	
		 case 2:
			 System.out.println("popping the element....... ");
			 if(TOP==-1)
			 {
				 System.out.println("stack is empty");
			 }
			 else
			 {
				 int ITEM;
				 ITEM=stack[TOP];
				 TOP=TOP-1;
			 }
			 break;
		
		 case 3:
			 for(int ii=0;ii<n;ii++)
			 {
				 System.out.println(stack[ii]);
			 }
			 break;
		
		 case 4:
			 System.out.print("Exiting...........");
			 break;
		 default:
			 System.out.println("Enter a valid choice");
		
		 };
		 
	 }
	 
	 
 }


	
}


 

