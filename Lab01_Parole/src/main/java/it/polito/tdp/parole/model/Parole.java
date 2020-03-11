package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	TreeMap<String, String> elenco= new TreeMap<String, String>();
		
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		elenco.put(p, p);
	}
	
	public List<String> getElenco() {
		LinkedList<String> mu=new LinkedList(elenco.values());
		return mu;
	}
	
	public void reset() {
		LinkedList<String> mu=new LinkedList(elenco.values());
		elenco.clear();
		mu.removeAll(mu);
	}
	
	public void remove(String p) {
		elenco.remove(p);
	}

}
