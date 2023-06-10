package com.example.sistemaDeLogin.controller;

import org.springframework.ui.Model;
import com.example.sistemaDeLogin.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class rotasDTO {
    @GetMapping("/")
    public String login(){
        return "login/index";
    }
    @GetMapping("te")
    @ResponseBody
    public String te(){
        return "Ola";
    }
    @PostMapping("/logando")
    public String realizarLogin(@ModelAttribute CredenciaisLogin credenciaisLogin, Model model) {
        try {
            Usuario usuario = usuarioRepository.findByNomeAndSenha(credenciaisLogin.getNome(), credenciaisLogin.getSenha());
            if (usuario != null) {
                model.addAttribute("usuario", usuario.getNome());
                return "login/logado";
            } else {
                return "login/erro";
            }
        } catch (Exception e) {
            // Trata a exceção de alguma forma, como por exemplo logá-la ou exibi-la para o usuário
            return "login/erro";
        }
    }

    @GetMapping("/logado")
    public String logado(){
        return "login/logado";
    }
    @GetMapping("/FazerCadastro")
    public String FazerCadastro(){
        return "login/cadastro";
    }
    @PostMapping("/cadastrar")
    public String cadastrarUsuario(@ModelAttribute Usuario usuario, Model model) {
        try {
            usuarioRepository.save(usuario);
            model.addAttribute("mensagem", "Cadastro realizado com sucesso!");
            return "redirect:/";
        } catch (Exception e) {
            model.addAttribute("mensagem", "Erro ao cadastrar usuário: " + e.getMessage());
            return "login/erro";
        }
    }
    @Autowired
    private UsuarioRepository usuarioRepository;

}