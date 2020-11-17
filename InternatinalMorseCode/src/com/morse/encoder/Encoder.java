package com.morse.encoder;

import java.util.HashMap;

public class Encoder {

	static String result = "";

	public static String encoder(String line) {
		HashMap<Character, String> values = MorseValuesEncoder.encoderValueLoader();
		char[] val = line.toUpperCase().toCharArray();

		for(int j=0 ; j < val.length ; j++) {
			result += " "+values.get(val[j]);
		}	

		return result.replaceFirst(" ", "");
	}

}
