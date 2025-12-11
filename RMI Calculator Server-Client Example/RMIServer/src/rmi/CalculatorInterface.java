/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * 
 */

// The remote interface which is on both client and the server (it is the same on both)
// It is extends Remote as this interface will be remote
public interface CalculatorInterface extends Remote {
    
    public Result add(int x, int y) throws RemoteException;
   
    public Result getLastResult() throws RemoteException;
    
    public Result sub(int x, int y) throws RemoteException;

   
}

