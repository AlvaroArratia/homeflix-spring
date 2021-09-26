package com.cursojava.pruebafinal.utils.tests;

import com.cursojava.pruebafinal.utils.TitleAnalyzerImpl1;

public class TestImpl1 {

	public static void main(String[] args) {
		TitleAnalyzerImpl1 titleAnalyzerImpl1 = new TitleAnalyzerImpl1();

		System.out.println("Title: film - Return: " + titleAnalyzerImpl1.analyze("film"));
		System.out.println("Title: film title - Return: " + titleAnalyzerImpl1.analyze("film title"));
		System.out.println("Title: good film title - Return: " + titleAnalyzerImpl1.analyze("good film title"));

		System.out.println("Title:  - Return: " + titleAnalyzerImpl1.analyze(""));
		System.out
				.println("Title: very good film title - Return: " + titleAnalyzerImpl1.analyze("very good film title"));
	}

}
