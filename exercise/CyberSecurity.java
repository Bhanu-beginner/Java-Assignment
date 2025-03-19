package com.exercise;
class Encryption {
    
    public String decodeMessage(String message) {
        return message.replaceAll("[AEIOUaeiou]", "");
    }

    public String encodeMessage(String message) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelIndex = 0;
        StringBuilder encodedMessage = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                encodedMessage.append(' ');
            } else {
                encodedMessage.append(ch).append(vowels[vowelIndex]);
                vowelIndex = (vowelIndex + 1) % 5; 
            }
        }

        return encodedMessage.toString();
    }
}


public class CyberSecurity {

	public static void main(String[] args) {
		 Encryption obj = new Encryption();
		 System.out.println(obj.decodeMessage("oriGinal MessAge"));
		 System.out.println(obj.encodeMessage("QWRT cvbN MnKL")); 
	}

}