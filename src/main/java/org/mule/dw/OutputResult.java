package org.mule.dw;


public class OutputResult {

	// content: Any, charset: Charset, mime: String
	private String content;
	private String mime;

	public OutputResult() {
		super();
	}

	public OutputResult(String content,String mime) {
		super();
		this.content = content;
		this.mime = mime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

}
