package com.forest.basic.vo.config.auth;

import com.forest.basic.vo.common.BaseVO;

public class VORole extends BaseVO {
	private static final long serialVersionUID = 1L;

	private Long cid;
	private String cdesc;
	private String cname;
	private String authIds;
	private String authNames;

	public String getAuthIds() {
		return authIds;
	}

	public void setAuthIds(String authIds) {
		this.authIds = authIds;
	}

	public String getAuthNames() {
		return authNames;
	}

	public void setAuthNames(String authNames) {
		this.authNames = authNames;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCdesc() {
		return cdesc;
	}

	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
