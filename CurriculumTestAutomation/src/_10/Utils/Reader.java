package _10.Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Reader {

	// method to read data from a JSON file
	public static JSONObject json(String name) {
		String jsonPath = System.getProperty("user.dir")+"\\src\\TestDataFiles\\" + name + ".json";
		
		// read the JSON file at the specified location
		FileReader reader = null;
		try {
			reader = new FileReader(jsonPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// define the parser to parse the JSON file
		JSONParser jsonParser = new JSONParser();
		
		// define the returned JSON Object
		JSONObject obj = null;
		try {
			obj = (JSONObject) jsonParser.parse(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
}
