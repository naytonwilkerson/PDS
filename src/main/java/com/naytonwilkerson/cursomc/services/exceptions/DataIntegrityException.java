package com.naytonwilkerson.cursomc.services.exceptions;

import org.springframework.remoting.RemoteTimeoutException;

public class DataIntegrityException extends RemoteTimeoutException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityException(String msg) {
		super(msg);
	
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg,cause);
	}
}
