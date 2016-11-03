package org.javapages.restapi.fileuploadapp;

public class FileUploadBean {

	private String dirName;
	private String clientId;
	private String webUserId;

	public FileUploadBean() {

	}

	public String getDirName() {
		return dirName;
	}

	public void setDirName(String dirName) {
		this.dirName = dirName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getWebUserId() {
		return webUserId;
	}

	public void setWebUserId(String webUserId) {
		this.webUserId = webUserId;
	}

}
