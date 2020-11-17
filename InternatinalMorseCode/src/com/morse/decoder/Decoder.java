package com.morse.decoder;

import java.util.HashMap;

public class Decoder {
	
	
	static String result = "";

	public static String decoder(String line) {
		HashMap<String , Character> values = MorseValuesDecoder.decoderValueLoader();

		String[] val = line.split(" ");

		for(int j=0 ; j < val.length ; j++) {
			result +=values.get(val[j]);
		}	

		return result;
	}
	
}
