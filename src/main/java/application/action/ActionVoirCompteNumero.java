package application.action;

import java.util.Locale;
import java.util.Scanner;

import banque.AgenceBancaire;
import banque.Compte;

public class ActionVoirCompteNumero implements Action{

	private String message,code;
	
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
		System.out.print("Num compte -> ");
		
		Compte c;
		
		
		Scanner lect;
		
		lect = new Scanner ( System.in );
		lect.useLocale(Locale.US);
		String numero = lect.next();
		
		c = ag.getCompte(numero);
		if (c==null) {
			System.out.println("Compte inexistant ...");
		} else {
			c.afficher();
		}

		
	}

}
