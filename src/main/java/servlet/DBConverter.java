package servlet;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

public class DBConverter
{
	public static DBObject toDBObject(User u) {
		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		
		builder = builder.append("username", u.getUsername());
		builder = builder.append("userType", u.getUserType());
		
		if(u.getId() != null)
			builder = builder.append("_id", u.getId());
		
		return builder.get();
	}
	
	public static User toUser(DBObject doc) {
		User u = new User();
		
		u.setUsername((String) doc.get("username"));
		u.setUserType((String) doc.get("userType"));
		u.setId((ObjectId) doc.get("_id"));
		
		return u;
	}
}
