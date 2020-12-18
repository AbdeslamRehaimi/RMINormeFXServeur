/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveur;
        
import java.rmi.RemoteException;
/**
 *
 * @author TOSHIBA
 */


public interface ServClientPerv extends ServClient {
    double calculeNormeVecteur(double x, double y) throws RemoteException; 
}
