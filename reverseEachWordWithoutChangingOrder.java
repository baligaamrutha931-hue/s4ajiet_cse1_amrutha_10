// Write a Java program to reverse each word in a given string without changing the order of the words.
// Example:
// Input:
// HELLO WORLD
// Output:
// OLLEH DLROW
public class Main
{
	public static void main(String[] args) {
		String s="Hello world";
		String[] words=s.split(" ");
		for(String word:words){
		    for(int i=word.length()-1; i>=0;i--){
		        System.out.print(word.charAt(i));
		        
		    }
		    System.out.print(" ");
		}
	}
}
