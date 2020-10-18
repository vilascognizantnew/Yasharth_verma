package com.cts.customexceptions;

public class BookUnSupportedFieldPatchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookUnSupportedFieldPatchException() {
		super("Field update is not allowed.");
	}
}