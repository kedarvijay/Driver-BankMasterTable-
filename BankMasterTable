package com.jdbc;

import java.sql.Connection;

public class BankMasterTable {

	public static void main(String[] args) {
		try {
			Connection conn= DBConnector.getConnected();
			java.sql.Statement stmt = conn.createStatement();
			String command ="create table BankMaster(acno number primary key,achname varchar(20),dep_amount number)";
			stmt.execute(command);
			System.out.println("Table Created");
		}
		catch(Exception e){
			e.printStackTrace();
			

	}

}
}
//CREATE SEQUENCE seq_acno start with 1001 increment by 1;
