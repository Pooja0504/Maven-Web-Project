package com.bt.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class simpler {
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