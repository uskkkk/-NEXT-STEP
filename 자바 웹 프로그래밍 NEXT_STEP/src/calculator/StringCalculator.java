package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

public class StringCalculator {
	
	public int add(String text) {
			int number = 0;
		
			if(isBlank(text)) {
				return number;
			}
			
		return sum(split(text));
	}
	
	public int sum(String[] values) {
		int sum = 0;
		for (String value : values) {
			sum += Integer.parseInt(value);
		}
		return sum;
	}

	public boolean isBlank(String text) {
		return text.isEmpty() || text == null;
	}
	
	public String[] split(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		
		if (m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return text.split(":|,");
	}
	
}
