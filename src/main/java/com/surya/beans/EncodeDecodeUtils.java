package com.surya.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtils {
	
	public String encode(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeString = encoder.encodeToString(text.getBytes());
		return encodeString;
	}
	
	public String decode(String encodeStr)  
	{
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodeStr);
		// convert byte[] to String.
		return new String(decode);
		
	}
	
	public static void main(String[] args) 
	{
		EncodeDecodeUtils utils = new EncodeDecodeUtils();
		String encode = utils.encode("Surya") ;
		System.out.println(encode);
		
		String decode = utils.decode(encode);
		System.out.println("Decoded ::"+decode);
		
	}

}
