package com.forest.basic.vo.common;

import java.util.HashMap;

/**
 * @ClassName: BaseMapVO   
 * @Description: Map格式的VO
 * 该类仅用于说明使用方法
 */
/**
    1. Mapper.java 示例
	public List<HashMap> queryXXXList();
	<select id="queryXXXList" parameterType="hashmap" resultType="hashmap" >
	</select>
	// 因为Oracle的字段名全部为大写
	// 在sql中 xxx(字段) AS 'alias'(别名) 使结果按照sql的大小写来
	// 在action中 Map<String, Object> vo = new HashMap<String, object>(); 参数也可使用map
	
    2.Mapper.java 示例
	public List<BaseMapVO> queryXXXList();
 	 
    Mapper.xml 示例
    先定义一个map 设置property和column的对应关系
	<resultMap id="xxxMap" type="BaseMapVO">
		<id property="id" column="id" />
		<id property="pId" column="pId" />
		<id property="name" column="name" />
		<id property="nodeType" column="nodeType" />
		<id property="adminlevel" column="adminlevel" />
		<id property="codeLevel" column="codeLevel" />
		<id property="iconSkin" column="iconSkin" />
		<id property="isParent" column="isParent" />
		<!-- 多级树第一级节点id -->
		<id property="topNodeId" column="topNodeId" />
	</resultMap>
	
	<!-- 运营商树一级运营商节点 id增加o-前缀 -->
	<select id="queryXXXList" resultMap="xxxMap">
		SELECT 'o-' || t.id AS id, 0 AS pid, t.name, 0 AS nodetype,
		       CASE WHEN t.id = -1 THEN 'pIcon_unknown' ELSE NULL END AS iconSkin,
		       'true' AS isParent
		  FROM ott_operator t
		 ORDER BY t.id, t.name
	</select>
 */
public class BaseMapVO extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public BaseMapVO() {
		super();
	}
	
}
