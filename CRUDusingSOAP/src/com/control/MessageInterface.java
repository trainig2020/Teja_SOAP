package com.control;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.Message;

@WebService
public interface MessageInterface {
	@WebMethod
	List<Message> getAllMessage();
	@WebMethod
	Message addMessage(String message,String author);
	@WebMethod
	Message getMessage(long messageId);
	@WebMethod
	Message putMessage(long messageId, String message, String author);
	@WebMethod
	boolean deleteMessage(long messageId);
	
	

}