package com.vinay.labcode.internet;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetPrgm {

    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        URL hp = new URL("http://www.osborne.com/download");
        System.out.println("Protocol:"+hp.getProtocol());
        System.out.println("Port    :"+hp.getPort());
        System.out.println("Host    :"+hp.getHost());
        System.out.println("File    :"+hp.getFile());
        System.out.println("Ext     :"+hp.toExternalForm());
        InetAddress someHost;
        byte bytes[];
        int fourBytes[] = new int[4];
        if(args.length == 0){
            someHost= InetAddress.getLocalHost();
        }else {
            someHost = InetAddress.getByName(args[0]);
        }

        System.out.println("Host '"+someHost.getHostName()+"' has address: ");
        bytes = someHost.getAddress();
        for (int i = 0; i <4; i++) {
            fourBytes[i]= bytes[i]&255;
        }
        System.out.println(fourBytes[0]+"."+fourBytes[1]+"."+fourBytes[2]+"."+fourBytes[3]);
    }
}
