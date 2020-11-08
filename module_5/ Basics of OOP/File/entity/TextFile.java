package by.jonline.oopbasic.file.entity;

public class TextFile extends File {

	private static String extension = ".txt";
	private String content;

	public TextFile(String name, Directory directory, String content) {
		super(name, directory);
		this.content = content;
	}

	public TextFile(String name, Directory directory) {
		super(name, directory);
		content = "";
	}

	public TextFile() {
		super();
		content = "";
	}

	public static String getExtension() {
		return extension;
	}

	public static void setExtension(String extension) {
		TextFile.extension = extension;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// Дополнить содержимое
	public void addContent(String content) {
		this.content += content;
	}

	// Вывести содержимое
	public void viewContent() {
		System.out.println(content);
	}
	
	@Override
	public File create(String name, Directory directory) {

		TextFile textFile = new TextFile(name, directory);
		return textFile;
	}

	public File create(String name, Directory directory, String content) {

		TextFile textFile = new TextFile(name, directory, content);
		return textFile;
	}

	@Override
	public void delete() {
		super.delete();
		content = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

}
