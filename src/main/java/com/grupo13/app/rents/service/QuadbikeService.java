package com.grupo13.app.rents.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo13.app.rents.entities.Category;
import com.grupo13.app.rents.entities.Quadbike;
import com.grupo13.app.rents.interfaces.ICategoryRepository;
import com.grupo13.app.rents.repository.QuadbikeRepository;

@Service
public class QuadbikeService {
    @Autowired
    QuadbikeRepository repository;
    @Autowired
    ICategoryRepository categoryRepository;
    
    public Iterable<Quadbike> get(){

        Iterable<Quadbike> response = repository.getAll();
        return response;
    }

    public Optional<Quadbike> get(Integer id){

        Optional<Quadbike> response = repository.findById(id);
        return response;
    }

    /*public String create(Quadbike request){
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
        
    }*/

    public Quadbike create(Quadbike request) {        
        return repository.save(request);
    }


    public Quadbike update(Quadbike quadbike){
        if(quadbike.getId()!=null){
            Optional<Quadbike> e= repository.findById(quadbike.getId());
            if(!e.isEmpty()){
                if(quadbike.getName()!=null){
                    e.get().setName(quadbike.getName());
                }
                if(quadbike.getBrand()!=null){
                    e.get().setBrand(quadbike.getBrand());
                }
                if(quadbike.getDescription()!=null){
                    e.get().setDescription(quadbike.getDescription());
                }
                if(quadbike.getYear()!=null){
                    e.get().setYear(quadbike.getYear());
                }
                if(quadbike.getCategory()!=null){
                    e.get().setCategory(quadbike.getCategory());
                }
                repository.save(e.get());
                return e.get();
            }else{
                return quadbike;
            }
        }else{
            return quadbike;
        }
    }


  
    /*  public Quadbike update(Quadbike quadbike){
        Quadbike quadbikeToUpdate = new Quadbike();
        
        if(repository.existsById(quadbike.getId())){ // si existe
            quadbikeToUpdate = quadbike;
            repository.save(quadbikeToUpdate);
        }
        return quadbikeToUpdate;
    }*/

    public Boolean delete(Integer id){
        repository.deleteById(id);
        Boolean delete = true;
        return delete;
    }

    

    public List<Object[]> getReport(){
        
         //List<Quadbike> response = new ArrayList<>();
        //logica de coomo procesar la petición al repositorio
        List<Object[]> result = repository.getReport();
        
        
        return result;
        
    }
}
