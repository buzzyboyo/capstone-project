package servlet;

import org.bson.types.ObjectId;

public class User
{
	private ObjectId id;
	private String username;
	private String userType;
	
	public String getUsername() { return username; }
	public String getUserType() { return userType; }
	
	public void setUsername(String username) { this.username = username; }
	public void setUserType(String userType) { this.userType = userType; }
	
	public ObjectId getId() { return id; }
	public void setId(ObjectId id) { this.id = id; }
}
