import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {
	public static void main(String[] args) {
		
		MongoClient client = MongoClients.create("mongodb+srv://atakanbayrak:1802atakan@javamongodbtutorialclus.rztcmkb.mongodb.net/?retryWrites=true&w=majority"); 
		
		MongoDatabase db = client.getDatabase("MongoDB");
		
		MongoCollection col = db.getCollection("1");
		
		Document sampleDoc = new Document("_id","2").append("name", "Atakan Bayrak");
		col.insertOne(sampleDoc);
		
	}

}
