package by.jonline.oopbasic.file.entity;

public class File {

	private String name;
	private Directory directory;

	public File() {
		name = "default";
		directory = new Directory();
	}

	public File(String name, Directory directory) {
		this.name = name;
		this.directory = directory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	// Создать файл
	public File create(String name, Directory directory) {
		File file = new File(name, directory);

		return file;
	}

	// Удалить файл
	public void delete() {
		name = null;
		directory = null;
	}

	// Переименовать файл
	public void rename(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		File other = (File) obj;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", directory=" + directory + "]";
	}

}
