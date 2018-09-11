/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula36;

/**
 *
 * @author thiago
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-9999");
        
        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Throens");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");
        
        contato.setEndereco(end);
        
        //relacionamento tem-muitos (telefones) - usando um array de Telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("62");
        telefone.setNumero("99999-9999");
        
        
        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("62");
        telefone2.setNumero("88888-8888");
        
        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;
        
        //contato.setTelefone(telefone); -> relacionamento tem-um
        contato.setTelefones(telefones);
        //Teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());
        
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
        
        //mudamos depois de transformar em vetor
       /*if(contato != null && contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }*/
       
       
       if(contato != null && contato.getTelefones() != null){
           for(Telefone t: contato.getTelefones()){
               System.out.println(t.getDdd() + " " + t.getNumero());
           }
       }
    }
    
}
