package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class GreetApplication extends Controller {
	
	public static Result greet(){
		JsonNode json = request().body().asJson();
		
		String name = json.findPath("name").textValue();
		if(name == null) {
		    return badRequest("Missing parameter [name]");
		  } else {
		    return ok("Hello " + name);
		  }

    }

}
