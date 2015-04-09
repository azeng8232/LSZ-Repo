import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Encoder {

	private File text;
	
	
	public Encoder(String filename){
		text = new File("encoded.txt");
	}
	public void write(String plaintext){
		int[] encodedData = new int[plaintext.length()];
		for(int i = 0; i < plaintext.length(); i++)
		{
			char[] chars = plaintext.toCharArray();
			encodedData[i] = (int)chars[i];
		}
		for(int i = 0; i < plaintext.length(); i++){
			System.out.print(encodedData[i] + " ");
		}
	}
	
	public List<String> read(){
		List<String> normalData = new ArrayList<String>();
		
		return normalData;
		
	}
	public static void main(String[] args)
	{
		Encoder en = new Encoder("test");
		en.write("chubs is a poopy");
		en.read();
	}
}
