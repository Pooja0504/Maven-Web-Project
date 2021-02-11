package com.acellere.corona.cmx.msg.dataservice;

import java.io.Serializable;

public class QualityGateCommitFile implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String filePath;
	private String fileStatus;
	
	public QualityGateCommitFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public QualityGateCommitFile(String filePath, String fileStatus) {
		super();
		this.filePath = filePath;
		this.fileStatus = fileStatus;
	}

	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QualityGateCommitFile other = (QualityGateCommitFile) obj;
		if (filePath == null) {
			if (other.filePath != null)
				return false;
		} else if (!filePath.equals(other.filePath))
			return false;
		return true;
	}
}
