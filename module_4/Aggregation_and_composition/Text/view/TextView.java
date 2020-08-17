package by.jonline.composition.text.view;

import by.jonline.composition.text.entity.*;

public class TextView {
	
	// Вывод заголовка текста
	public void viewTitle(Text text) {
		System.out.println("Title: " + text.getTitle());
	}
	
	// Вывод текста
	public void viewText(Text text) {
		SentenceView sentenceView = new SentenceView();
		for (Sentence sentence : text.getText()) {
			sentenceView.view(sentence);
		}
	}

}
