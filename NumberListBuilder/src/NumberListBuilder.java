import java.nio.file.Path;
import java.util.ArrayList;

public class NumberListBuilder {

	/**
	 * Parse the JSON file specified by the path parameter. The file is expected to have a key 
	 * "list" that maps to an array of items. Each item will be a string representation of an 
	 * integer. Convert each value in the array to an Integer and store in an ArrayList.
	 * Return the ArrayList.
	 * 
	 * Propagate any IOExceptions, for example if the file specified by path is not found.
	 * If the file is not valid JSON, return an empty ArrayList, that is a list of size 0.
	 * If any items in the array cannot be parsed as an integer, ignore those items.
	 * If the file does not contain the key "list", throw a custom exception of 
	 * type InvalidJsonSchemaException. 
	 * 
	 */
	//NOTE: You may change the method header.
	public static ArrayList<Integer> buildList(Path path) {
		//TODO: complete this method
		return null;
	}
	
}
