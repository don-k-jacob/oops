import java.io.*;
import java.util.regex.*;
public class PatternMatchStrings
{
  public static void main (String[]args) throws IOException
  {
    try
    {
      FileWriter writer = new FileWriter ("test.txt");
        writer.write ("Writing in the test file!!!");
        writer.close ();
        System.out.println ("Successfully written to the file");
    }
    catch (IOException e)
    {
      System.out.println ("An error occurred.");
      e.printStackTrace ();
    }
    BufferedReader read = new BufferedReader (new FileReader ("test.txt"));
    Pattern pattern = Pattern.compile ("[A-Za-z][a-z]+");
    System.out.println ("Matched Content:");
    String line;
    while ((line = read.readLine ()) != null)
      {
	Matcher match = pattern.matcher (line);
	while (match.find ())
	  {
	    int start = match.start (0);
	    int end = match.end (0);
	    System.out.println (line.substring (start, end));
	  }
      }
}
     
}