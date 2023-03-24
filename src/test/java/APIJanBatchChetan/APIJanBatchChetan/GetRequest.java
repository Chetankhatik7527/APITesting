package APIJanBatchChetan.APIJanBatchChetan;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetRequest {
	
	public static void main(String args[])
			{
				Response getParticular=given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIFolks/2");
				System.out.println("Status Code is :"+getParticular.getStatusCode());
				System.out.println("Response data is :");
				
				System.out.println(getParticular.asString());
				
				Response getAllParticular=given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIFolks/");
				System.out.println("Status Code is :"+getAllParticular.getStatusCode());
				System.out.println("Response data is :");
				
				System.out.println(getAllParticular.asString());
			}

}
