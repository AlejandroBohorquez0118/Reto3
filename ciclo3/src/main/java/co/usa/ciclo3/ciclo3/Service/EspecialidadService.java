/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.Service;

import co.usa.ciclo3.ciclo3.Modelo.Especialidad;
import co.usa.ciclo3.ciclo3.Repository.crud.EspecialidadRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author roll-
 */
@Service
public class EspecialidadService {
    
    @Autowired
    private EspecialidadRepository especialidadRepository;
    
    public List<Especialidad> getAll(){
    
        return especialidadRepository.getAll();
        
    }
    
    
    public Optional<Especialidad> getEspecialidad(int id){
        
        return especialidadRepository.getEspecialidad(id);
        
    }
    
    public Especialidad save(Especialidad s){
    
        if(s.getId()==null){
        
            return especialidadRepository.save(s);
            
        } 
    
        else {
            Optional<Especialidad> paux=especialidadRepository.getEspecialidad(s.getId());
            if(paux.toString().equals("")){
                
                return especialidadRepository.save(s);
                
            }
            
            else{
                
                return s;
                
            }
    }
        

}}