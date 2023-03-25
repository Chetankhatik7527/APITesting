package APIJanBatchChetan.APIJanBatchChetan;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject jb=new JSONObject();
		jb.put("Firstname", "Tanmay");
		jb.put("Lastname", "Bhatt");
		jb.put("Age", "38");
		jb.put("Designation", "Engineer");
		jb.put("id", "15");
		
		System.out.println("Data of Json Object is :"+ jb);
		
		Response r= given().contentType(ContentType.JSON).body(jb.toString()).when().post("http://localhost:3000/APIFolks/");
		System.out.println("Status code is:"+r.getStatusCode());
		System.out.println("Data is:");
		System.out.println(r.asString());
	}

}
