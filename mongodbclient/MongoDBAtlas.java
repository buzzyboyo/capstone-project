package mongodbclient;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;

import org.bson.Document;
import com.mongodb.BasicDBObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class MongoDBAtlas {

    MongoClientURI uri;
    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public static void main(String[] args) throws IOException {

        //System.setProperty("jdk.tls.trustNameService", "true");

        MongoClientURI uri;
        MongoClient mongoClient;
        MongoDatabase database;
        MongoCollection<Document> collection;

        MongoDBAtlas DB = new MongoDBAtlas();

        DB.printDB();
        //DB.addUser();
        DB.printUserNames();
        //DB.addServer();
    }

    public MongoDBAtlas() {
        uri = new MongoClientURI("mongodb+srv://dbUser:dbPassword@tutoru.ihzhh.mongodb.net/sample_airbnb?retryWrites=true&w=majority");
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("TutorU");
        collection = database.getCollection("Users");
    }

    public void printDB() {

        collection = database.getCollection("Users");

        FindIterable<Document> iterDoc = collection.find();

        Iterator<Document> it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addUser() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print ("Please enter a username: ");
        String username = br.readLine();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1 if you are a user or 2 if you are a tutor: ");
        int userValue = input.nextInt();

        if (userValue == 1)
        {
            Document document = new Document();
            document.append("username", username);
            document.append("user type", "user");
            database.getCollection("Users").insertOne(document);
        }
        else
        {}

        if(userValue == 2) {
            Document document = new Document();
            document.append("username", username);
            document.append("user type", "tutor");
            database.getCollection("Users").insertOne(document);
        }
        else
        {}
    }

    public void addServer() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print ("Please enter a server name: ");
        String serverName = br.readLine();

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter server ID: ");
        int serverID = input.nextInt();

        Document document = new Document();
        document.append("ServerName", serverName);
        document.append("ServerID", serverID);
        database.getCollection("Servers").insertOne(document);
    }

    public void printUserNames()
    {
        collection = database.getCollection("Users");

        for (int i = 0; i < collection.countDocuments(); i++)
        {
            String username = collection.find(new BasicDBObject("id", i)).projection(Projections.include("username")).first().getString("username");

            System.out.println(username);
        }
    }

}


