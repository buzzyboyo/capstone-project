package servlet;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class DBUserDao
{
	private DBCollection collection;
	
	public DBUserDao(MongoClient mongo) {
		collection = mongo.getDB("TutorU").getCollection("Users");
	}
	
	public User createUser(User u) {
		DBObject doc = DBConverter.toDBObject(u);
		collection.insert(doc);
		
		ObjectId id = (ObjectId) doc.get("_id");
		u.setId(id);
		
		return u;
	}
	
	public void updateUser(User u) {
		BasicDBObjectBuilder obj = BasicDBObjectBuilder.start();
		
		DBObject query = obj.append("_id", u.getId()).get();
		
		collection.update(query, DBConverter.toDBObject(u));
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		DBCursor cursor = collection.find();
		
		while(cursor.hasNext()) {
			DBObject doc = cursor.next();
			User u = DBConverter.toUser(doc);
			users.add(u);
		}
		
		return users;
	}
	
	public void deleteUser(User u) {
		BasicDBObjectBuilder obj = BasicDBObjectBuilder.start();
		DBObject query = obj.append("_id", u.getId()).get();
		
		collection.findAndRemove(query);
	}
	
	public User getUser(User u) {
		BasicDBObjectBuilder obj = BasicDBObjectBuilder.start();
		DBObject query = obj.append("_id", u.getId()).get();
		
		DBObject user = collection.findOne(query);
		
		return DBConverter.toUser(user);
	}
}
