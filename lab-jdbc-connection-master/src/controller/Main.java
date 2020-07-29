package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) {
		
	ConnectionManager cm = new ConnectionManager();
	if(cm.getConnection()!=null)
	{
		System.out.println("Connection established");
	}
	else
	{
		System.out.println("Check your connection");
	}
	
	}
}