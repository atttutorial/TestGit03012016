package com.test;

import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Demofreetts {  
	public static void main(String[] args) {
		String abc;
		System.out.print("Enter your text: ");  
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		abc = input.nextLine();
		Demofreetts.textToSpeech(abc);
		
	}  
	public static void textToSpeech(String abc){
		String VOICENAME = "kevin16";  
		Voice voice;  
		VoiceManager voiceManager = VoiceManager.getInstance();  
		voice = voiceManager.getVoice(VOICENAME);  
		voice.allocate();  
		voice.setRate(120);  
		voice.setPitch(100);  
		try {  
			voice.speak(abc);  

		} catch (Exception e) {  
			e.printStackTrace();  
		}  

	}

}  