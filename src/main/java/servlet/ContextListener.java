package servlet;

import java.net.UnknownHostException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mongodb.MongoClient;

@WebListener
public class ContextListener implements ServletContextListener {
	
	 @Override
	 public void contextDestroyed(ServletContextEvent sce) {
		 MongoClient mongo = (MongoClient) sce.getServletContext().getAttribute("MONGO_CLIENT");
		 mongo.close();
	 }
	 
	 @Override
	 public void contextInitialized(ServletContextEvent sce) {
		 try {
			 ServletContext context = sce.getServletContext();
			 MongoClient mongo = new MongoClient(context.getInitParameter("MONGODB_HOST"), Integer.parseInt(context.getInitParameter("MONGODB_PORT")));
			 
			 sce.getServletContext().setAttribute("MONGO_CLIENT", mongo);
		 } catch (UnknownHostException e) {
			 throw new RuntimeException("MongoClient init failed");
		 }
	 }
}
