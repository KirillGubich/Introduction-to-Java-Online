package by.jonline.composition.text.view;

import by.jonline.composition.text.entity.Word;

public class WordView {
	
	// Вывод слова
	public void view(Word word) {
		System.out.print(" " + word.getWord());
	}

}
