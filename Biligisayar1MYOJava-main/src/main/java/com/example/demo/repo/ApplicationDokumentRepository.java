package com.example.demo.repo;

import com.example.demo.model.ApplicationDokument; // Замените ApplicationDokument на ApplicationDocument
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationDokumentRepository extends JpaRepository<ApplicationDokument, Long> {
    // Дополнительные методы, если необходимо
}
