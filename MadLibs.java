
import java.io.File;
import java.util.ArrayList;
import java.util.*;


public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> adj = new ArrayList<String>();
		ArrayList<String> adv = new ArrayList<String>();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.

		//2. Read a verbs.txt file and store its list of verbs into an arraylist.

		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.

		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
		Scanner kb = new Scanner(System.in);
		System.out.print ("Gimme a MadLibs story file");
		String fileName = kb.next();
		File story = new File (fileName);
		Scanner reader = new Scanner(story);
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String word = "";
			int num = 0;
			while (line.substring(num,num+1)!= " ") {
				word += line.substring(num,num+1);
			}
			if (word == "<<NOUN>>") {
				word = nouns.get(Math.random()*nouns.size());
				System.out.print(word + " ");
			}
			else if (word == "<<VERB>>") {
				word = verbs.get(Math.random()*verbs.size());
				System.out.print(word + " ");
			}
			else (!word.equals("<<NOUN>>") && !word.equals("<<VERB>>")) {
				System.out.print(word + " ");
			}
			

		}
		

	}

}
