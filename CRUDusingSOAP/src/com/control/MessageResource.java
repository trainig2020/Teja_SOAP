package com.control;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.model.Message;
import com.service.MessageService;

@WebService(endpointInterface = "com.control.MessageInterface")
public class MessageResource implements MessageInterface {
	
	private MessageService messageService = new MessageService();

	@Override
	public List<Message> getAllMessage() {
		List<Message> msg = messageService.getAllMessages();
		return msg;
	}

	@Override
	public Message addMessage(String message, String author) {
		Message message1 = new Message();
		message1.setMessage(message);
		message1.setAuthor(author);
		return messageService.addMessage(message1);
	}

	@Override
	public Message getMessage(@WebParam(partName ="Id")long messageId) {
		Message message = messageService.getMessages(messageId);
		return message;
	}

	@Override
	public Message putMessage(@WebParam(partName ="Id")long messageId,@WebParam(partName = "message")String message, @WebParam(partName = "author")String author) {
		Message message1 = new Message();
		message1.setId(messageId);
		message1.setMessage(message);
		message1.setAuthor(author);
		return messageService.updateMessage(message1);
	}

	@Override
	public boolean deleteMessage( @WebParam(partName = "Id")long messageId) {
		return messageService.removeMessage(messageId);
		
	}

}
