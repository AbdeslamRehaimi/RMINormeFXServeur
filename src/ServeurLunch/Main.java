/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServeurLunch;
        
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

import Serveur.ServClient;
import Serveur.ServClientPerv;
import Serveur.CalculeNormeVecteurIMPL;

/**
 *
 * @author TOSHIBA
 */
public class Main {
    public static void main(String[] args){
        try{
            LocateRegistry.createRegistry(1099);
            System.out.println("Serveur: Construction de l'implémentation ");
            ServClientPerv rev = new CalculeNormeVecteurIMPL();
            System.out.println("Objet Reverse lié dans le RMIregistry");
            Context nomContext = new InitialContext();
            nomContext.rebind("rmi:ServClient", rev);
            System.out.println("Attente des invocations des clients ");
        }catch(Exception e){
            System.out.println("Erreur de liaison de l'object reverse");
            System.out.println(e.toString());
        }
    }
    
}
