package com.hendyirawan.ecampusapi.repo;

import com.hendyirawan.ecampusapi.core.BiodataMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BiodataMahasiswaRepository
        extends JpaRepository<BiodataMahasiswa, Long> {
}
