/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.upload.model;

public class JumlahSuara {
    private String namaPartai;
    private Integer jmlSuara;

    public JumlahSuara() {
    }
    
    

    public JumlahSuara(String namaPartai, Integer jmlSuara) {
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
}
