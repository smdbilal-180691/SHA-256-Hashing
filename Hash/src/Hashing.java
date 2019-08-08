import java.security.MessageDigest;

import java.util.Base64.*;

import java.util.Base64;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;
import java.io.BufferedInputStream;
import java.util.Scanner;

import java.io.*;
public class Hashing {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
       */
    // String val = reader.readLine(); 
    // Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		 Scanner scan = new Scanner(System.in);
     
    while (scan.hasNextLine()) { 
    	String var = scan.nextLine();
    	if(var.equalsIgnoreCase("")) {
            break;
        }
    	 String salt = "GitSalt";

         MessageDigest digest = MessageDigest.getInstance("SHA-256");

         digest.update(salt.getBytes("UTF-8"));

         digest.update(var.getBytes("UTF-8"));

         byte hash_byte[] = digest.digest();

         String hashed_string = (new BASE64Encoder()).encode(hash_byte);

         System.out.println(hashed_string);
         
         //stdin.close();
     }
    

        //String val = args[0];

       
	}

}
