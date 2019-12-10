package com.jsonplaceholder.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Error{

	@JsonProperty("status")
	private String status;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Error{" + 
			"status = '" + status + '\'' + 
			"}";
		}
}