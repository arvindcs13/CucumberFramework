package manager;

import configFileReader.PeropertyFileReader;

public class FileManager {

	private static FileManager fileReaderManager = new FileManager();
	private static PeropertyFileReader configFileReader;

	private FileManager() {
	}

	 public static FileManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public PeropertyFileReader getConfigReader() {
		 return (configFileReader == null) ? new PeropertyFileReader() : configFileReader;
	 }
}
