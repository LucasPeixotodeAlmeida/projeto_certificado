package com.projetonlw.projeto_certificado.modules.students.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetonlw.projeto_certificado.modules.students.entities.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, UUID>{
    public Optional <StudentEntity> findByEmail(String email);
}
