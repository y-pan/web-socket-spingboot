package com.example.socket;


public class MessageDTO {
	private String from;
	private String to;
	private String content;

	public MessageDTO(String from, String to, String content) {
		this.from = from;
		this.to = to;
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
