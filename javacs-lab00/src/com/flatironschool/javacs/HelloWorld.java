package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        Double ver;
	String verString;
	verString = System.getProperty("java.version");
	ver = Double.parseDouble(verString);
	return ver;
    }

    public static void main(String[] args) {
	System.out.println(getVersion());
    }
}
