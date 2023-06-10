package com.example.sistemaDeLogin.Repository;

import com.example.sistemaDeLogin.controller.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNome(String nome);

    //Trabalhando junto com credenciaisLogin repository
    Usuario findByNomeAndSenha(String nome, String senha);
}