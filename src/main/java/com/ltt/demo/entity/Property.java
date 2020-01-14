package com.ltt.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author liuwei
 * @since 2020-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_property")
public class Property extends Model<Property> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id",type = IdType.UUID)
	private String id;

	/**
	 * 属性名称
	 */
	@TableField("name")
	@NotNull
	private String name;

	/**
	 * 属性唯一标识
	 */
	@TableField("code")
	private String code;

	/**
	 * 1 文本2数字3日期
	 */
	@TableField("type")
	@NotNull
	private Integer type;

	/**
	 * 是否可编辑：0-否；1-是
	 */
	@TableField("can_edit")
	@NotNull
	private Integer canEdit;

	/**
	 * 排序
	 */
	@TableField("order_num")
	private Integer orderNum;

	/**
	 * 最后更新时间戳
	 */
	@TableField("last_update_timestamp")
	private Long lastUpdateTimestamp;

	/**
	 * 所属集团
	 */
	@TableField("company_id")
	@NotEmpty
	private String companyId;
}
