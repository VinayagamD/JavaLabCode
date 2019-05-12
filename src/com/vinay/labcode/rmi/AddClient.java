package com.vinay.labcode.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddClient {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry(1888);
            AddServerInf addServerInf = (AddServerInf) registry.lookup("addserver");
            System.out.println("The sum is "+addServerInf.add(5,6));
        }catch (Exception e){
            System.err.println("Exception : "+e);
        }
    }
}
