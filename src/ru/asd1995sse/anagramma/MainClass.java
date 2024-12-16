package ru.asd1995sse.anagramma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	//public static final String  input = "Привет! Я женя и у меня горит очаг, но в UTF-8!"; 
	//public static final String  input = "А вот анаграмма, которую я составил с помощью своей прграммы. Внезапно да? Ну я а что? Я потратил на создание этого поста целых 15 минут! Всем приятного вечера! И см мою историю, там исходный код!"; 
	public static final String  input = "Тут нет расшифровки сообщения, обойдетесь"; 
	public static String output = "";
	
	public static void main(String[] args) {
		toAnagramm(input);
	}

	public static void toAnagramm(String in) {
		String[] f = in.split(" ");
		//System.out.println(f.length);
		
		for(int j =0; j<f.length; j++) {
			//System.out.println(shuffleString(f[j]));
			output = output + " " + shuffleString(f[j]);
		}
		System.out.println(output);
	}
	//Тихо спер и пошел, называется нашёл!
public static String shuffleString(String input) { 
        
        List<Character> characters = new ArrayList<>(); 
        for (char c : input.toCharArray()) { 
            characters.add(c); 
        } 
  
        Collections.shuffle(characters); 
          
        StringBuilder shuffledString = new StringBuilder(); 
        for (char c : characters) { 
            shuffledString.append(c); 
        } 
  
        return shuffledString.toString(); 
    } 
	
}
