/**
 * 
 */
package com.example.pocs.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.codec.binary.Base64;

/**
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */
public class FileEncryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		byte[] fileBytes = Files.readAllBytes(Paths.get("U:\\temp\\forest.jpg"));
		Encryptor encryptor = new Encryptor();
		
		String key="Bar12345Bar12345", iv="RandomInitVector";
		
		String s = encryptor.encrypt(key, iv, Base64.encodeBase64String(fileBytes));
		
		Files.write(Paths.get("U:\\temp\\encrypt-forest.jpg"), Base64.decodeBase64(s));
	}

}
