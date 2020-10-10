package by.jonline.string.main;

// С помощью функции копирования и операции конкатенации 
// составить из частей слова “информатика” слово “торт”.

public class Task4 {
	
	public static void main(String[] args) {
		
		String srcWord = "Информатика";
		
		String destword;
		
		destword = srcWord.charAt(7) + srcWord.substring(3, 5) + srcWord.charAt(7);
		
		System.out.println(destword);
	}
}