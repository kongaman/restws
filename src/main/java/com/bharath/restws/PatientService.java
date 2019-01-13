package com.bharath.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.bharath.restws.model.Patient;

@Path("/patientservice")
public interface PatientService {
	
	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	@Path("/patients/{id}") // {id} = Path-Variable will be bound to "(Long id)" on next line because of the @PathParam annotation
	@GET
	Patient getPatient(@PathParam(value = "id") Long id);
	
	@Path("/patients")
	@POST
	Response createPatient(Patient patient);

}
