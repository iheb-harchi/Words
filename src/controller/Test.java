package controller;

import java.text.Normalizer;

public class Test {
public static void main(String[] args) {
	String a = "الناﺭ";
	String b = "النار";
	
	
	String c  = Normalizer.normalize(a, Normalizer.Form.NFKD);
	String d  = Normalizer.normalize(b, Normalizer.Form.NFKD);
	System.out.println(c.equals(d));
	System.err.println("-----------------------");
	System.err.println((a.charAt(0)==b.charAt(0)));
	System.err.println((a.charAt(1)==b.charAt(1)));
	System.err.println((a.charAt(2)==b.charAt(2)));
	System.err.println((a.charAt(3)==b.charAt(3)));
	System.err.println((a.charAt(4)==b.charAt(4)));
	System.err.println("-----------");
	System.err.println(Character.compare(a.charAt(4),b.charAt(4)));
}
}
