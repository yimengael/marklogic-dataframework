package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WorkDepartment;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public class StaffInformation   {
  
  private Long staffId = null;
  private String staffSsn = null;
  private String staffFirstName = null;
  private String staffLastName = null;
  private String staffHireDate = null;
  private Long staffManager = null;
  private WorkDepartment staffDepartement = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_id")
  public Long getStaffId() {
    return staffId;
  }
  public void setStaffId(Long staffId) {
    this.staffId = staffId;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_ssn")
  public String getStaffSsn() {
    return staffSsn;
  }
  public void setStaffSsn(String staffSsn) {
    this.staffSsn = staffSsn;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_firstName")
  public String getStaffFirstName() {
    return staffFirstName;
  }
  public void setStaffFirstName(String staffFirstName) {
    this.staffFirstName = staffFirstName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_lastName")
  public String getStaffLastName() {
    return staffLastName;
  }
  public void setStaffLastName(String staffLastName) {
    this.staffLastName = staffLastName;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_hire_date")
  public String getStaffHireDate() {
    return staffHireDate;
  }
  public void setStaffHireDate(String staffHireDate) {
    this.staffHireDate = staffHireDate;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("staff_manager")
  public Long getStaffManager() {
    return staffManager;
  }
  public void setStaffManager(Long staffManager) {
    this.staffManager = staffManager;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("staff_departement")
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
    return Objects.equals(staffId, staffInformation.staffId) &&
        Objects.equals(staffSsn, staffInformation.staffSsn) &&
        Objects.equals(staffFirstName, staffInformation.staffFirstName) &&
        Objects.equals(staffLastName, staffInformation.staffLastName) &&
        Objects.equals(staffHireDate, staffInformation.staffHireDate) &&
        Objects.equals(staffManager, staffInformation.staffManager) &&
        Objects.equals(staffDepartement, staffInformation.staffDepartement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffId, staffSsn, staffFirstName, staffLastName, staffHireDate, staffManager, staffDepartement);
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

