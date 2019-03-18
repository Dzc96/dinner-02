package com.appointment.dinner.exception;


import com.appointment.dinner.constants.CommonConstants;

/**
 *
 */
public class UserTokenException extends BaseException {
	private static final long serialVersionUID = 1L;

	public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}

