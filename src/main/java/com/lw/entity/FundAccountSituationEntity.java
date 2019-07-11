package com.lw.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FundAccountSituationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资金概况主键id
     */
    private String situationId;

    /**
     * 销售大区Code
     */
    private String salesAreaCode;

    /**
     * 销售大区名称
     */
    private String salesAreaName;

    /**
     * 销售小区Code
     */
    private String salesVillageCode;

    /**
     * 销售小区名称
     */
    private String salesVillageName;

    /**
     * 客户id
     */
    private Integer buyerId;

    /**
     * 买家SAPCode
     */
    private String buyerSapCode;

    /**
     * 客户名称
     */
    private String buyerName;

    /**
     * 卖家id
     */
    private Integer sellerId;

    /**
     * 卖家名称
     */
    private String sellerName;

    /**
     * 账户余额
     */
    private java.math.BigDecimal balance;

    /**
     * 余额占用
     */
    private java.math.BigDecimal useAmount;

    /**
     * 当前可用金额
     */
    private java.math.BigDecimal availableBalance;

    /**
     * 客户编码
     */
    private String buyerCode;

    /**
     * 产品中类名称
     */
    private String catagoryName;

    /**
     * 产品中类code
     */
    private String catagoryCode;

    /**
     * 事业部名称
     */
    private String buName;

    /**
     * 事业部code
     */
    private String buCode;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private java.util.Date createDate;

    /**
     * 修改人
     */
    private String modiPerson;

    /**
     * 修改时间
     */
    private java.util.Date modiDate;

    /**
     * 删除人
     */
    private String deletePerson;

    /**
     * 删除时间
     */
    private java.util.Date deleteDate;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private java.util.Date extend2;

    /**
     * 扩展字段3
     */
    private java.math.BigDecimal extend3;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSituationId() {
        return situationId;
    }

    public String getSalesAreaCode() {
        return salesAreaCode;
    }

    public String getSalesAreaName() {
        return salesAreaName;
    }

    public String getSalesVillageCode() {
        return salesVillageCode;
    }

    public String getSalesVillageName() {
        return salesVillageName;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public String getBuyerSapCode() {
        return buyerSapCode;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getUseAmount() {
        return useAmount;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public String getBuyerCode() {
        return buyerCode;
    }

    public String getCatagoryName() {
        return catagoryName;
    }

    public String getCatagoryCode() {
        return catagoryCode;
    }

    public String getBuName() {
        return buName;
    }

    public String getBuCode() {
        return buCode;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getModiPerson() {
        return modiPerson;
    }

    public Date getModiDate() {
        return modiDate;
    }

    public String getDeletePerson() {
        return deletePerson;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public String getExtend1() {
        return extend1;
    }

    public Date getExtend2() {
        return extend2;
    }

    public BigDecimal getExtend3() {
        return extend3;
    }

    public void setSituationId(String situationId) {
        this.situationId = situationId;
    }

    public void setSalesAreaCode(String salesAreaCode) {
        this.salesAreaCode = salesAreaCode;
    }

    public void setSalesAreaName(String salesAreaName) {
        this.salesAreaName = salesAreaName;
    }

    public void setSalesVillageCode(String salesVillageCode) {
        this.salesVillageCode = salesVillageCode;
    }

    public void setSalesVillageName(String salesVillageName) {
        this.salesVillageName = salesVillageName;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public void setBuyerSapCode(String buyerSapCode) {
        this.buyerSapCode = buyerSapCode;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setUseAmount(BigDecimal useAmount) {
        this.useAmount = useAmount;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = buyerCode;
    }

    public void setCatagoryName(String catagoryName) {
        this.catagoryName = catagoryName;
    }

    public void setCatagoryCode(String catagoryCode) {
        this.catagoryCode = catagoryCode;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public void setBuCode(String buCode) {
        this.buCode = buCode;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModiPerson(String modiPerson) {
        this.modiPerson = modiPerson;
    }

    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    public void setDeletePerson(String deletePerson) {
        this.deletePerson = deletePerson;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    public void setExtend2(Date extend2) {
        this.extend2 = extend2;
    }

    public void setExtend3(BigDecimal extend3) {
        this.extend3 = extend3;
    }

    @Override
    public String toString() {
        return "FundAccountSituationEntity{" +
                "situationId='" + situationId + '\'' +
                ", salesAreaCode='" + salesAreaCode + '\'' +
                ", salesAreaName='" + salesAreaName + '\'' +
                ", salesVillageCode='" + salesVillageCode + '\'' +
                ", salesVillageName='" + salesVillageName + '\'' +
                ", buyerId=" + buyerId +
                ", buyerSapCode='" + buyerSapCode + '\'' +
                ", buyerName='" + buyerName + '\'' +
                ", sellerId=" + sellerId +
                ", sellerName='" + sellerName + '\'' +
                ", balance=" + balance +
                ", useAmount=" + useAmount +
                ", availableBalance=" + availableBalance +
                ", buyerCode='" + buyerCode + '\'' +
                ", catagoryName='" + catagoryName + '\'' +
                ", catagoryCode='" + catagoryCode + '\'' +
                ", buName='" + buName + '\'' +
                ", buCode='" + buCode + '\'' +
                ", createPerson='" + createPerson + '\'' +
                ", createDate=" + createDate +
                ", modiPerson='" + modiPerson + '\'' +
                ", modiDate=" + modiDate +
                ", deletePerson='" + deletePerson + '\'' +
                ", deleteDate=" + deleteDate +
                ", extend1='" + extend1 + '\'' +
                ", extend2=" + extend2 +
                ", extend3=" + extend3 +
                '}';
    }
}