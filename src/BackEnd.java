import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

	
public class BackEnd {
		
		//returns a list of all plaintext messages submitted by a user
		public List<String> getMessage(String username)
		{
			
			Encoder user = new Encoder(username);
			return user.read();
		}
		
		
		//adds msg to the Encoded file(s) associated with username
		public void addMessage(String username, String msg)
		{
			Encoder user = new Encoder(username);
			user.write(msg);
		}
		
		//returns a list of all users who have submitted a message
		public List<String> getUsers()
		{
			File encodedList = new File("encodedList");
			List<String> usersList = new ArrayList<String>();
			File p = encodedList.getParentFile();
			String[] files = p.list();
			for(int i = 0; i <files.length; i++)
			{
				if(files[i].substring(files[i].length()-3, files[i].length())==".txt");
				usersList.add(files[i].substring(0,files[i].length()-3));
				
			}
			
			return usersList;
			
			
		}
		
		

		
		

}
