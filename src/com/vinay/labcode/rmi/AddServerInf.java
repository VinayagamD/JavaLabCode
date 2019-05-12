package com.vinay.labcode.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerInf extends Remote {

    double add(double d1, double d2) throws RemoteException;
}
