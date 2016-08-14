package com.forest.basic.vo.common;

import java.io.Serializable;
import java.util.List;

public class MenuInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String desc;
	private String url;
	// EncodeUtil.cjkEncodeForToken 用于菜单选中等
	private String token;
	// private String category;
	// private String rptFilename;
	// 自身菜单等级
	private Long menuLevel;
	// 子菜单等级
	private Long sonMenuLevel;
	private List<MenuInfo> sonMenuList;
	private String menuIcon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getSonMenuLevel() {
		return sonMenuLevel;
	}

	public Long getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(Long menuLevel) {
		this.menuLevel = menuLevel;
	}

	public void setSonMenuLevel(Long sonMenuLevel) {
		this.sonMenuLevel = sonMenuLevel;
	}

	public List<MenuInfo> getSonMenuList() {
		return sonMenuList;
	}

	public void setSonMenuList(List<MenuInfo> sonMenuList) {
		this.sonMenuList = sonMenuList;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	@Override
	public String toString() {
		return "MenuInfo [id=" + id + ", name=" + name + ", desc=" + desc
				+ ", url=" + url + ", token=" + token + ", menuLevel="
				+ menuLevel + ", sonMenuLevel=" + sonMenuLevel
				+ ", sonMenuList=" + sonMenuList + ", menuIcon=" + menuIcon
				+ "]";
	}

}
