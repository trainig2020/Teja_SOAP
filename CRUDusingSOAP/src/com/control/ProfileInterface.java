package com.control;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.Profile;
@WebService
public interface ProfileInterface {
	@WebMethod
	List<Profile> getAllProfile();
	@WebMethod
	Profile getProfile(String profileName);
	@WebMethod
	Profile postprofile(String profileName, String firstName, String lastName);
	@WebMethod
	Profile putProfile(String profileName, String firstName, String lastName, long id);
	@WebMethod
	boolean deleteProfile(long id);
	

}