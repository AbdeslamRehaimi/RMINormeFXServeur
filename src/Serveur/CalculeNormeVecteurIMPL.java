/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author TOSHIBA
 */
public class CalculeNormeVecteurIMPL extends UnicastRemoteObject implements ServClient, ServClientPerv{
    
    public CalculeNormeVecteurIMPL() throws RemoteException {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public double calculeNormeVecteur(double x, double y) throws RemoteException {
  	return Math.sqrt((x*x)+(y*y));
    }
 
 
}
