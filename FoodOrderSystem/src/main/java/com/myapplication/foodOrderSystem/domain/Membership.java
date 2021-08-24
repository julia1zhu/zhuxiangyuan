package com.myapplication.foodOrderSystem.domain;

/**
 * @author 朱香原
 */
public class Membership {
    private Integer memberId;
    private String memberName;
    private Double discount;
    private Integer account;

    @Override
    public String toString() {
        return "Membership{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Membership() {
    }

    public Membership(Integer memberId, String memberName, Double discount, Integer account) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.discount = discount;
        this.account = account;
    }



    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }
}
