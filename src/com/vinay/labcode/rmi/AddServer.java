package com.vinay.labcode.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddServer {

    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.createRegistry(1888);
            AddServerImpl addServer = new AddServerImpl();
            registry.rebind("addserver",addServer);
            System.out.println("System is ready");
        }catch (Exception e){
            System.err.println("Exception : "+e);
        }
    }
}
