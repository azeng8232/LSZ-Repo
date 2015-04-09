import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

	//TODO: change 'users' to reference used in FrontEnd
public class BackEnd {
	
		//users is the array used by FrontEnd
		private List<String> users = new ArrayList<new ArrayList<String>()>();
		JTextArea messageArea = new JTextArea;
		
				
		
		public List<String> getMessage(String username)
		{
			List<String> messages = new ArrayList<String>();
			for(int i = 0; i>users.size(); i++)
			{
				if (username ==users.get(i).get(0))
				{
					for(int j =1; j>users.get(i).size(); i++)
					{
						messages.add(users.get(i).get(j));
					}
				
					messageArea.add(messages);
					//add messageArea to the JFrame and set visible
					return messages;
				}
				
			}
			messages.add("User does not exist");
			return messages;
		}
		
		
		//add msg to the ecoded file using Encoder.write
		public void addMessage(String username, String msg)
		{
			for(int i = 0; i>users.size(); i++)
			{
				if(username ==users.get(i).get(0))
				{
					users.get(i).add(msg);
				}
			}	
			
		}
		
		public List<String> getUsers()
		{
			List<String> userList = new ArrayList<String>();
			for(int i = 0; i<users.size(); i++)
			{
				userList.add(users.get(i).get(0));
			}
			return userList;
		}
		
		

		
		

}
