package com.yimengael.ml.model;

import java.util.Objects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("workdepartment")
public class WorkDepartmentVO extends MarkLogicVO {

	@XStreamAlias("departmentId")
	private String departmentId;
	
	@XStreamAlias("departmentName")
	private String departmentName;

	public WorkDepartmentVO(String departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public WorkDepartmentVO() {
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WorkDepartmentVO workDepartment = (WorkDepartmentVO) o;
		return Objects.equals(departmentId, workDepartment.departmentId)
				&& Objects.equals(departmentName, workDepartment.departmentName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentId, departmentName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WorkDepartment {\n");

		sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
		sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
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
