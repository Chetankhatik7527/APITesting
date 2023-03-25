package APIJanBatchChetan.APIJanBatchChetan;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;
	
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject inner=new JSONObject();
		inner.put("Plot no", "65/1");
		inner.put("Society", "Vrundavan Society");
		
		JSONObject outer=new JSONObject();
		outer.put("firstname", "Rahul");
		outer.put("lastname", "Dua");
		outer.put("Age", "29");
		outer.put("address",inner);
		
	System.out.println("Data is");
	Response r=given().contentType(ContentType.JSON).body(outer.toString()).when().post("http://localhost:3000/APIFolks/");
	System.out.println(r.asString());
	
		
	}

}
