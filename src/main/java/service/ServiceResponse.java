package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "response")
public class ServiceResponse {

	@XmlElement(name = "status")
	private int status;

	@XmlElement(name = "message")
	private String message;

	public ServiceResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public ServiceResponse() {

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
