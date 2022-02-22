package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.print(bytes.length + ", windows-1252, ");
        String novoString = new String(bytes, "windows-1252");
        System.out.println(novoString);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        novoString = new String(bytes, "UTF-16");
        System.out.println(novoString);

        bytes = s.getBytes("ASCII");
        System.out.print(bytes.length + ", ASCII, ");
        novoString = new String(bytes, "ASCII");
        System.out.println(novoString);

    }

}
