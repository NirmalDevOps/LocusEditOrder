package com.htc.orderhivelocus.locusmodel;

/**
 * Represents a AuditMetadata  model class
 * 
 * @author HTC Global Service
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class AuditMetadata {

	CreatedBy createdBy;
	private String createdOn;
	private String createdOnDate;
	UpdatedBy updatedBy;
	private String updatedOn;
	private String updatedOnDate;

	public AuditMetadata() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the createdBy
	 */
	public CreatedBy getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(CreatedBy createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdOn
	 */
	public String getCreatedOn() {
		return createdOn;
	}

	/**
	 * @param createdOn the createdOn to set
	 */
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	/**
	 * @return the createdOnDate
	 */
	public String getCreatedOnDate() {
		return createdOnDate;
	}

	/**
	 * @param createdOnDate the createdOnDate to set
	 */
	public void setCreatedOnDate(String createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	/**
	 * @return the updatedBy
	 */
	public UpdatedBy getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(UpdatedBy updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * @return the updatedOn
	 */
	public String getUpdatedOn() {
		return updatedOn;
	}

	/**
	 * @param updatedOn the updatedOn to set
	 */
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	/**
	 * @return the updatedOnDate
	 */
	public String getUpdatedOnDate() {
		return updatedOnDate;
	}

	/**
	 * @param updatedOnDate the updatedOnDate to set
	 */
	public void setUpdatedOnDate(String updatedOnDate) {
		this.updatedOnDate = updatedOnDate;
	}

	@Override
	public String toString() {
		return "AuditMetadata [createdBy=" + createdBy + ", createdOn=" + createdOn + ", createdOnDate=" + createdOnDate
				+ ", updatedBy=" + updatedBy + ", updatedOn=" + updatedOn + ", updatedOnDate=" + updatedOnDate + "]";
	}

}
