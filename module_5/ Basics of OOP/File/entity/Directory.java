package by.jonline.oopbasic.file.entity;

import java.util.ArrayList;

public class Directory {
	
	private String path;
	private ArrayList<File> files;
	
	public Directory(String path, ArrayList<File> files) {
		super();
		this.path = path;
		this.files = files;
	}

	public Directory() {
		path = "default";
		files = new ArrayList<File>();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ArrayList<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [path=" + path + "]";
	}
	
	
	
}
