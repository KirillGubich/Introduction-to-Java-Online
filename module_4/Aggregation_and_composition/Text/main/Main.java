package by.jonline.composition.text.main;

import by.jonline.composition.text.entity.Sentence;
import by.jonline.composition.text.entity.Text;
import by.jonline.composition.text.entity.Word;
import by.jonline.composition.text.view.TextView;

// Создать объект класса Текст, используя классы Предложение, Слово. 
// Методы: дополнить текст, вывести на консоль текст, заголовок текста. 

public class Main {

	public static void main(String[] args) {
		
		Text text = new Text();
		TextView textView = new TextView();
		
		text.setTitle("Me and Java");		
		textView.viewTitle(text);
		
		Sentence firstSentence = new Sentence();
		
		firstSentence.addWord(new Word("I"));
		firstSentence.addWord(new Word("am"));
		firstSentence.addWord(new Word("learning"));
		firstSentence.addWord(new Word("Java"));
		
		text.addSentence(firstSentence);
		
		Sentence secondSentence = new Sentence();
		
		secondSentence.addWord(new Word("I"));
		secondSentence.addWord(new Word("dream"));
		secondSentence.addWord(new Word("to"));
		secondSentence.addWord(new Word("becoming"));
		secondSentence.addWord(new Word("a"));
		secondSentence.addWord(new Word("professional"));
		
		text.addSentence(secondSentence);
		
		textView.viewText(text);
	}

}
