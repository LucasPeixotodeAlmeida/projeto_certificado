package com.projetonlw.projeto_certificado.modules.students.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetonlw.projeto_certificado.modules.students.dto.VerifyHasCertificationDTO;
import com.projetonlw.projeto_certificado.modules.students.repositories.CertificationStudentRepository;

@Service
public class VerifyIfHasCertificationService {

    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute(VerifyHasCertificationDTO dto){
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if(!result.isEmpty()){
            return true;
        }
        return false;
    }
}
