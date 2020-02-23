

package br.com.lindomar.strings;

public class Split_classeJava {
    public static void main(String[] args) {
        String str = new String("Lindomar Bassetti do Nascimento aprendendo Java");
        String s1[] = str.split(" ");
        for (String palavra : s1) {
            System.out.println(palavra);
            
        }
        
    }
}