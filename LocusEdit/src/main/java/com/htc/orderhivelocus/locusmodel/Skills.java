/**
 * 
 */
package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a Skills model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class Skills {

	private String skills;

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Skills [skills=" + skills + "]";
	}

}
