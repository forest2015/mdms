package com.forest.mdms.vo;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ControllerEntity {
	// salveid
	private int id;
	// key:寄存器地址，value：具体值
	private Map<Integer, RegisterEntity> registers;
	private String ip;
	private int port;
	
	
}
