package controllers;

import java.io.IOException;
import java.util.List;

import model.SubwayStation;
import model.SubwayStationDAO;
import play.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public Result index() {
		return ok(index.render("TODO: ADMIN :p"));
	}

	//TODO: Revisar el uso de los models https://blog.openshift.com/day-30-play-framework-a-java-developer-dream-framework/
	public Result getSubwayStations() {
		try {
			List<SubwayStation> list = SubwayStationDAO.getInstance()
					.getAllSubwayStations();
			return Results.ok(Json.toJson(list));
		} catch (IOException e) {
			return internalServerError(e.toString());
		}
		
		
	}
}
