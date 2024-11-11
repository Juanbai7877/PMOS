package org.pmos.payservice.dto;


public class PayOrder {

  private long id;
  private long bizOrderNo;
  private long payOrderNo;
  private long bizUserId;
  private String payChannelCode;
  private long amount;
  private long payType;
  private long status;
  private String expandJson;
  private String resultCode;
  private String resultMsg;
  private java.sql.Timestamp paySuccessTime;
  private java.sql.Timestamp payOverTime;
  private String qrCodeUrl;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private long creater;
  private long updater;
  private String isDelete;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBizOrderNo() {
    return bizOrderNo;
  }

  public void setBizOrderNo(long bizOrderNo) {
    this.bizOrderNo = bizOrderNo;
  }


  public long getPayOrderNo() {
    return payOrderNo;
  }

  public void setPayOrderNo(long payOrderNo) {
    this.payOrderNo = payOrderNo;
  }


  public long getBizUserId() {
    return bizUserId;
  }

  public void setBizUserId(long bizUserId) {
    this.bizUserId = bizUserId;
  }


  public String getPayChannelCode() {
    return payChannelCode;
  }

  public void setPayChannelCode(String payChannelCode) {
    this.payChannelCode = payChannelCode;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public long getPayType() {
    return payType;
  }

  public void setPayType(long payType) {
    this.payType = payType;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getExpandJson() {
    return expandJson;
  }

  public void setExpandJson(String expandJson) {
    this.expandJson = expandJson;
  }


  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public String getResultMsg() {
    return resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }


  public java.sql.Timestamp getPaySuccessTime() {
    return paySuccessTime;
  }

  public void setPaySuccessTime(java.sql.Timestamp paySuccessTime) {
    this.paySuccessTime = paySuccessTime;
  }


  public java.sql.Timestamp getPayOverTime() {
    return payOverTime;
  }

  public void setPayOverTime(java.sql.Timestamp payOverTime) {
    this.payOverTime = payOverTime;
  }


  public String getQrCodeUrl() {
    return qrCodeUrl;
  }

  public void setQrCodeUrl(String qrCodeUrl) {
    this.qrCodeUrl = qrCodeUrl;
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


  public long getCreater() {
    return creater;
  }

  public void setCreater(long creater) {
    this.creater = creater;
  }


  public long getUpdater() {
    return updater;
  }

  public void setUpdater(long updater) {
    this.updater = updater;
  }


  public String getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(String isDelete) {
    this.isDelete = isDelete;
  }

}
