/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.upload.repository;

import com.example.upload.model.Partai;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PartaiRepository extends JpaRepository<Partai, Integer>{
    @Query("SELECT u FROM Partai u where namaPartai = ?1")
    public List<Partai> findByNama(String namaPartai);
}
