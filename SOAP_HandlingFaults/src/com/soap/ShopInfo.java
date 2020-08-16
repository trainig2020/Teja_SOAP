package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
//@SOAPBinding(style = Style.RPC)
@SOAPBinding(style = Style.DOCUMENT)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName = "lookUpOutput")
	public String getProperty(@WebParam(partName = "lookUpInput")String property) throws InvalidInputException {
		String resp = null;
		if("shopName".equals(property)) {
			resp= "Test mart";
		}
		else if("since".equals(property)) {
			resp= "Since 2000";
		}
		else {
			throw new InvalidInputException("Invalid Input ", property+" is not a valid input");
		}
		return resp;
	}

}
