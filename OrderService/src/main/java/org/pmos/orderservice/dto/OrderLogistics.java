package org.pmos.orderservice.dto;


public class OrderLogistics {

  private long orderId;
  private String logisticsNumber;
  private String logisticsCompany;
  private String contact;
  private String mobile;
  private String province;
  private String city;
  private String town;
  private String street;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getLogisticsNumber() {
    return logisticsNumber;
  }

  public void setLogisticsNumber(String logisticsNumber) {
    this.logisticsNumber = logisticsNumber;
  }


  public String getLogisticsCompany() {
    return logisticsCompany;
  }

  public void setLogisticsCompany(String logisticsCompany) {
    this.logisticsCompany = logisticsCompany;
  }


  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

}
