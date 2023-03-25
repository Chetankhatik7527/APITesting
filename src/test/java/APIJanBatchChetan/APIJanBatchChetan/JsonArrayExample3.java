package APIJanBatchChetan.APIJanBatchChetan;

import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.*;
	
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject innerobject1=new JSONObject();
		innerobject1.put("Plot no", "65/1");
		innerobject1.put("Society", "Vrundavan Society");
		
		JSONObject innerobject2=new JSONObject();
		innerobject2.put("City", "Ahmedabad");
		innerobject2.put("State", "Gujarat");
		
		JSONArray jsonArray=new JSONArray();
		jsonArray.put(0,innerobject1);
		jsonArray.put(1,innerobject2);
		
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Rahul");
		outer.put("lastname", "Dua");
		outer.put("Age", "29");
		outer.put("address",jsonArray);
		
	
	Response r=given().contentType(ContentType.JSON).body(outer.toString()).when().post("http://localhost:3000/APIFolks/");
	System.out.println("Status code is: "+ r.getStatusCode());
	System.out.println("Data is");
	System.out.println(r.asString());
	
		
	}

}
