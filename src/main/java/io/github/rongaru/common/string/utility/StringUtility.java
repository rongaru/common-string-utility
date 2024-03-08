package io.github.rongaru.common.string.utility;

import java.util.Collection;

/**
 * @author Name: Roshan Garu
 * <br> Email: rongaru@gmail.com
 * <br> Mobile Phone: +9779860200899
 */
public class StringUtility {

	/**
	 * @param value input value.
	 * @return This function will return an empty string if the input value is null else it will remove outer whitespace from value.
	 */
	public static String clean( String value ) {

		return value == null ? "": value.trim( );

	}

	/**
	 * @param value input value.
	 * @return This function will return is the null value or an empty String.
	 */
	public static boolean isEmpty( String value ) {

		return value == null || value.trim( ).isEmpty( );

	}

	/**
	 * @param value input value.
	 * @return This function will return is the non-null value and non-empty String.
	 */
	public static boolean isNotEmpty( String value ) {

		return value != null && !value.trim( ).isEmpty( );

	}

	/**
	 * @param value input value.
	 * @return This function will return an empty string if the input value is null.
	 */
	public static String defaultString( String value ) {

		return value == null ? "": value;

	}

	/**
	 * @param value        input value.
	 * @param defaultValue replacement value.
	 * @return This function will return the default value if the input value is null.
	 */
	public static String defaultString( String value, String defaultValue ) {

		return value == null ? defaultValue: value;

	}

	/**
	 * @param values input value.
	 * @return This function will concat all values inside the collection.
	 */
	public static String concat( Collection< String > values ) {

		return String.join( "", values );

	}

	/**
	 * @param values    input values.
	 * @param delimiter between values.
	 * @return This function will concat all values inside the collection with delimiter.
	 */
	public static String concat( Collection< String > values, String delimiter ) {

		return String.join( delimiter, values );

	}

	/**
	 * @param values    input values.
	 * @param delimiter between values.
	 * @param enclosure before and after concat values.
	 * @return This function will concat all values inside the collection with delimiter and enclosure.
	 */
	public static String concat( Collection< String > values, String delimiter, String enclosure ) {

		return enclosure + String.join( delimiter, values ) + enclosure;

	}

	/**
	 * @param values         input values.
	 * @param delimiter      between values.
	 * @param leftEnclosure  before concat values.
	 * @param rightEnclosure after concat values.
	 * @return This function will concat all values inside the collection with delimiter and enclosures.
	 */
	public static String concat( Collection< String > values, String delimiter, String leftEnclosure, String rightEnclosure ) {

		return leftEnclosure + String.join( delimiter, values ) + rightEnclosure;

	}

	/**
	 * @param value  input value.
	 * @param length length of output value.
	 * @return This function will convert the value to the length by adding left padding with space character.
	 */
	public static String leftPadding( int length, String value ) {

		return leftPadding( length, ' ', value );

	}

	/**
	 * @param value  input value.
	 * @param length length of output value.
	 * @return This function will convert the value to the length by adding right padding with space character.
	 */
	public static String rightPadding( int length, String value ) {

		return rightPadding( length, ' ', value );

	}

	/**
	 * @param value   input value.
	 * @param padding padding character.
	 * @param length  length of output value.
	 * @return This function will convert the value to the length by adding left padding with padding character.
	 */
	public static String leftPadding( int length, char padding, String value ) {

		StringBuilder builder = new StringBuilder( );

		for ( int i = 0; i < length - value.length( ); i++ ) {

			builder.append( padding );

		}

		builder.append( value );
		return builder.toString( );

	}

	/**
	 * @param value   input value.
	 * @param padding padding character.
	 * @param length  length of output value.
	 * @return This function will convert the value to the length by adding right padding with padding character.
	 */
	public static String rightPadding( int length, char padding, String value ) {

		StringBuilder builder = new StringBuilder( value );

		for ( int i = 0; i < length - value.length( ); i++ ) {

			builder.append( padding );

		}

		return builder.toString( );

	}

}
