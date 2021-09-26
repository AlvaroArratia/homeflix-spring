package com.cursojava.pruebafinal.utils.tests;

import com.cursojava.pruebafinal.utils.TitleAnalyzerImpl2;

public class TestImpl2 {

	public static void main(String[] args) {
		TitleAnalyzerImpl2 titleAnalyzerImpl2 = new TitleAnalyzerImpl2();

		System.out.println("Title: Aeiou - Return: " + titleAnalyzerImpl2.analyze("Aeiou"));
		System.out.println("Title: Aeio aeio - Return: " + titleAnalyzerImpl2.analyze("Aeio aeio"));
		System.out.println("Title: Aeiou aeiou - Return: " + titleAnalyzerImpl2.analyze("Aeiou aeiou"));
		System.out.println("Title: Aeiou aeiou aeiou - Return: " + titleAnalyzerImpl2.analyze("Aeiou aeiou aeiou"));
		System.out.println("Title:  - Return: " + titleAnalyzerImpl2.analyze(""));
	}

}
