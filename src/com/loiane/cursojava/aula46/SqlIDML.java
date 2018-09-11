/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loiane.cursojava.aula46;

/**
 *
 * @author thiago
 */
public interface SqlIDML {
    
    void insert(String query);
    void update(String query);
    void delete(String query);
    String select(String query);
}
