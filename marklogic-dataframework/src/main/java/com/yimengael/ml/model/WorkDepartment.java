package com.yimengael.ml.model;

import java.util.Objects;

public class WorkDepartment {

	private Long departmentId;
	private String departmentName;

	public WorkDepartment(Long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public WorkDepartment() {
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
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
		WorkDepartment workDepartment = (WorkDepartment) o;
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
