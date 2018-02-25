/**
 * 
 */
package test.com.ef;

/**
 * @author felipe
 *
 */
public class FileUtilTest {
	/* private static String HOME = System.getProperty("user.home");
	 @Test
	 public void givenPath_confirmIfFileExist_thenOk() {
		    Path p = Paths.get(HOME+"/access.log");
		    assertTrue(Files.exists(p));
	 }
	 @Test
	 public void givenFile_confirmIfFileNotEmpty_thenOk() {
		 Path path = Paths.get(HOME+"/access.log");
		 try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
			       assertNotNull(reader.readLine());
	     }catch(IOException ioe) {
	    	 System.err.println(ioe.getMessage());
	     }

	 }
	 @Test 
	 public void givenFile_readAllLines_thenOk() {
		 Path path = Paths.get(HOME+"/access.log");
		 try {
			 List accessList = Files.readAllLines(path);
			 assertNotNull(accessList);
		 } catch(IOException ioe) {
	    	 System.err.println(ioe.getMessage());
	     }
	 }
	 
	 @Test
	 public void givenFile_readAllLines_splitByDelimiter_thenOk() {
		 Path path = Paths.get(HOME+"/access.log");
		 try {
			 List<String> accessList = Files.readAllLines(path);
			Files.lines(path).forEach(row -> assertNotNull((row.split("\\|")[0])));
		 } catch(IOException ioe) {
	    	 System.err.println(ioe.getMessage());
	     }
	 }
	 @Test
	 public void givenString_splitItWithDelimiter_thenOk() {
		 List<String> lista = new ArrayList<>();
		 lista.add("2017-01-01 00:00:11.763|192.168.234.82|\"GET / HTTP/1.1\"|200|\"swcd (unknown version) CFNetwork/808.2.16 Darwin/15.6.0\"");
		 for(String row : lista) {
			 assertNotNull(row.split("\\|"));
		 }
	 }*/
}
