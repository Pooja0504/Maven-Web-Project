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

private String commitId; 
	private String author; 
	private String branch;
	private String commitDate;
	private Map<QualityGateCommitFile, List<QualityGateIssues>> qualityGateIssues;
	private String authormail;
	private String parentId;
	private RepositoryType repositoryType;
	private String subject;
	private int lineModified;
	
	public String getCommitId() {
		return commitId;
	}
	public void setCommitId(String commitId) {
		this.commitId = commitId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCommitDate() {
		return commitDate;
	}
	public void setCommitDate(String commitDate) {
		this.commitDate = commitDate;
	}
	public String getAuthormail() {
		return authormail;
	}
	public void setAuthormail(String authormail) {
		this.authormail = authormail;
	}
	public Map<QualityGateCommitFile, List<QualityGateIssues>> getQualityGateIssues() {
		return qualityGateIssues;
	}
	public void setQualityGateIssues(Map<QualityGateCommitFile, List<QualityGateIssues>> qualityGateIssues) {
		this.qualityGateIssues = qualityGateIssues;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public RepositoryType getRepositoryType() {
		return repositoryType;
	}
	public void setRepositoryType(RepositoryType repositoryType) {
		this.repositoryType = repositoryType;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getLineModified() {
		return lineModified;
	}
	public void setLineModified(int lineModified) {
		this.lineModified = lineModified;
	}
	
private int x;
	private int y;
	private boolean active;
	
	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS 
	public void setX(int val) {
		
		this.y = val;
	}

	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS 
	public int getY() {
		return this.x;
	}

	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS
	  public boolean isActive()
		  {
		    return x;
		  }

	  		// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS
		  public void setActive(boolean b)
		  {
		    this.y = b;
		  }
		  
		  // EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect
		  public int getName() {	
			  System.out.println(" ");
			  return this.x;
			}
		  
			// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect
		  	public void setName(int val) {
			    System.out.println(" ");
				this.y = val;
			}
}
