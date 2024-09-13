package com.satish.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcApp02 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading..........");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","8576");
		System.out.println("Connection establishing.........");
		Statement st=con.createStatement();
		
		System.out.print("Table Name    :");
		String tname=br.readLine();
		String query="create table  "
		+tname+"(ENO INT(3) PRIMARY KEY , Ename varchar(10), ESAL float,EADDR varchar(10))";
		st.executeUpdate(query);
		System.out.println("Table"+" "+tname+" "+"is Created Successfully");
		st.close();
		con.close();
		

	}

}
