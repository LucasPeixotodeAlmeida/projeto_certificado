package com.projetonlw.projeto_certificado.modules.students.service;

import org.springframework.stereotype.Service;

import com.projetonlw.projeto_certificado.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationService {
    public boolean execute(VerifyHasCertificationDTO dto){
        if(dto.getEmail().equals("lucas@gmail.com") && dto.getTechnology().equals("java")){
            return true;
        }
        return false;
    }
}
