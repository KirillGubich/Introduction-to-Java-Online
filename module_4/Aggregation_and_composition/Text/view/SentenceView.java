package by.jonline.composition.text.view;

import by.jonline.composition.text.entity.*;

public class SentenceView {

	// Вывод предложения
	public void view(Sentence sentence) {
		WordView wordView = new WordView();
		for (Word word : sentence.getSentence()) {
			wordView.view(word);
		}
		System.out.print(".");
	}

}
