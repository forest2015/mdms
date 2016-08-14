package com.forest.basic.vo.common;

import java.io.Serializable;

/**
 * @ClassName: BaseVO
 * @Description: 基础VO, 包含datagrid需要的一些字段 即包含filter 也包含vo
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// 批量操作拼接字段
	protected String ids;
	// FIXME remove
	// 当前页
	protected int page;
	// FIXME remove
	// 每页显示记录数
	protected int rows;
	protected int startIndex;
	protected int endIndex;
	
	// for mysql
	protected int offset;	//startIndex - 1
	protected int limit;	//rows
	
	// 排序字段
	protected String sort;
	// 按什么排序(asc,desc)
	protected String order;
	private String orderByClause;

	/**
	 * 时间
	 */
	protected String startTime;
	protected String endTime;
	/**
	 * 区域相关属性 与 CfgDistrict名称一致 严格按以下的大小写
	 */
	protected Long districtId;
	protected String codeLevel; // 分域用
	private String districtname;
	private Long parentdistrict;
	private String adminlevel;

	/**
	 * 在子类中添加 1.搜索栏的字段(filter) 2.grid中记录的字段(vo)
	 */

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public String getOrderByClause() {
		if (null == orderByClause || orderByClause.equals("")) {
			if (null != order && null != sort && !sort.equals("")
					&& !order.equals("")) {
				orderByClause = " ORDER BY " + sort + " " + order;
			}
		}
		return orderByClause;
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCodeLevel() {
		return codeLevel;
	}

	public void setCodeLevel(String codeLevel) {
		this.codeLevel = codeLevel;
	}

	public Long getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public Long getParentdistrict() {
		return parentdistrict;
	}

	public void setParentdistrict(Long parentdistrict) {
		this.parentdistrict = parentdistrict;
	}

	public String getAdminlevel() {
		return adminlevel;
	}

	public void setAdminlevel(String adminlevel) {
		this.adminlevel = adminlevel;
	}
	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
}
