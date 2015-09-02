package model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SubwayStationDAO {

	private static SubwayStationDAO stationList;

	public static SubwayStationDAO getInstance() {
		if (stationList == null) {
			stationList = new SubwayStationDAO();
		}
		return stationList;
	}

	public List<SubwayStation> getAllSubwayStations() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<SubwayStation> result = mapper.readValue(jsonFile(),
				new TypeReference<List<SubwayStation>>() {
				});
		return result;
	}
	
	public void updateSubwayStation(SubwayStation subwayStation){
		//TODO: Implement me
	}
	
	public void addSubwayStation(SubwayStation subwayStation){
		//TODO: Implement me
	}
	
	public void deleteSubwayStation(SubwayStation subwayStation){
		//TODO: Implement me
	}

	private static File jsonFile() {
		return new File("resources/estaciones.json");
	}
}
