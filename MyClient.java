    import java.io.*;
import java.util.Scanner;    
    import java.net.*;  
    public class MyClient {  
    public static void main(String[] args) {  
    try{      
    Socket s=new Socket("localhost",6666); 
 
    DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
	Scanner sc=new Scanner(System.in);
	String send="";
	do{ 
	send=sc.next();
	dout.writeUTF(send); 
	dout.flush(); 
	}while(!send.equals("over"));
	      
    dout.close();  
    s.close();  
    }catch(Exception e){
	System.out.println(e);
    }  
    }  
    }  
