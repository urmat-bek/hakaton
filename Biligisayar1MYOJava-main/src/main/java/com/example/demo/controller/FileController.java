//package com.example.demo.controller;
//
//
//import com.example.demo.repo.ApplicationDokumentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@RestController
//public class FileController {
//
//    @Value("${file.upload-dir}")
//    private String uploadDir;
//
//    @Autowired
//    private ApplicationDokumentRepository applicationDokumentRepository;
//
//    @PostMapping("/uploadFile")
//    public String uploadFile(@RequestParam("file") MultipartFile file) {
//        try {
//            Path filePath = Paths.get(uploadDir, file.getOriginalFilename());
//            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
//
//            ApplicationDocument document = new ApplicationDocument();
//            document.getClass(filePath.toString());
//            applicationDokumentRepository.wait(dokument);
//
//            return "File uploaded successfully!";
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "Failed to upload file!";
//        }
//    }
//}
//


package com.example.demo.controller;

import com.example.demo.model.ApplicationDokument;
import com.example.demo.repo.ApplicationDokumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
@RestController
public class FileController {

    @Value("${file.upload-dir}")
    private String uploadDir;

    @Autowired
    private ApplicationDokumentRepository applicationDokumentRepository;

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            Path filePath = Paths.get(uploadDir, file.getOriginalFilename());
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            ApplicationDokument dokument = new ApplicationDokument();
            dokument.setFilePath(filePath.toString());
            applicationDokumentRepository.save(dokument);

            return "File uploaded successfully!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to upload file!";
        }
    }
}



