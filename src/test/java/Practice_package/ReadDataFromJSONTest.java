package Practice_package;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONTest 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		FileReader filepath = new FileReader(".\\src\\test\\resources\\JSON.json");
		
		//JSONparser is used to read and write json formatted file
		JSONParser jsonp=new JSONParser();
		Object obj = jsonp.parse(filepath);
		
		//read dat from json file
		JSONObject map = (JSONObject)obj;
		
//		 String value = (String) map.get("browser");
//		 return value;
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
		
	}

}
