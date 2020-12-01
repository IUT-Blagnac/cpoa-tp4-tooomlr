package application.action;

import banque.AgenceBancaire;
/**
 * An Action is an object that implements some action of a user's menu.<BR>
 * It is defined by a message, an optional code, an execute method to "do" the action.
 */
public interface Action  {
	/**
	 * Message of the action (to show on screen).
	 *
	 * @return the message of the action
	 */
	public String actionMessage ();

	/**
	 * Code of the action (may be used to identify the action among other ones).
	 *
	 * @return the code of the action
	 */
	public String actionCode ();

	/**
	 * The method to call in order to "execute" the action on <code>ag</code>.
	 *
	 * @param ag the AgenceBancaire on which the action may act on
	 * @throws Exception when an uncaught exception occurs during execution
	*/
	public void execute(AgenceBancaire ag) throws Exception;
}
