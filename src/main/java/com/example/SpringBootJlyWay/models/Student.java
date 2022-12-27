package com.example.SpringBootJlyWay.models;

import jakarta.persistence.*;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    private String mssv;
    private String hoten;
    private Date ngaythangsinh;
    public Student(){}
    public Student(String mssv, String hoten, Date ngaythangsinh) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.ngaythangsinh = ngaythangsinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgaythangsinh() {
        return ngaythangsinh;
    }

    public void setNgaythangsinh(Date ngaythangsinh) {
        this.ngaythangsinh = ngaythangsinh;
    }
}
