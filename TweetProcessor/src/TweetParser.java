import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class that processes a CSV file containing many 
 * tweets and builds two maps:
 * The first map maps hash tags to the number
 * of times the tag appears in the data set.
 * The second map maps domains to the number of
 * times they appear in the data set.
 * 
 * @author srollins
 *
 */
public class TweetParser {
	
	/**
	 * The path parameter specifies the file name of the tweet data set.
	 * The data set is a csv file.
	 * The first five fields may be ignored.
	 * Anything following the fifth comma is considered part of the tweet.
	 * Remove any quotation marks at the beginning or ending of the tweet.
	 * When reading the file, use the ISO-8859-1 character set.
	 * Tags and domains must be extracted from the tweet using
	 * regular expressions. 
	 * @param path
	 */
	public TweetParser(Path path) {					
		
	}	
	
	/**
	 * Return a HashMap where the key is a tag and the value is the 
	 * number of times the tag appears in the data set.
	 * A tag begins with a # and ends with a whitespace character.
	 * A tag must contain at least one non-whitespace character.
	 * A tag may contain any other character (including punctuation).
	 * A tag must be preceded by a space, or be at the beginning of a tweet.
	 * 
	 * 
	 * This tweet has two hash tags:
	 * Why can't I install WHS in a Virtual Machine? #vmware #fail
	 * 
	 * This tweet does not contain any hash tags because there is a space between # and 
	 * the next character:
	 * Wow! I'm on tweet # 100 - wish I'd thought of something more profound to say now ...
	 * 
	 * This tweet contains only one hash tag because the second # is preceded by punctuation:
	 * @zacparker Sorry to miss you! I've got some time now though if you're on. If not #weekendtechtalk (#wttalk for short) continues tomorrow 
	 * 
	 * This tweet has four hash tags, again because one of the # is preceded by punctuation:
	 * #iphone is working with #vista now. and yes...#apple sux. it seems to be that my #powerbook is outdated. not enough #usb power
	 * 
	 * @return
	 */
	public HashMap<String, Integer> getTagCount() {
		return null;
	}
	
	/**
	 * Return a HashMap where the key is a domain and the value is the 
	 * number of times the domain appears in the data set.
	 * A domain begins with either http:// or https://
	 * The domain is any series of characters between the second / and 
	 * either the next / or a whitespace.
	 * 
	 * This tweet has a domain tinyurl.com:
	 * Working on my new photography site. Experimenting with template themes. I haven't done web designing in ages!  http://tinyurl.com/r9qf4r
	 * 
	 * This tweet has a domain www.getdropbox.com:
	 * Note: https://www.getdropbox.com/referrals/NTI2NTA2ODk link gives you 2G + extra 250MB bonus space
	 * 
	 * This tweet has no domains:
	 * @paul https didn't work
	 * 
	 * This tweet also has no domains:
	 * Oh and they also know I use my Gmail using https:// too  I'm such a rebel!!
	 * 
	 * @return
	 */
	public HashMap<String, Integer> getDomainCount() {
		return null;
	}
	
	//You may use additional methods
}
