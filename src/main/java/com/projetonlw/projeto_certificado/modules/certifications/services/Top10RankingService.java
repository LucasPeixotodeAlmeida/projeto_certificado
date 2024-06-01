package com.projetonlw.projeto_certificado.modules.certifications.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetonlw.projeto_certificado.modules.students.entities.CertificationStudentEntity;
import com.projetonlw.projeto_certificado.modules.students.repositories.CertificationStudentRepository;





@Service
public class Top10RankingService {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public List<CertificationStudentEntity> execute() {
        var result = this.certificationStudentRepository.findTop10ByOrderByGradeDesc();
        return result;
    }
}