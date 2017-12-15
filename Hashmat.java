import java.util.HashMap;

public class Hashmat{
	public void createMap(){
		HashMap<String, String> tracklist = new HashMap<>();

		tracklist.put("title1", "lyrics1");
		tracklist.put("title2", "lyrics2");
		tracklist.put("title3", "lyrics3");
		tracklist.put("title4", "lyrics4");

		String track = tracklist.get("title1");
		System.out.println(track);

		
		
	}
}
