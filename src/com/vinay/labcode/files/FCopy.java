package com.vinay.labcode.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FCopy {

    public static void main(String[] args) {
        int i;
        try(
                FileInputStream fin = new FileInputStream(args[0]);
                FileOutputStream fout = new FileOutputStream(args[1])) {

                do{
                    i= fin.read();
                    if(i!= -1){
                        fout.write(i);
                    }
                }while (i != -1);

        }catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.err.println(e.getMessage());

        }
    }
}
