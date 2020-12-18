/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author TOSHIBA
 */
public interface ServClient extends Remote{
    double calculeNormeVecteur(double x, double y) throws RemoteException;
}
