package org.paulobichara.bulkmailer.view;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class HtmlFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
	    if (f.isDirectory()) {
	    	return true;
        }
		
		if (f.getName().endsWith(".htm") || f.getName().endsWith(".html") || f.getName().endsWith(".HTM") || f.getName().endsWith(".HTML")) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "HTML files";
	}

}
