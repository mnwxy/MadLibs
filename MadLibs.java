
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;


public class MadLibs {

	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList < String > nouns = new ArrayList < String > ();
		ArrayList < String > verbs = new ArrayList < String > ();
		ArrayList < String > adj = new ArrayList < String > ();
		ArrayList < String > adv = new ArrayList < String > ();
		
		Scanner kbADJ = new Scanner(System.in);
		System.out.print ( "Adjectives" );
		String fileName = kbADJ.next );
		File fileADJ = new File ( fileNameaADJ );
		Scanner readerADJ = new Scanner ( fileADJ );
		while ( readerADJ.hasNextLine() )
		{
			String line = readerADJ.nextLine();
			adv.add(line);
		}
		readerADJ.close();
	}
}
