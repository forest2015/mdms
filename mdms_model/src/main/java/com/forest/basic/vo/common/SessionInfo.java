package com.forest.basic.vo.common;

public class SessionInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Long userId;// 用户ID
	private String loginName;// 用户登录名称
	private String loginPassword;// 登录密码
	private String ip;// IP地址
	private String authIds;// 拥有的权限ID集合
	private String authNames;
	private String authUrls;
	private String roleIds;
	private String roleNames;
	private String districtId;
	private String codeLevel;
	private String parentdistrict;
	private String adminlevel;

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

	public String getAuthIds() {
		return authIds;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return loginName;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getCodeLevel() {
		return codeLevel;
	}

	public void setCodeLevel(String codeLevel) {
		this.codeLevel = codeLevel;
	}

	public String getParentdistrict() {
		return parentdistrict;
	}

	public void setParentdistrict(String parentdistrict) {
		this.parentdistrict = parentdistrict;
	}

	public String getAdminlevel() {
		return adminlevel;
	}

	public void setAdminlevel(String adminlevel) {
		this.adminlevel = adminlevel;
	}
}
