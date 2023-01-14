package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.RuntimeErrorException;

public class StringCalculator {
	int number = 0;
	public int add(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		try {
			if (text == null || text.isEmpty()) {
				return number;
			} else if (text.matches("[0-9]*")) {
				number = Integer.parseInt(text);
			} else if (text.matches("(.*)\\:(.*)") || text.matches("(.*)\\,(.*)")) {
				String[] numbers = text.split(",|:");
				for(int i = 0 ; i < numbers.length ; i++) {
					number += Integer.parseInt(numbers[i]);
				}
				return number;
			} else if (m.find()) {
				String customDelimeter = m.group(1);
				String[] tokens = m.group(2).split(customDelimeter);
				for (int j = 0 ; j < tokens.length ; j++) {
					number += Integer.parseInt(tokens[j]);
				}
			} else if (Integer.parseInt(text) < 0) {
				throw new Error("text는 음수가 아니되어야합니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return number;
	}

	
}
