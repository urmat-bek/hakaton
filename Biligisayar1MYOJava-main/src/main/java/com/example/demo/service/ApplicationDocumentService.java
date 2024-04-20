package com.example.demo.service;

import com.example.demo.repo.ApplicationDokumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationDocumentService {
    private final ApplicationDokumentRepository documentRepository;

    @Autowired
    public ApplicationDocumentService(ApplicationDokumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    // Методы для сохранения, получения и управления заявками документов
}

