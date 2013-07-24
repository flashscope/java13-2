package util;

/**
 * 문자열에 관련된 유용한 메소드를 모아 놓는다.
 */
public class StringUtil {
	
	/**
	 * 각 시스템상에 맞는 개행 방법을 얻는다.
	 */
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	/**
	 * 문자열에 개행문자를 더해서 반환을 해준다.
	 * @param str	개행문자를 더하고 싶은 문자열
	 * @return	입력한 문자열에 개행문자가 더해진 문자열
	 */
	public static String appendNewLine(String str){
		return str + NEW_LINE;
	}
	
	
}
