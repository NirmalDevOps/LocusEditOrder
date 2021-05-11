/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Body  model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */
public class Body {
	
	private String id;
	private String clientId;
	
	PatchBody patchBody;
	

	public Body() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the patchBody
	 */
	public PatchBody getPatchBody() {
		return patchBody;
	}

	/**
	 * @param patchBody the patchBody to set
	 */
	public void setPatchBody(PatchBody patchBody) {
		this.patchBody = patchBody;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	
	
	
	

}
