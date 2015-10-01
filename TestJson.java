import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


public class TestJson {

	public static void main(String[] args) throws Exception{
		TestJson test = new TestJson();
		test.readJsonFromFile();
	}
	
	public void getJsonFromList(){
		List list = new ArrayList();
		String json = null;
		try {
			Map value = new HashMap();
			value.put("id", "11");
			value.put("name", "Test");
			list.add(value);
			json = new ObjectMapper().writeValueAsString(list);
			System.out.println("value :"+json);
		} catch (JsonProcessingException jsonProcessingException) {
			jsonProcessingException.printStackTrace();
		}
	}
	
	public void readJsonFromFile() throws Exception {
		String jsonFilePath = "D:\\Work\\MyJson.json";
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            String siteName = (String) jsonObject.get("firstName");
            System.out.println("firstName: " + siteName);
            long members = (long) jsonObject.get("age");
            System.out.println("age: " + members);
            String url = (String) jsonObject.get("lastName");
            System.out.println("lastName: " + url);
            JSONArray names = (JSONArray) jsonObject.get("address");
            Iterator i = names.iterator();
            while (i.hasNext()) {
                System.out.println(" "+i.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
