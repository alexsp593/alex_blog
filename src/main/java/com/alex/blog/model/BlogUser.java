package com.alex.blog.model;import com.alex.blog.base.BaseModel;import java.util.Date;/** * 用户信息表 Model * * @author alex * @date 2019-09-09 22:24:02 */public class BlogUser extends BaseModel {		/** 	* 自增id	*/	private Integer userId;	/** 	* 用户昵称	*/	private String userName;	/** 	* 头像	*/	private String headImg;	/** 	* 手机号	*/	private String mobile;	/** 	* 邮箱	*/	private String email;	/** 	* 个人介绍	*/	private String contribution;	/** 	* 创建时间	*/	private Date createTime;	/** 	* 更新时间	*/	private Date updateTime;		public Integer getUserId() {	    return this.userId;	}	public void setUserId(Integer userId) {	    this.userId=userId;	}	public String getUserName() {	    return this.userName;	}	public void setUserName(String userName) {	    this.userName=userName;	}	public String getHeadImg() {	    return this.headImg;	}	public void setHeadImg(String headImg) {	    this.headImg=headImg;	}	public String getMobile() {	    return this.mobile;	}	public void setMobile(String mobile) {	    this.mobile=mobile;	}	public String getEmail() {	    return this.email;	}	public void setEmail(String email) {	    this.email=email;	}	public String getContribution() {	    return this.contribution;	}	public void setContribution(String contribution) {	    this.contribution=contribution;	}	public Date getCreateTime() {	    return this.createTime;	}	public void setCreateTime(Date createTime) {	    this.createTime=createTime;	}	public Date getUpdateTime() {	    return this.updateTime;	}	public void setUpdateTime(Date updateTime) {	    this.updateTime=updateTime;	}}