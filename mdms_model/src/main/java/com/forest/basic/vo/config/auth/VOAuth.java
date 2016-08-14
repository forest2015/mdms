package com.forest.basic.vo.config.auth;

import com.forest.basic.mybatis.model.Tauth;
import com.forest.basic.vo.common.BaseVO;

public class VOAuth extends BaseVO {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long pid;
	private String pname;
	private String state = "open";// 是否展开(open,closed)
	private Long cid;
	private String cdesc;
	private String cname;
	private Long cseq;
	private String curl;
	private Tauth tauth; 
	
	// 为了构造能够在jqGrid treeGrid上显示的数据,添加以下属性————start
	/**
	 * 节点的层次级数
	 */
	private Integer level;

	/**
	 * 是否是叶子节点
	 */
	private boolean leaf;

	/**
	 * 节点默认是展开还是收缩状态
	 */
	private boolean expanded = Boolean.FALSE;

	private Long nodeid;

	private Long parentid;

	private Integer n_level;

	// 为了构造能够在jqGrid treeGrid上显示的数据,添加以下属性————end
	private String trenNodeType; // select grid gridcell

	public Long getId() {
		return id;
	}

	public Long getPid() {
		return pid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Tauth getTauth() {
		return tauth;
	}

	public void setTauth(Tauth tauth) {
		this.tauth = tauth;
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

	public Long getCseq() {
		return cseq;
	}

	public void setCseq(Long cseq) {
		this.cseq = cseq;
	}

	public String getCurl() {
		return curl;
	}

	public void setCurl(String curl) {
		this.curl = curl;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public Long getNodeid() {
		return nodeid;
	}

	public void setNodeid(Long nodeid) {
		this.nodeid = nodeid;
		setId(nodeid);
	}

	public Long getParentid() {
		return parentid;
	}

	public void setParentid(Long parentid) {
		this.parentid = parentid;
	}

	public Integer getN_level() {
		return n_level;
	}

	public void setN_level(Integer n_level) {
		this.n_level = n_level;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}

	public String getTrenNodeType() {
		return trenNodeType;
	}

	public void setTrenNodeType(String trenNodeType) {
		this.trenNodeType = trenNodeType;
	}

	@Override
	public String toString() {
		return "Auth [id=" + id + ", pid=" + pid + ", pname=" + pname
				+ ", state=" + state + ", cid=" + cid + ", tauth=" + tauth
				+ ", cdesc=" + cdesc + ", cname=" + cname + ", cseq=" + cseq
				+ ", curl=" + curl + ", level=" + level + ", leaf=" + leaf
				+ ", expanded=" + expanded + ", nodeid=" + nodeid
				+ ", parentid=" + parentid + ", n_level=" + n_level + "]";
	}

}
