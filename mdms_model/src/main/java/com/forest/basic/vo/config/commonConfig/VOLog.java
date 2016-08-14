package com.forest.basic.vo.config.commonConfig;

import java.util.Date;

import com.forest.basic.vo.common.BaseVO;

public class VOLog extends BaseVO {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String operator;
	private Date createDate;
	private String content;
	private String operationType; // OPERATION VARCHAR2(250) N 1登录2新增3修改4删除
	private String operResult;// OPER_RESULT VARCHAR2(10) Y 1 1:SUC 0:FAIL
	private String ipAddr; // IP VARCHAR2(10) Y ip地址
	private Long logId;
	private String name;
	private String code;
	private String oldValue;
	private String newValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getOperResult() {
		return operResult;
	}

	public void setOperResult(String operResult) {
		this.operResult = operResult;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
