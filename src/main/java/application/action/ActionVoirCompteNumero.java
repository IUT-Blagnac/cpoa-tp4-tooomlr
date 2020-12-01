package application.action;

import banque.AgenceBancaire;

public class ActionVoirCompteNumero implements Action{

	String message,code;
	
	public ActionVoirCompteNumero() {
		
		this.message="v - Voir un compte (par son num�ro)";
		this.code="v";
		
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
		
	}

}
