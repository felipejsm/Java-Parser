package com.ef.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	 public Path getPath(String home, String logFileName) {
		 Path path = Paths.get(home+"/"+logFileName);
		 return path;
	 }
	 public List<String> getFileAsList(Path path) {
		 List<String> accessList = new ArrayList<>();
		 try {
			 accessList = Files.readAllLines(path);
		 } catch(IOException ioe) {
	    	 System.err.println(ioe.getMessage());
	     }
		 return accessList;
	 }
}
