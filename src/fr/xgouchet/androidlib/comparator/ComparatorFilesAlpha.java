package fr.xgouchet.androidlib.comparator;

import java.io.File;
import java.util.Comparator;

/**
 * Compare files Alphabetically (w/ folders listed first)
 * 
 * @author x.gouchet
 * 
 */
public class ComparatorFilesAlpha implements Comparator<File> {

	/**
	 * @see Comparator#compare(Object, Object)
	 */
	public int compare(File file1, File file2) {
		int result;

		// sort folders first
		if ((file1.isDirectory()) && (!file2.isDirectory())) {
			result = -1;
		} else if ((!file1.isDirectory()) && (file2.isDirectory())) {
			result = 1;
		} else {
			// here both are folders or both are files : sort alpha
			result = file1.getName().toLowerCase()
					.compareTo(file2.getName().toLowerCase());
		}

		return result;
	}

}
