package edu.umkc.mongorestapp;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.json.java.JSON;
import com.ibm.json.java.JSONObject;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteResult;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
		
	public UserServlet() {
		
	}
		// TODO Auto-generated constructor stub
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("1");
		
		
		BasicDBObject query = new BasicDBObject();
		query.put("username", request.getParameter("username"));
		query.put("password", request.getParameter("password"));
		query.put("phone", request.getParameter("phone"));
		query.put("Email", request.getParameter("Email"));
		System.out.println(query);
		MongoClientURI uri = new MongoClientURI("mongodb://sindhu:2903@ds062351.mlab.com:62351/app");
		MongoClient client = new MongoClient(uri);
	
		DB db = client.getDB(uri.getDatabase());
		DBCollection newusers = db.getCollection("newusers");
		
		WriteResult result=newusers.insert(query);
		System.out.println(result);
		
		response.sendRedirect("Login.html");
	}
    
}	