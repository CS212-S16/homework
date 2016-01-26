import java.util.ArrayList;

import org.json.simple.JSONObject;
/**
 * A class to maintain data about a single song.
 * Java object representation of a JSON object with schema below.
 * @author srollins
 *
 */

/*
{  
   "artist":"The Primitives",
   "timestamp":"2011-09-07 12:34:34.851502",
   "similars":[  
      [  
         "TROBUDC128F92F7F0B",
         1
      ],
      [  
         "TRWSCCK128F92F7EDB",
         0.98714400000000002
      ]
   ],
   "tags":[  
      [  
         "1980s",
         "100"
      ],
      [  
         "80s",
         "33"
      ],
      [  
         "pop",
         "33"
      ],
      [  
         "alternative",
         "33"
      ]
   ],
   "track_id":"TRBDCAB128F92F7EE4",
   "title":"Never Tell"
} 
 
*/

public class Song {

	/**
	 * Declare appropriate instance variables.
	 */
	
	/**
	 * Constructor.
	 * @param artist
	 * @param trackId
	 * @param title
	 * @param similars
	 * @param tags
	 */
	public Song(String artist, String trackId, String title, ArrayList<String> similars, ArrayList<String> tags) {
		//TODO: Complete constructor.
	}

	/**
	 * Constructor that takes as input a JSONObject as illustrated in the example above and
	 * constructs a Song object by extract the relevant data.
	 * @param object
	 */
	public Song(JSONObject object) {
		//TODO: Complete constructor.		
	}
	
	/**
	 * Return artist.
	 * @return
	 */
	public String getArtist() {
		//TODO: complete method
		return null;
	}

	/**
	 * Return track ID.
	 * @return
	 */
	public String getTrackId() {
		//TODO: complete method
		return null;
	}

	/**
	 * Return title.
	 * @return
	 */
	public String getTitle() {
		//TODO: complete method
		return null;
	}

	/**
	 * Return a list of the track IDs of all similar tracks.
	 * @return
	 */
	public ArrayList<String> getSimilars() {
		//TODO: complete method
		return null;
	}

	/**
	 * Return a list of all tags for this track.
	 * @return
	 */
	public ArrayList<String> getTags() {
		//TODO: complete method
		return null;
	}	
}
