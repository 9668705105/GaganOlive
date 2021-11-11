//question no7
package com.nt.array;

import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveDataType {
    
    public static void main(String[] args) throws IOException {
        
        FileOutputStream fos = new FileOutputStream("File.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(50000);
        dos.writeShort(2500);
        dos.writeByte(120);
        dos.close();
        
        FileInputStream fis = new FileInputStream("File.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println("Int   : "+dis.readInt());
        System.out.println("Short : "+dis.readShort());
        System.out.println("Byte  : "+dis.readByte());
        dis.close();        
    }
}