package util;

public class StringUtil {
	
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	public StringUtil(){
		//nothing
	}
	
	public static String appendNewLine(String str){
		return str + NEW_LINE;
	}
	
	
}
