package model.echange.receiver.factory;

import model.connexion.factory.Fournisseur;
import model.echange.Achat;
import model.echange.receiver.IObject;


public class Proposition implements IObject{
	public Fournisseur fournisseur;
	
	public Achat achat;
	public AppelOffre appeloffre;
	public Justificatif justificatif;
	public Gamme gamme;
	public int numProposition;
	public String libelleProposition;
	public String contenu;
	public int date_publication;
	
	
	public void setResponse(){}


	@Override
	public void setLabel() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setContaint() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setID() {
		// TODO Auto-generated method stub
		
	};
}
