package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "training_program")
public class ApplicationDokument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_path")
    private String filePath;

    // Конструкторы, геттеры и сеттеры

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


    @Column(name = "program_name", nullable = false)
    private String program_name;

    @Lob
    @Column(name = "photo", nullable = false)
    private byte[] photo;

    @Lob
    @Column(name = "resume", nullable = false)
    private byte[] resume;

    @Lob
    @Column(name = "passport", nullable = false)
    private byte[] passport;

    @Lob
    @Column(name = "Diploma_of_Higher_Education", nullable = false)
    private byte[] Diploma_of_Higher_Education;

    @Lob
    @Column(name = "statement", nullable = false)
    private byte[] statement;

    @Lob
    @Column(name = "master_degree_diploma")
    private byte[] master_degree_diploma;

    @Lob
    @Column(name = "autobiography", nullable = false)
    private byte[] autobiography;

    @Lob
    @Column(name = "links_scientific_projects")
    private byte[] links_scientific_projects;

    @Lob
    @Column(name = "language_certificate", nullable = false)
    private byte[] language_certificate;

    public ApplicationDokument(String program_name, byte[] photo, byte[] resume, byte[] passport, byte[] Diploma_of_HigherEducation, byte[] statement, byte[] master_degree_diploma , byte[] autobiography, byte[] links_scientific_projects, byte[] language_certificate) {
        this.program_name = program_name;
        this.photo = photo;
        this.resume = resume;
        this.passport = passport;
        this.Diploma_of_Higher_Education = Diploma_of_HigherEducation;
        this.statement = statement;
        this.master_degree_diploma = master_degree_diploma ;
        this.autobiography = autobiography;
        this.links_scientific_projects = links_scientific_projects;
        this.language_certificate = language_certificate;
    }
    public ApplicationDokument(){
        super();
    }

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProgramName() {
        return program_name;
    }

    public void setProgramName(String programName) {
        this.program_name = programName;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public byte[] getResume() {
        return resume;
    }

    public void setResume(byte[] resume) {
        this.resume = resume;
    }

    public byte[] getPassport() {
        return passport;
    }

    public void setPassport(byte[] passport) {
        this.passport = passport;
    }

    public byte[] getDiploma_of_Higher_Education() {
        return Diploma_of_Higher_Education;
    }

    public void setDiplomaOfHigherEducation(byte[] diplomaOfHigherEducation) {
        this.Diploma_of_Higher_Education = diplomaOfHigherEducation;
    }

    public byte[] getStatement() {
        return statement;
    }

    public void setStatement(byte[] statement) {
        this.statement = statement;
    }

    public byte[] getMasterDegreeDiploma() {
        return master_degree_diploma;
    }

    public void setMasterDegreeDiploma(byte[] masterDegreeDiploma) {
        this.master_degree_diploma = masterDegreeDiploma;
    }

    public byte[] getAutobiography() {
        return autobiography;
    }

    public void setAutobiography(byte[] autobiography) {
        this.autobiography = autobiography;
    }

    public byte[] getLinksScientificProjects() {
        return links_scientific_projects;
    }

    public void setLinksScientificProjects(byte[] linksScientificProjects) {
        this.links_scientific_projects = linksScientificProjects;
    }

    public byte[] getLanguageCertificate() {
        return language_certificate;
    }

    public void setLanguageCertificate(byte[] languageCertificate) {
        this.language_certificate = languageCertificate;
    }
}

