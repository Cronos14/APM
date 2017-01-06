package com.hitss.apppicmovil.utils;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;

public class AesUtils implements TextEncryptor {

	final private static String password = "P1)m0\\/l1@qps0mE";
	final private static String saltSalt = "42bfe4b5552d2442";
	final private String saltEncrypted;
		
	final private TextEncryptor desEncryptorsValue;
	
	final private static TextEncryptor encryptorsSalt = Encryptors.queryableText(password, saltSalt);
	
	public AesUtils(String saltEncrypted) {
		// TODO Auto-generated constructor stub
		this.saltEncrypted = saltEncrypted;
		desEncryptorsValue =  Encryptors.queryableText(password, encryptorsSalt.decrypt(saltEncrypted));
	}
	
	public AesUtils() {
		// TODO Auto-generated constructor stub
		saltEncrypted = encryptorsSalt.encrypt(KeyGenerators.string().generateKey());
		desEncryptorsValue =  Encryptors.queryableText(password, encryptorsSalt.decrypt(saltEncrypted));
	}
	
	@Override
	public String decrypt(String arg0) {
		return desEncryptorsValue.decrypt(arg0);
	}

	@Override
	public String encrypt(String arg0) {
		return desEncryptorsValue.encrypt(arg0);
	}

	public String getSaltEncrypted() {
		return saltEncrypted;
	}
 
}
