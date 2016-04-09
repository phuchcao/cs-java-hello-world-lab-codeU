package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String verString = System.getProperty("java.specification.version");
	Double ver = Double.parseDouble(verString);
	return ver;
    }

    public static void main(String[] args) {
	System.out.println(getVersion());
    }
}
