import java.util.TreeSet;

/**
 * Maintains a music library of several songs.
 * @author srollins
 *
 */
public class MusicLibrary {

	/**
	 * Declare appropriate instance variables.
	 * It should be easy to retrieve a song given its unique track ID.
	 * It should also be easy to retrieve a sorted set of songs by a given
	 * artist.
	 */
	
	/**
	 * Constructor
	 */
	public MusicLibrary() {
		//TODO: complete constructor.
	}
	
	/**
	 * Add a song to the library.
	 * Make sure to add a reference to the song object to all 
	 * appropriate data structures.
	 * @param song
	 */
	public void addSong(Song song) {
		//TODO: complete method
	}
	
	/**
	 * Return the song associated with a unique track ID.
	 * @param trackId
	 * @return
	 */
	public Song getSongById(String trackId) {
		//TODO: complete method
		return null;
	}
	
	/**
	 * Return a sorted set of all songs by a given artist.
	 * @param artist
	 * @return
	 */
	public TreeSet<Song> getSongsByArtist(String artist) {
		//TODO: complete method
		return null;
	}
	
	//TODO: Hint: you may want to use a comparator.
	
}
