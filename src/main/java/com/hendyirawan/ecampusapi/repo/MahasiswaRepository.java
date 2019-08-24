package com.hendyirawan.ecampusapi.repo;

import com.hendyirawan.ecampusapi.core.Mahasiswa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository
        extends JpaRepository<Mahasiswa, Long> {

    Page<Mahasiswa> findAllByKelamin(String kelamin, Pageable page);

}
