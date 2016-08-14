package com.forest.basic.vo.config.commonConfig;

import com.forest.basic.vo.common.BaseVO;

public class VODistrict extends BaseVO {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String districtname;

	private String adminlevel;

	private String districtdesc;

	private Long parentdistrict;

	private Long createUserId;

	private String codeLevel;
	
	private String parentCodeLevel;

	private String ldimsDistrictesc;

	private String code;
	
	private String use;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public String getAdminlevel() {
		return adminlevel;
	}

	public void setAdminlevel(String adminlevel) {
		this.adminlevel = adminlevel;
	}

	public String getDistrictdesc() {
		return districtdesc;
	}

	public void setDistrictdesc(String districtdesc) {
		this.districtdesc = districtdesc;
	}

	public Long getParentdistrict() {
		return parentdistrict;
	}

	public void setParentdistrict(Long parentdistrict) {
		this.parentdistrict = parentdistrict;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public String getCodeLevel() {
		return codeLevel;
	}

	public void setCodeLevel(String codeLevel) {
		this.codeLevel = codeLevel;
	}

	public String getLdimsDistrictesc() {
		return ldimsDistrictesc;
	}

	public void setLdimsDistrictesc(String ldimsDistrictesc) {
		this.ldimsDistrictesc = ldimsDistrictesc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getParentCodeLevel() {
		return parentCodeLevel;
	}

	public void setParentCodeLevel(String parentCodeLevel) {
		this.parentCodeLevel = parentCodeLevel;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
}
