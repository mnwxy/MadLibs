import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.

		ArrayList<String> nouns = new ArrayList<String>();
		ArrayList<String> verbs = new ArrayList<String>();
		ArrayList<String> adj = new ArrayList<String>();
		ArrayList<String> adv = new ArrayList<String>();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		//line breaks will split up the nouns.txt files
		//we are using scanner
		ConvertNewlineDelimitedTextFileToArrayList("nouns.txt", nouns);

		//2. Read a verbs.txt file and store its list of verbs into an arraylist.

		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.

		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

	}

	public static void ConvertNewlineDelimitedTextFileToArrayList(String filename, ArrayList<String> arrayList)
	{
		try{
			File nounsFile = new File(filename);
			Scanner nounsFileReader = new Scanner(nounsFile);
			while(nounsFileReader.hasNextLine())
			{
				String nextNoun = nounsFileReader.nextLine();
				arrayList.add(nextNoun);
			}
			nounsFileReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("oof");
		}
	}

}
