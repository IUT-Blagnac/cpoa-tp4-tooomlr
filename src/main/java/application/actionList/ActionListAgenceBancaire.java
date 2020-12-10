package application.actionList;

import java.util.ArrayList;

import application.action.Action;
import application.action.ActionList;
import banque.AgenceBancaire;

public class ActionListAgenceBancaire implements ActionList{

	
	
	String message, code,title;
	
	ArrayList<Action> listeActions;
	
	public ActionListAgenceBancaire(String message, String code, String title, ArrayList <Action> listeActions) {
		super();
		this.message = message;
		this.code = code;
		this.title = title;
		this.listeActions = listeActions;
	}
	
	@Override
	public String actionMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String actionCode() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("Menu de " + ag.getNomAgence() + " (" + ag.getLocAgence() + ")");
		
		for(int i=0; i<this.listeActions.size(); i++) {
			System.out.println(listeActions.get(i).actionCode() + " - " + listeActions.get(i).actionMessage());
		}

		System.out.println("q - Quitter");
		System.out.print("Choix -> ");
		
		
	}

	@Override
	public String listTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return listeActions.size();
	}

	@Override
	public boolean addAction(Action ac) {
		// TODO Auto-generated method stub
		boolean bool = true;
				
				for(int i=0; i<this.size(); i++) {
					if(listeActions.get(i).equals(ac)) {
						bool = false;
					}
				}
				
				if (bool == true) {
				 listeActions.add(ac);
				}
				
				return bool;
	}

}
