package com.bharath.restws;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bharath.restws.exceptions.PatientBusinessException;

@Provider
public class PatientBusinessExceptionMapper implements ExceptionMapper<PatientBusinessException> {

	@Override
	public Response toResponse(PatientBusinessException e) {
		
		return Response.status(404).build();
	}

}
