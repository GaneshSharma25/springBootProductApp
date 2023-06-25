package com.app.exception;

import java.util.function.Supplier;

public class ProductException extends RuntimeException {

	public ProductException(String mesg) {
		super(mesg);
	}

}
