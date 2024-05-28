package com.projetonlw.projeto_certificado.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetonlw.projeto_certificado.modules.students.dto.VerifyHasCertificationDTO;
import com.projetonlw.projeto_certificado.modules.students.service.VerifyIfHasCertificationService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationService verifyIfHasCertificationService;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
        var result = this.verifyIfHasCertificationService.execute(verifyHasCertificationDTO);
        if(result){
            return "usuario ja fez a prova";
        }
        return "usuario nao pode fazer a prova";
    }
}