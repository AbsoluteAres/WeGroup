package server;

import java.util.ArrayList;
import java.util.List;

// NEW -RB
// TO DO: 	
//		
//		3 - Add a timer for ending poll
//	
public class Poll_server 
{
		
	String poll_id;
	List<Poll_element> poll_contents;
	List<String> votedUsers;
	String createrId;
	
	/**
	 * Creates a Poll with a name, and creates an empty content list.
	 * @param name	the id/name/title of the Poll
	 */
	public Poll_server(String name,String createrId) {
		this.poll_id = name;
		this.poll_contents = new ArrayList<Poll_element>();
		this.votedUsers = new List<String>;
		this.createrId = createrId;
	}
	
	/**
	 * Adds an string item into the poll option.
	 * 		Will create a poll element to keep track of votes for the item
	 * @param item	the item being added to the poll
	 */
	public void add_item(String item) {
		Poll_element element = new Poll_element(item);
		this.poll_contents.add(element);
	}
	
	/**
	 * Casts a vote to the item being voted on
	 * @param item	the item a vote is being added to
	 */
	public void add_vote(String item, String userId) {
			if(checkUserVoted(userId))
			{
				element.removeVote();
				removeUserVoted(userId);
			}
		for(Poll_element element : poll_contents) {
			
			if(item == element.getItem()) {
				element.addVote();
				addUserVoted(userId);
				break;
			}
		}
	}
	
	
	/**
	 * Gets the id/name/title of the poll
	 * @return	the id/name/title of the poll
	 */
	public String getID() {
		return poll_id;
	}
	
	
	/**
	 * Gets the list of all the elements of the poll. 
	 * @return	the list of poll elements, as poll_element
	 */
	public List<Poll_element> getContent() {
		return poll_contents;
	}




	public void addUserVoted(string user){
		votedUsers.add(user)

	{
	public boolean checkUserVoted(string user){
		return if(votedUsers.contains(user));
	}
	public void removeUserVoted(string user){
		votedUsers.remove(new String(user));

	}
