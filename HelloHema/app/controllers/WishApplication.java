package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class WishApplication extends Controller {

	 public static Result wish(String name) {
	        return ok(index.render("Hello "+name));
	    }
}
