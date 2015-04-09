import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

	//TODO: change 'usersandmessages' to reference used in FrontEnd
public class BackEnd {
	
		//users is the 2d array used by FrontEnd
		
		 String [][] usersandmessages = new String[0][0];				
		int x = usersandmessages.length;
		
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
		
		
		//add msg to the encoded file using Encoder.write
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
