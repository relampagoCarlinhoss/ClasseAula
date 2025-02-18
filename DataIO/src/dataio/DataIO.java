/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dataio;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("ainda.txt"))){
    
}catch(IOException e){
    System.out.println("erro:"+e.getMessage());
}}
    
}
