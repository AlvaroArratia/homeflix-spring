package com.cursojava.pruebafinal.utils;

public class TitleAnalyzerImpl1 implements TitleAnalyzer {

	@Override
    public int analyze(String filmTitle) {
        String[] words = filmTitle.split(" ");
        if (words.length == 1) {
            return -1;
        } else if (words.length == 2) {
            return 0;
        } else if (words.length > 2) {
            return 1;
        } else {
            return -2;
        }
    }
}
