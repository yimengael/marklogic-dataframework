package com.yimengael.ml.model;

import java.util.Objects;

public class StaffInformation {

	private Long staffId;
	private String staffSsn;
	private String staffFirstName;
	private String staffLastName;
	private String staffHireDate;
	private Long staffManager;
	private WorkDepartment staffDepartement = new WorkDepartment();

	public StaffInformation() {
	}

	public StaffInformation(Long staffId, String staffSsn, String staffFirstName, String staffLastName,
			String staffHireDate, Long staffManager, WorkDepartment staffDepartement) {
		super();
		this.staffId = staffId;
		this.staffSsn = staffSsn;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffHireDate = staffHireDate;
		this.staffManager = staffManager;
		this.staffDepartement = staffDepartement;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getStaffSsn() {
		return staffSsn;
	}

	public void setStaffSsn(String staffSsn) {
		this.staffSsn = staffSsn;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getStaffHireDate() {
		return staffHireDate;
	}

	public void setStaffHireDate(String staffHireDate) {
		this.staffHireDate = staffHireDate;
	}

	public Long getStaffManager() {
		return staffManager;
	}

	public void setStaffManager(Long staffManager) {
		this.staffManager = staffManager;
	}

	public WorkDepartment getStaffDepartement() {
		return staffDepartement;
	}

	public void setStaffDepartement(WorkDepartment staffDepartement) {
		this.staffDepartement = staffDepartement;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StaffInformation staffInformation = (StaffInformation) o;
		return Objects.equals(staffId, staffInformation.staffId) && Objects.equals(staffSsn, staffInformation.staffSsn)
				&& Objects.equals(staffFirstName, staffInformation.staffFirstName)
				&& Objects.equals(staffLastName, staffInformation.staffLastName)
				&& Objects.equals(staffHireDate, staffInformation.staffHireDate)
				&& Objects.equals(staffManager, staffInformation.staffManager)
				&& Objects.equals(staffDepartement, staffInformation.staffDepartement);
	}

	@Override
	public int hashCode() {
		return Objects.hash(staffId, staffSsn, staffFirstName, staffLastName, staffHireDate, staffManager,
				staffDepartement);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StaffInformation {\n");

		sb.append("    staffId: ").append(toIndentedString(staffId)).append("\n");
		sb.append("    staffSsn: ").append(toIndentedString(staffSsn)).append("\n");
		sb.append("    staffFirstName: ").append(toIndentedString(staffFirstName)).append("\n");
		sb.append("    staffLastName: ").append(toIndentedString(staffLastName)).append("\n");
		sb.append("    staffHireDate: ").append(toIndentedString(staffHireDate)).append("\n");
		sb.append("    staffManager: ").append(toIndentedString(staffManager)).append("\n");
		sb.append("    staffDepartement: ").append(toIndentedString(staffDepartement)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
