
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;


public class MadLibs {

	public static void main(String[] args) throws FileNotFoundException
	{
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		ArrayList < String > nouns = new ArrayList < String > ();
		ArrayList < String > verbs = new ArrayList < String > ();
		ArrayList < String > adj = new ArrayList < String > ();
		ArrayList < String > adv = new ArrayList < String > ();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.

		//2. Read a verbs.txt file and store its list of verbs into an arraylist.

		Scanner kbadj = new Scanner ( System.in );
		System.out.print ( "Adjectives" );
		String fileNameadj = kbadj.next ();
		File wordsadj = new File ( fileNameadj ) ;
		Scanner readeradj = new Scanner ( wordsadj );
		while ( readeradj.hasNextLine () )
		{
			String lineADJ = readeradj.nextLine ();
			String wordADJ = "";
			int number = 0;
			while (lineADJ.substring ( number, number + 1 ) != null)
			{
				if (!lineADJ.substring( number,number + 1 ).equals(" "))
				{
					wordADJ += lineADJ.substring ( number, number + 1 );
				}
				else
				{
					adj.add ( wordADJ );
					wordADJ = "";
				}
				number++;
			}

		Scanner kb = new Scanner(System.in);
		System.out.print ("Gimme a list of adverbs");
		String fileName = kb.next();
		File words = new File (fileName);
		Scanner reader = new Scanner ( words );
		while (reader.hasNextLine())
		{
			String line = reader.nextLine();
<<<<<<< HEAD
			String word = "";
			int num = 0;
			while (line.substring(num, num+1) != null) {
				if (!line.substring(num,num+1).equals(" ")) {
					word += line.substring(num,num+1);
				}
				else
				{
					adv.add(word);
					word = "";
				}
				num++;
			}
=======
			adv.add(line);
>>>>>>> e755812d6735f1b1722c82d2fa4955c33feecd73
		}
		Joe;
			
		

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
		
		

	}

}
	
}
