package com.fabrick.demo.utils;

/**
 * Utility class to stash some regex patterns to use with Spring's validation system
 */
public class RegexUtils {

	public static final String fiscalCodeValidationRegex = "^([A-Z]{6}[0-9LMNPQRSTUV]{2}[ABCDEHLMPRST]{1}[0-9LMNPQRSTUV]{2}[A-Z]{1}[0-9LMNPQRSTUV]{3}[A-Z]{1})$|([0-9]{11})$";
	public static final String nameValidationRegex = "^[A-Za-z !]*$";
	public static final String amountValidationRegex = "^[A-Za-z !]*$";

}
