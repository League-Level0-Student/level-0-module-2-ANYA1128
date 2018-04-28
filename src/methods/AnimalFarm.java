package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {
	public static void main(String[] args) {
		AnimalFarm farm = new AnimalFarm();
		
		}
		


	public AnimalFarm() {
		for(int i=0; i<10; i++) { 
		String animalsound = 
				JOptionPane.showInputDialog(null, "Which animal's sound do you want to play?"
						+ "  CAT?"
						+ "  DOG?"
						+ "  LLAMA?"
						+ "  COW?"
						+ "  DUCK?");
				if (animalsound.equalsIgnoreCase("CAT")) {
				playMeow();
				}
				else if (animalsound.equalsIgnoreCase("COW")) {
					playMoo();
					}
				else if (animalsound.equalsIgnoreCase("DOG")) {
					playWoof();
					}
				else if (animalsound.equalsIgnoreCase("DUCK")) {
					playQuack();
					}
				else if (animalsound.equalsIgnoreCase("LLAMA")) {
					playLlama();
					}
		};
				
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 

		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}
	
	
	
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
