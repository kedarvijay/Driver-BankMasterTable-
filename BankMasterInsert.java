package com.jdbc;

import java.sql.Connection;
import java.util.Scanner;

public class BankMasterInsert {

	public static void main(String[] args) throws Exception {
		Connection conn= DBConnector.getConnected();
		Scanner scan = new Scanner(System.in);
		System.out.println("Create Account: ");
		System.out.println("\nEnter Account Holder Name: ");
		String achname = scan.next();
		System.out.println("Deposit Amount: ");
		int dep_amount = scan.nextInt();

		java.sql.Statement stmt = conn.createStatement();

		String command = "insert into BankMaster values(seq_acno.nextval,'"+achname+"',"+dep_amount+")";
		stmt.execute(command);
		//conn.commit();
		System.out.println("Account Created Successfully...");
		stmt.close();
		conn.close();
	
	}

}

//we have to create sequence in sql before executing this code
//Run this in sqldeveloper ==> CREATE SEQUENCE seq_acno start with 1001 increment by 1;
