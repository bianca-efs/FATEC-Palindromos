package controller;

import util.pilha;

public class PalindromoController {

	public static String invertePalavra (String plv) {		
		String plv2 = "";
		pilha inverplv = new pilha ();
		
		for (int i = 0; i < plv.length(); i++) {
	        inverplv.push(plv.substring(i, i + 1));
	    }
		
		while (!inverplv.pilhaVazia()) {
			plv2 += inverplv.pop();
		}
		
		return plv2;
	}
	
	public static boolean comparaPalavras(String plv) {
		String plv2 = invertePalavra(plv);
		boolean test = plv2.equalsIgnoreCase(plv);
		return test;
	}
}
