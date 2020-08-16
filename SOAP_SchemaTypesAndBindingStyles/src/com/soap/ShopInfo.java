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
	public String getProperty(@WebParam(partName = "lookUpInput")String property) {
		String resp = "Invalid Response";
		if("shopName".equals(property)) {
			return "Test mart";
		}
		else if("since".equals(property)) {
			return "Since 2000";
		}
		return resp;
	}

}
