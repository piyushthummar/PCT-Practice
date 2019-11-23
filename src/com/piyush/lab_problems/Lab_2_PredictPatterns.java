package com.piyush.lab_problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab_2_PredictPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfLines = sc.nextInt();
		String[] paragraph = new String[noOfLines];
		int index = 0;
		ArrayList<String> al = new ArrayList<>();
		// Logic to scan multiple lines, 
		// we have to put once sc.nextLine(); otherwise, it won't scan 1st input
		sc.nextLine();
		for(index = 0; index < noOfLines; index++) {
			paragraph[index] = sc.nextLine();
			String[] strings = paragraph[index].split("\\s+");
			for(String str : strings) {
				al.add(str);
			}
		}

		int typeOfNGram = sc.nextInt();
		
		int countForNgram = 0;
		String nGramToSearch = null;
		HashMap<String, Integer> nGramMap = new HashMap<>();
		
		for(String str : al) {
			if(typeOfNGram == 1 && str.length() >= 1) {
				for(index = 0; index < str.length(); index++) {
					if(!Character.toString(str.charAt(index)).equals(".") && 
							!Character.toString(str.charAt(index)).equals(",") && 
							!Character.toString(str.charAt(index)).equals(" ")) {
						
						if(nGramMap.containsKey(Character.toString(str.charAt(index)))) {
//							int count = nGramMap.get(Character.toString(str.charAt(index)));
//							nGramMap.put(Character.toString(str.charAt(index)), count+1);
							
							//Alternative way of above 2 lines to update value for key
							nGramMap.computeIfPresent(Character.toString(str.charAt(index)), (k,v) -> v+1);

						} else {
							nGramMap.put(Character.toString(str.charAt(index)), 1);
						}
					}
				}
			} else if(typeOfNGram == 2 && str.length() >= 2) {
				for(index = 0; index < str.length() - 1; index++) {
					if(!Character.toString(str.charAt(index)).equals(".") && 
							!Character.toString(str.charAt(index)).equals(",") && 
							!Character.toString(str.charAt(index)).equals(" ")) {
						nGramToSearch = Character.toString(str.charAt(index)) + Character.toString(str.charAt(index + 1));
						if(nGramMap.containsKey(nGramToSearch)) {
//							int count = nGramMap.get(nGramToSearch);
//							nGramMap.put(nGramToSearch, count+1);
							
							//Alternative way of above 2 lines to update value for key
							nGramMap.computeIfPresent(nGramToSearch, (k,v) -> v+1);

						} else {
							nGramMap.put(nGramToSearch, 1);
						}
					}
				}
				
			} else if(typeOfNGram == 3 && str.length() >= 3) {
				for(index = 0; index < str.length() - 2; index++) {
					if(!Character.toString(str.charAt(index)).equals(".") && 
							!Character.toString(str.charAt(index)).equals(",") && 
							!Character.toString(str.charAt(index)).equals(" ")) {
						nGramToSearch = Character.toString(str.charAt(index)) + Character.toString(str.charAt(index + 1)) + Character.toString(str.charAt(index + 2));
						if(nGramMap.containsKey(nGramToSearch)) {
//							int count = nGramMap.get(nGramToSearch);
//							nGramMap.put(nGramToSearch, count+1);
							
							//Alternative way of above 2 lines to update value for key
							nGramMap.computeIfPresent(nGramToSearch, (k,v) -> v+1);

						} else {
							nGramMap.put(nGramToSearch, 1);
						}
					}	
				}
			}
		}
		
		Map.Entry<String, Integer> maxEntry = null;
		for(Map.Entry<String, Integer> entry : nGramMap.entrySet()) {
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		
		//System.out.println("key = " + maxEntry.getKey() + " <-> value = " + maxEntry.getValue());
		
		if(typeOfNGram == 1) {
			System.out.println("Unigram " + maxEntry.getKey());
		} else if(typeOfNGram == 2) {
			System.out.println("Bigram " + maxEntry.getKey());
		} else if(typeOfNGram == 3) {
			System.out.println("Trigram " + maxEntry.getKey());
		}
	}

}
