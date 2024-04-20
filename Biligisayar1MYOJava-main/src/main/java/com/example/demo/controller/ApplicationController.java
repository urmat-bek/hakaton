//package com.example.demo.controller;
//
//import com.example.demo.model.ApplicationDokument;
//import com.example.demo.repo.ApplicationDokumentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class ApplicationController {
//    @Autowired
//    private ApplicationDokumentRepository applicationDocumentRepository;
////    private final ApplicationDocument dokument;
//
//    @GetMapping("/applicationDokument")
//    public String appDocG() {
//        return "applicationDokument";
//    }
//
//    @PostMapping("/applicationDokument")
//    public String appDocP(@ModelAttribute("dokument") ApplicationDokument applicationDocument) {
//        applicationDocumentRepository.save(applicationDocument);
//        return "applicationDokument";
//    }
//
//}

package com.example.demo.controller;

import com.example.demo.model.ApplicationDokument;
import com.example.demo.repo.ApplicationDokumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ApplicationController {

    @Autowired
    private ApplicationDokumentRepository applicationDokumentRepository;

    @GetMapping("/applicationDokument")
    public String appDocG() {
        return "applicationDokument";
    }

    @PostMapping("/applicationDokument")
    public String appDocP(@RequestParam("programName") String programName,
                          @RequestParam("photo") MultipartFile photo,
                          @RequestParam("resume") MultipartFile resume,
                          @RequestParam("passport") MultipartFile passport,
                          @RequestParam("diploma") MultipartFile diploma,
                          @RequestParam("statement") MultipartFile statement,
                          @RequestParam("masterDegreeDiploma") MultipartFile masterDegreeDiploma,
                          @RequestParam("autobiography") MultipartFile autobiography,
                          @RequestParam("linksScientificProjects") MultipartFile linksScientificProjects,
                          @RequestParam("languageCertificate") MultipartFile languageCertificate) {
        try {
            byte[] photoBytes = photo.getBytes();
            byte[] resumeBytes = resume.getBytes();
            byte[] passportBytes = passport.getBytes();
            byte[] diplomaBytes = diploma.getBytes();
            byte[] statementBytes = statement.getBytes();
            byte[] masterDegreeDiplomaBytes = masterDegreeDiploma.getBytes();
            byte[] autobiographyBytes = autobiography.getBytes();
            byte[] linksScientificProjectsBytes = linksScientificProjects.getBytes();
            byte[] languageCertificateBytes = languageCertificate.getBytes();

            ApplicationDokument applicationDokument = new ApplicationDokument(programName,
                    photoBytes, resumeBytes, passportBytes, diplomaBytes, statementBytes,
                    masterDegreeDiplomaBytes, autobiographyBytes, linksScientificProjectsBytes,
                    languageCertificateBytes);

            applicationDokumentRepository.save(applicationDokument);
        } catch (Exception e) {
            // Обработка ошибок
            e.printStackTrace();
        }

        return "applicationDokument";
    }
}

