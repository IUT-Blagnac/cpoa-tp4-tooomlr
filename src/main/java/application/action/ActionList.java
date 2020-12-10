package application.action;


public interface ActionList extends Action {
	/**
	 * Title of the list of actions (menu).
	 *
	 * @return the title of the action list
	 */
	public String listTitle();

	/**
	 * The number of actions in the action list.
	 *
	 * @return number of actions in the action list.
	 */
	public int size();

	/**
	 * Add an action at the end of the list action if it does not yet exists.
	 *
	 * @param ac the action to add
	 * @return true if action is added, else false
	 */
	public boolean addAction(Action ac);
}