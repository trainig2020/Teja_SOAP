package com.control;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.model.Profile;
import com.service.ProfileService;

@WebService(endpointInterface = "com.control.ProfileInterface")
public class ProfileResource implements ProfileInterface {

	private ProfileService profileService = new ProfileService();

	@Override
	public List<Profile> getAllProfile() {
		return profileService.getAllProfile();
	}

	@Override
	public Profile getProfile(@WebParam(partName = "profileName") String profileName) {
		return profileService.getProfile(profileName);
	}

	@Override
	public Profile postprofile(@WebParam(partName = "profileName")String profileName, @WebParam(partName = "firstName")String firstName, 
								@WebParam(partName = "lastName")String lastName) {
		Profile profile = new Profile();
		profile.setProfileName(profileName);
		profile.setFirstName(firstName);
		profile.setLastName(lastName);
		return profileService.addProfile(profile);
	}

	@Override
	public Profile putProfile(@WebParam(partName = "profileName")String profileName, @WebParam(partName = "firstName")String firstName, 
			@WebParam(partName = "lastName")String lastName, @WebParam(partName = "id")long id) {
		
		Profile profile = new Profile();
		profile.setId(id);
		profile.setProfileName(profileName);
		profile.setFirstName(firstName);
		profile.setLastName(lastName);
		return profileService.updateProfile(profile);
	}

	@Override
	public boolean deleteProfile(@WebParam(partName = "id")long id) {
		profileService.removeProfile(id);
		return true;
	}

}
