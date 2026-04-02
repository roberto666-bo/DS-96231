package com.example.spring_basico.ClienteRepositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_basico.models.CLienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<CLienteModel, Long>{

}
