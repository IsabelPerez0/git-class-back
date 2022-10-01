package com.grupo13.app.rents.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo13.app.rents.entities.Category;
import com.grupo13.app.rents.entities.Quadbike;
import com.grupo13.app.rents.interfaces.ICategoryRepository;
import com.grupo13.app.rents.interfaces.IQuadbikeRepository;

@Service
public class QuadbikeService {
    @Autowired
    IQuadbikeRepository repository;
    @Autowired
    ICategoryRepository categoryRepository;
    
    public Iterable<Quadbike> get(){

        Iterable<Quadbike> response = repository.findAll();
        return response;
    }

    public Optional<Quadbike> get(Integer id){

        Optional<Quadbike> response = repository.findById(id);
        return response;
    }

    public String create(Quadbike request){
        Optional<Category> cat = categoryRepository.findById(request.getCategory().getId());
        if(!cat.isEmpty()){
            request.setCategory(cat.get());
        }
        if(request.getName()!=null){
            repository.save(request);
            return "Created ...";
            
        }else{
            return "Falta el nombre";
        }
        
    }

    public Quadbike update(Quadbike quadbike){
        Quadbike quadbikeToUpdate = new Quadbike();
        if(repository.existsById(quadbike.getId())){ // si existe
            quadbikeToUpdate = quadbike;
            repository.save(quadbikeToUpdate);
        }
        return quadbikeToUpdate;
    }

    public Boolean delete(Integer id){
        repository.deleteById(id);
        Boolean delete = true;
        return delete;
    }

}
