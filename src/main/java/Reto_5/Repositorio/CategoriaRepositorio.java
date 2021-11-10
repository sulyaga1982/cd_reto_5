/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_5.Repositorio;

import Reto_5.Modelo.Categoria;
import Reto_5.Interface.InterfaceCategoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sulya
 */
@Repository
	public class CategoriaRepositorio {
	      @Autowired
	    private InterfaceCategoria crud;
	    public List<Categoria> getAll(){
	        return (List<Categoria>) crud.findAll();
	    }
	    public Optional<Categoria> getCategoria(int id){
	        return crud.findById(id);
	    }
	
	    public Categoria save(Categoria Categoria){
	        return crud.save(Categoria);
	    }
	    public void delete(Categoria Categoria){
	       crud.delete(Categoria);
	    }
}    
    
