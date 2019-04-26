/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.upload.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "partai")
public class Partai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "namaPartai")
    private String namaPartai;
    @Column(name = "jmlSuara")
    private Integer jmlSuara;

    @Transient
    private MultipartFile file;
    
    public Partai(){
        
    }
    
    public Partai(String namaPartai, Integer jmlSuara) {
        this.id = id;
        this.namaPartai = namaPartai;
        this.jmlSuara = jmlSuara;
    }

    public String getNamaPartai() {
        return namaPartai;
    }

    public void setNamaPartai(String namaPartai) {
        this.namaPartai = namaPartai;
    }

    public Integer getJmlSuara() {
        return jmlSuara;
    }

    public void setJmlSuara(Integer jmlSuara) {
        this.jmlSuara = jmlSuara;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
    
}
