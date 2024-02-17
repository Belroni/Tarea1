package com.example.tarea1.repositories;

import com.example.tarea1.models.UsuarioModel;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;

@Repository

public class UsuarioRepositories extends CrudRepository<UsuarioModel, Long{
    
}
