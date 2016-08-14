package com.forest.basic.vo.config.auth;

import java.util.Date;

import com.forest.basic.vo.common.BaseVO;

public class VOUser extends BaseVO {
	private static final long serialVersionUID = 1L;

	private String roleIds;
	private String roleNames;
	private String authIds;
	private String authNames;

	private String authUrls;
	private Date ccreatedatetimeStart;
	private Date cmodifydatetimeStart;
	private Date ccreatedatetimeEnd;
	private Date cmodifydatetimeEnd;
	private Long cid;
	private Date ccreatedatetime;
	private Date cmodifydatetime;
	private String cname;
	private String cpwd;
	private String cpwd2;//确认密码
	private String email;
	private String fullname;
	private String telephone;
	private String profession;
	private String jobs;
	private String company;
	private String address;

	public String getAuthUrls() {
		return authUrls;
	}

	public void setAuthUrls(String authUrls) {
		this.authUrls = authUrls;
	}

	public String getAuthNames() {
		return authNames;
	}

	public void setAuthNames(String authNames) {
		this.authNames = authNames;
	}

	public String getAuthIds() {
		return authIds;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public Date getCcreatedatetimeStart() {
		return ccreatedatetimeStart;
	}

	public void setCcreatedatetimeStart(Date ccreatedatetimeStart) {
		this.ccreatedatetimeStart = ccreatedatetimeStart;
	}

	public Date getCmodifydatetimeStart() {
		return cmodifydatetimeStart;
	}

	public void setCmodifydatetimeStart(Date cmodifydatetimeStart) {
		this.cmodifydatetimeStart = cmodifydatetimeStart;
	}

	public Date getCcreatedatetimeEnd() {
		return ccreatedatetimeEnd;
	}

	public void setCcreatedatetimeEnd(Date ccreatedatetimeEnd) {
		this.ccreatedatetimeEnd = ccreatedatetimeEnd;
	}

	public Date getCmodifydatetimeEnd() {
		return cmodifydatetimeEnd;
	}

	public void setCmodifydatetimeEnd(Date cmodifydatetimeEnd) {
		this.cmodifydatetimeEnd = cmodifydatetimeEnd;
	}

	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public String getRoleNames() {
		return roleNames;
	}

	public void setRoleNames(String roleNames) {
		this.roleNames = roleNames;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public Date getCcreatedatetime() {
		return ccreatedatetime;
	}

	public void setCcreatedatetime(Date ccreatedatetime) {
		this.ccreatedatetime = ccreatedatetime;
	}

	public Date getCmodifydatetime() {
		return cmodifydatetime;
	}

	public void setCmodifydatetime(Date cmodifydatetime) {
		this.cmodifydatetime = cmodifydatetime;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpwd() {
		return cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	
	public String getCpwd2() {
		return cpwd2;
	}

	public void setCpwd2(String cpwd2) {
		this.cpwd2 = cpwd2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
