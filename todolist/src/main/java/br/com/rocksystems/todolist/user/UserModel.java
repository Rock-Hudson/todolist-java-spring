package br.com.rocksystems.todolist.user;


import lombok.Data;

@Data
@Entity(name ="tb_usuarios")
public class UserModel {

    private String userName;
    private String name;
    private String password;

    /*
     * Qunado definimos atributos de forma privada, precisamos criar meios para acessalos
     * Existem dois metodos importantes nesse caso
     * Metodos Getters e Setters
     * Getters para obter o atributo 
     * Setter para alterar o atributo
     */
}
