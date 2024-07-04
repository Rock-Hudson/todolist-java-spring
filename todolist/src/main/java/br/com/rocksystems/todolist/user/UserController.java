package br.com.rocksystems.todolist.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Toda classe possui modificadores, esse modificadores podem ser
 * Public - Acessop total
 * Private - Acesso somente a alguns atributos
 * Protected - Somente classes do mesmo pacote acessam 
 * Class, enum, interface
 */
@RestController
@RequestMapping("/users")
public class UserController {
    /*
     * TIPOS DE RETORNOS
     * String(texto)
     * Integer (int) Números Inteiros
     * Double (reais) Números reais 0.0
     * Float (parece com o double, menor capacidade)
     * char (A, C) Um caracter
     * Date (trbalhar com datas)
     * void (quando nao existe retorno)
     */
    /*
     * Body
     * 
     */

     @PostMapping("/")
    public void create(@RequestBody UserModel userModel){

        System.out.println(userModel.getUserName());
        System.out.println(userModel.getPassword());
        System.out.println(userModel.getName());

    }  



}
