package Lab2b;

import java.util.Arrays;

/*  Comp3111L-Lab2/Lab2b/Book.java       */
public class Book {
	private final String[] chapters;
	private static final int DEFAULT_CHAPTERS = 10;

	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for (int i = 0; i < chapters.length; i++)
			chapters[i] = "n/a";
	}

	public Book(String[] argument) {
		/* construct the object with an array of chapter names */
		/* PLEASE ADD YOUR CODE HERE */
		this.chapters = new String[Math.max(DEFAULT_CHAPTERS, argument.length)];
		Arrays.fill(this.chapters, "n/a");
		System.arraycopy(argument, 0, this.chapters, 0, argument.length);
	}

	public String getChapter(int i) {
		/* return the chapter by the given index */
		/* PLEASE ADD YOUR CODE HERE */
		return getChapters()[i];
	}

	public String[] getChapters() {
		return chapters;
	}
}
