package archivos;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JSONsimple {

	public static void main(String[] args) throws Exception {
        Object ob = new JSONParser().parse(new FileReader("c:/var/JSONFile.json"));
        JSONObject js = (JSONObject) ob;

        String firstName = (String) js.get("firstName");
        String lastName = (String) js.get("lastName");

        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " +lastName);
        
        JSONArray jsonArray= (JSONArray) js.get("phoneNumbers");
        for(int i=0; i<jsonArray.size(); i++){
            System.out.println(jsonArray.get(i));
        }

	}

}
