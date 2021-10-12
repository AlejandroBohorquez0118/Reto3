/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.Modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author roll-
 */

@Entity
@Table(name="Especialidad")
public class Especialidad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "especialidad")
    public List<Doctor> Doctores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Doctor> getDoctores() {
        return Doctores;
    }

    public void setDoctores(List<Doctor> Doctores) {
        this.Doctores = Doctores;
    }
    
    
    
    
}
