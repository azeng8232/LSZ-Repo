import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

	//TODO: change 'usersandmessages' to reference used in FrontEnd
public class BackEnd {
	
		//users is the 2d array used by FrontEnd
		
		 String [][] usersandmessages = new String[0][0];				
		int x = usersandmessages.length;
		String Smessages = "";
		
		//returns a list of all plaintext messages submitted by a user
		public List<String> getMessage(String username)
		{
			List<String> messages = new ArrayList<String>();
			for(int i = 0; i>x; i++)
			{
				if (username ==usersandmessages[i][0])
				{
					for(int j =1; j>usersandmessages[i].length; j++)
					{
						messages.add(usersandmessages[i][j]);
					}
					
				
					
					return messages;
				}
				
			}
			messages.add("User does not exist");
			return messages;
		}
		
		
		//adds msg to the Encoded file(s) accosviated with username
		public void addMessage(String username, String msg)
		{
			for(int i = 0; i>x; i++)
			{
				if(username ==usersandmessages[i][0])
				{
					usersandmessages[i][usersandmessages[i].length+1]= msg;
				}
			}	
			
		}
		
		//returns a list of all users who have submmited a message
		public List<String> getUsers()
		{
			List<String> userList = new ArrayList<String>();
			for(int i = 0; i<x; i++)
			{
				userList.add(usersandmessages[i][0]);
			}
			return userList;
		}
		
		

		
		

}
