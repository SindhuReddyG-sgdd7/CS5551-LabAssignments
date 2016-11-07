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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
		
	public LoginServlet() {
		
	}
		// TODO Auto-generated constructor stub
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("1");
				
		BasicDBObject query = new BasicDBObject();
		
		MongoClientURI uri = new MongoClientURI("mongodb://sindhu:2903@ds062351.mlab.com:62351/app");
		MongoClient client = new MongoClient(uri);
	
		DB db = client.getDB(uri.getDatabase());
		DBCollection newusers = db.getCollection("newusers");
		query.put("username", request.getParameter("username"));
		query.put("password", request.getParameter("password"));
		DBCursor docs = newusers.find();
		response.getWriter().write(docs.toArray().toString());
		response.sendRedirect("Homepage.html");
			
				
			
	}
}
