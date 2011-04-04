package org.paulobichara.bulkmailer.view;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class CSVFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
	    if (f.isDirectory()) {
	    	return true;
        }
		
		if (f.getName().endsWith(".csv") || f.getName().endsWith(".CSV")) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		return "CSV files";
	}

}
