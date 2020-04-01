package com.jiankang.study.javaprogramminglogic.chapter14.v2;

/*
 *@create by jiankang
 *@date 2020/3/30 time 20:05
 */

public class ContractInfo {
    String phone;
    String address;
    String email;

    public ContractInfo(String phone, String address, String email) {
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContractInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
