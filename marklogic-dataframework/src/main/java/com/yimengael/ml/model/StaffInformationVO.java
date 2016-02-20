package com.yimengael.ml.model;

import java.util.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("staffinformation")
public class StaffInformationVO extends MarkLogicVO {

	@XStreamAlias("staffId")
	private String staffId;
	
	@XStreamAlias("staffSsn")
	private String staffSsn;
	
	@XStreamAlias("staffFirstName")
	private String staffFirstName;
	
	@XStreamAlias("staffLastName")
	private String staffLastName;
	
	@XStreamAlias("staffHireDate")
	private String staffHireDate;
	
	@XStreamAlias("staffManager")
	private String staffManager;
	
	@XStreamAlias("staffDepartement")
	private WorkDepartmentVO staffDepartement = new WorkDepartmentVO();

	public StaffInformationVO() {
	}

	/**
	 * 
	 * @param staffId
	 * @param staffSsn
	 * @param staffFirstName
	 * @param staffLastName
	 * @param staffHireDate
	 * @param staffManager
	 * @param staffDepartement
	 */
	public StaffInformationVO(String staffId, String staffSsn, String staffFirstName, String staffLastName,
			String staffHireDate, String staffManager, WorkDepartmentVO staffDepartement) {
		super();
		this.staffId = staffId;
		this.staffSsn = staffSsn;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffHireDate = staffHireDate;
		this.staffManager = staffManager;
		this.staffDepartement = staffDepartement;
	}

	/**
	 * 
	 * @return
	 */
	public String getStaffId() {
		return staffId;
	}

	/**
	 * 
	 * @param staffId
	 */
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	/**
	 * 
	 * @return
	 */
	public String getStaffSsn() {
		return staffSsn;
	}

	/**
	 * 
	 * @param staffSsn
	 */
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

	public String getStaffManager() {
		return staffManager;
	}

	public void setStaffManager(String staffManager) {
		this.staffManager = staffManager;
	}

	public WorkDepartmentVO getStaffDepartement() {
		return staffDepartement;
	}

	public void setStaffDepartement(WorkDepartmentVO staffDepartement) {
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
		StaffInformationVO staffInformation = (StaffInformationVO) o;
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
