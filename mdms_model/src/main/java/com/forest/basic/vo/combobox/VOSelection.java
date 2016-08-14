package com.forest.basic.vo.combobox;

import com.forest.basic.vo.common.BaseVO;

public class VOSelection extends BaseVO {
	private static final long serialVersionUID = 1L;

	/**
	 * combobox key
	 */
	private String id;
	/**
	 * combobox value
	 */
	private String name;

	public VOSelection() {
		super();
	}

	public VOSelection(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}