package org.mule.dw;

public class RequestInput {
	// content: AnyRef, name: String
	private Object content;
	private String name;
	private String mimeType;

	public RequestInput(Object content, String name) {
		super();
		this.content = content;
		this.name = name;
	}

	public RequestInput() {
		super();
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Object getContent() {
		return content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

}
