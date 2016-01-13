import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestSongDataParser {

	private static SongDataParser recursiveSDP;
	private static SongDataParser nonRecursiveSDP;
	
	@BeforeClass
	public static void setUp() {
		
		Path recursivePath = Paths.get("lastfm_subset/");
		recursiveSDP = new SongDataParser(recursivePath, true);
		
		Path nonRecursivePath = Paths.get("lastfm_subset/A/W/K");
		nonRecursiveSDP = new SongDataParser(nonRecursivePath, false);
	}
		
	@Test
	public void testNonRecursiveCount() {
		assertEquals(nonRecursiveSDP.getSongCount(), 9);
	}

	@Test
	public void testNonRecursiveMean() {
		assertEquals(nonRecursiveSDP.getMeanNumberSimilarSongs(), 49, 1);
	}

	@Test
	public void testRecursiveCount() {
		assertEquals(recursiveSDP.getSongCount(), 9330);
	}


	@Test
	public void testRecursiveMean() {
		assertEquals(Math.floor(recursiveSDP.getMeanNumberSimilarSongs()), 65, 1);
	}

	@Test
	public void testBadPath() {
		Path badPath = Paths.get("BAD_PATH");
		try {
			SongDataParser sdp = new SongDataParser(badPath, true);
		} catch(Exception e) {
			fail("Exception generated by SongDataParser constructor with bad path: " + badPath.toString());
		}
		
	}

	
}
