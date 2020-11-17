package com.morse;

import java.util.Scanner;

import com.morse.decoder.Decoder;
import com.morse.encoder.Encoder;

public class Runner {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

	private static void menu() {
		System.out.println("\n\nMorse Encoder and Decoder\n\n");
		System.out.println("Enter Your Choice:");
		System.out.println("1. Encode Into Morse Code");
		System.out.println("2. Decode Morse Code");
		System.out.println("3. Exit");
		System.out.print("Choice:->");
		char ch = scan.next().charAt(0);
		switch(ch) {
		case '1':
			scan.nextLine();
			System.out.print("Enter statement:->");
			String lineToBeEncoded = scan.nextLine();
			String encodedResult = Encoder.encoder(lineToBeEncoded);
			System.out.println("Encoded Value is:->" + encodedResult);
			break;
		case '2':
			scan.nextLine();
			System.out.print("Enter statement:->");
			String lineToBeDecoded = scan.nextLine();
			String decodedResult = Decoder.decoder(lineToBeDecoded);
			System.out.println("Decoded Value is:->" + decodedResult);
			break;
		case '3':
			System.out.println("Process Terminated!!!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Enter again!!!!!");
			break;
		}
		
	}

}
