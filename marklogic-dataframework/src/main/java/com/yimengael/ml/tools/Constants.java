package com.yimengael.ml.tools;

public class Constants {
	
	/**
	 * Work department
	 */
	public static final String WORK_DEPARTMENT_COLLECTION = "WorkDepartment";
	public static final String WORK_DEPARTMENT_URI_PREFIX = "/WorkDepartment/";
	public static final String WORK_DEPARTMENT_FILES_URI_PREFIX = "/WorkDepartment/files/";
	public static final String WORK_DEPARTMENT_FILE_PREFIX_NAME = "department";
	
	//predicate between work department properties and URI of Work department
	public static final String WORK_DEPARTMENT_PREDICATE = "contains";
	
	/**
	 * Staff Information
	 */
	public static final String STAFF_INFORMATION_COLLECTION = "StaffInformation";
	public static final String STAFF_INFORMATION_COLLECTION_URI_PREFIX = "/StaffInformation/";
	public static final String STAFF_INFORMATION_COLLECTION_FILES_URI_PREFIX = "/StaffInformation/files/";
	public static final String STAFF_INFORMATION_FILE_PREFIX_NAME = "staff";
	
	//predicate between work department properties and URI of Work department
	public static final String STAFF_INFORMATION_PREDICATE = "contains";
	
	/**
	 * Predicate between Staff and his Head of Department
	 */
	public static final String HAS_AS_HEAD = "hasAsHeadDepartment"; 
	
	/**
	 * Predicate between Staff and Department
	 */
	public static final String WORKS_IN_DEPARTMENT = "worksInDepartment";
	
	/**
	 * Others
	 */
	public static final String BITEMPORAL_COLLECTION = "bitemporal";
	public static final String LATEST_COLLECTION = "latest";

}
