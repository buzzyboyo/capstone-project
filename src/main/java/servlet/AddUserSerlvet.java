package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mongodb.MongoClient;

@WebServlet("/addUser")
public class AddUserSerlvet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		String username = request.getParameter("username");
		String userType = request.getParameter("userType");
		
		if(username == null || userType == null || username.equals("") || userType.equals("")) {
			request.setAttribute("error", "Missing Parameters");
			//TODO: forward response
		} else {
			User u = new User();
			u.setUsername(username);
			u.setUserType(userType);
			
			MongoClient mongo = (MongoClient)request.getServletContext().getAttribute("MONGO_CLIENT");
			
			DBUserDao userDao = new DBUserDao(mongo);
			userDao.createUser(u);
			request.setAttribute("success", "User Added");
			
			//TODO: forward response
		}
	}
}
