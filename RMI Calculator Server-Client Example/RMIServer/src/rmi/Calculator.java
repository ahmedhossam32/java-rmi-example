/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * 
 */

// This is the class which have the implmentations for the methods that will be invoked later remotely
public class Calculator extends UnicastRemoteObject implements CalculatorInterface {

    Result lastResult = new Result();
    public Calculator() throws RemoteException {
    }

    @Override
    public Result add(int x, int y) throws RemoteException {
        lastResult.setResult(x+y);
        return lastResult;
    }

    @Override
    public Result getLastResult() throws RemoteException {
        return lastResult;
    }

    @Override
    public Result sub(int x, int y) throws RemoteException {
         lastResult.setResult(x-y);
        return lastResult;
    }



    
}

