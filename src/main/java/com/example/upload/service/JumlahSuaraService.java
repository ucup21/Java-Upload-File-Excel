package com.example.upload.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.upload.model.JumlahSuara;
import com.example.upload.model.Partai;
import com.example.upload.repository.PartaiRepository;

@Service
public class JumlahSuaraService {
	@Autowired
	PartaiRepository partaiRepository;
	
	public List<JumlahSuara> getJumlahSuara() {
        List<Partai> partai = partaiRepository.findAll();
        Partai p = new Partai();
        int jmlMerah = 0;
        int jmlKuning = 0;
        int jmlHijau = 0;
        JumlahSuara jsMerah = new JumlahSuara();
        JumlahSuara jsKuning = new JumlahSuara();
        JumlahSuara jsHijau = new JumlahSuara();
        for (Partai p1 : partai) {
            p = p1;
            if (p.getNamaPartai().equals("Merah")) {
                jmlMerah = jmlMerah + p.getJmlSuara();
                jsMerah.setNamaPartai(p.getNamaPartai());
                jsMerah.setJmlSuara(jmlMerah);
            }
            if (p.getNamaPartai().equals("Kuning")) {
                jmlKuning = jmlKuning + p.getJmlSuara();
                jsKuning.setNamaPartai(p.getNamaPartai());
                jsKuning.setJmlSuara(jmlKuning);
            }
            if (p.getNamaPartai().equals("Hijau")) {
                jmlHijau = jmlHijau + p.getJmlSuara();
                jsHijau.setNamaPartai(p.getNamaPartai());
                jsHijau.setJmlSuara(jmlHijau);
            }
        }
        List<JumlahSuara> jses = new ArrayList<>();
        jses.add(jsMerah);
        jses.add(jsKuning);
        jses.add(jsHijau);
        return jses;
    }
}
