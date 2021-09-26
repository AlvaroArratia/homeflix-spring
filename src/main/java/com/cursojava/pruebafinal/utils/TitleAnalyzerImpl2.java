package com.cursojava.pruebafinal.utils;

public class TitleAnalyzerImpl2 implements TitleAnalyzer {

	@Override
	public int analyze(String filmTitle) {
		int count = 0;
		for (int x = 0; x < filmTitle.length(); x++) {
			if ((filmTitle.charAt(x) == 'a') || (filmTitle.charAt(x) == 'e') || (filmTitle.charAt(x) == 'i')
					|| (filmTitle.charAt(x) == 'o') || (filmTitle.charAt(x) == 'u')) {
				count++;
			}
		}

		if (count < 8) {
			return -1;
		} else if (count >= 8 && count <= 12) {
			return 0;
		} else if (count > 12) {
			return 1;
		} else {
			return -2;
		}
	}
}
