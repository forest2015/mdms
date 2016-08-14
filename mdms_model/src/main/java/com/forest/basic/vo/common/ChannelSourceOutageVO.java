package com.forest.basic.vo.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelSourceOutageVO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Date starttime;
	private List<LocVO> list=new ArrayList<LocVO>();
	
	
	public Date getStarttime() {
		return starttime;
	}


	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}


	public List<LocVO> getList() {
		return list;
	}


	public void setList(List<LocVO> list) {
		this.list = list;
	}


	public class LocVO{
		 long channelid;
		 long districtid;
		public long getChannelid() {
			return channelid;
		}
		public void setChannelid(long channelid) {
			this.channelid = channelid;
		}
		public long getDistrictid() {
			return districtid;
		}
		public void setDistrictid(long districtid) {
			this.districtid = districtid;
		}
		 
	}
}
