import java.nio.file.Path;

public class SongDataParser {

	/**
	 * Declare appropriate data members here.
	 * Remember to make sure they are declared private unless there is a good
	 * reason to use public, package, or protected!
	 */

	/**
	 * Construct a SongDataParser object by initializing any data members and 
	 * traversing the directory specified by the path parameter.
	 * If isRecursive is true, recursively traverse the directory structure.
	 * If isRecursive is false, traverse only the JSON files found in the 
	 * directory specified by path.  
	 * @param path
	 * @param isRecursive
	 */
	public SongDataParser(Path path, boolean isRecursive) {
		//TODO: complete the constructor
		
	}

	/**
	 * Return the average number of similar songs across all song data.
	 * @return
	 */
	public double getMeanNumberSimilarSongs() {
		//TODO: complete the method
		return 0;		
	}

	/**
	 * Return the total number of songs found.
	 * @return
	 */
	public int getSongCount() {
		//TODO: complete the method.
		return 0;
	}

	/** 
	 * You will likely need several additional methods here. My solution uses four private methods.
	 * Do not be afraid to create a separate Driver to test your code!
	 */
}