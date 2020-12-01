package application.action;

import banque.AgenceBancaire;

public class ActionListeDesComptes implements Action{

	
	String message,code;
	
	public ActionListeDesComptes() {
		
		this.message="l - Liste des comptes de l'agence";
		this.code="l";
		
	}
	
	@Override
	public String actionMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String actionCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(AgenceBancaire ag) throws Exception {
		// TODO Auto-generated method stub
		
		ag.afficher();
		
	}

	
}
