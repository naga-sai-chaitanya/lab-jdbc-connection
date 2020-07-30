package controller;

import java.io.IOException;

import utility.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String args[]) throws Exception
	{
		Connection cn = ConnectionManager.getConnection();
		
		
		
		if(cn!=null)
		{
			System.out.println("Connection Established");
		}
		else
		{
			System.out.println("Check your Connection");
		}
	}
}
