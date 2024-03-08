package io.github.rongaru.common.string.utility;

import java.util.Collection;

public class StringUtility {

	public static String clean( String string ) {

		return string == null ? "": string.trim( );

	}

	public static boolean isEmpty( String string ) {

		return string == null || string.trim( ).isEmpty( );

	}

	public static boolean isNotEmpty( String string ) {

		return string != null && !string.trim( ).isEmpty( );

	}

	public static String defaultString( String string ) {

		return string == null ? "": string;

	}

	public static String defaultString( String string, String defaultValue ) {

		return string == null ? defaultValue: string;

	}

	public static String reverse( String string ) {

		return new StringBuilder( string ).reverse( ).toString( );

	}

	public static boolean containsIgnoreCase( String string, String search ) {

		return string.toLowerCase( ).contains( search.toLowerCase( ) );

	}

	public static boolean startsWithIgnoreCase( String string, String search ) {

		return string.toLowerCase( ).startsWith( search.toLowerCase( ) );

	}

	public static boolean endsWithIgnoreCase( String string, String search ) {

		return string.toLowerCase( ).endsWith( search.toLowerCase( ) );

	}

	public static String concat( Collection< String > strings ) {

		return String.join( "", strings );

	}

	public static String concat( Collection< String > strings, String delimiter ) {

		return String.join( delimiter, strings );

	}

	public static String concat( Collection< String > strings, String delimiter, String enclosure ) {

		return enclosure + String.join( delimiter, strings ) + enclosure;

	}

	public static String concat( Collection< String > strings, String delimiter, String leftEnclosure, String rightEnclosure ) {

		return leftEnclosure + String.join( delimiter, strings ) + rightEnclosure;

	}

	public static String leftPadding( int length, String string ) {

		return leftPadding( length, ' ', string );

	}

	public static String rightPadding( int length, String string ) {

		return rightPadding( length, ' ', string );

	}

	public static String leftPadding( int length, char padding, String string ) {

		StringBuilder builder = new StringBuilder( );

		for ( int i = 0; i < length - string.length( ); i++ ) {

			builder.append( padding );

		}

		builder.append( string );
		return builder.toString( );

	}

	public static String rightPadding( int length, char padding, String string ) {

		StringBuilder builder = new StringBuilder( string );

		for ( int i = 0; i < length - string.length( ); i++ ) {

			builder.append( padding );

		}

		return builder.toString( );

	}

}
