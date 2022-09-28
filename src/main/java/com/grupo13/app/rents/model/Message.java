package com.grupo13.app.rents.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_message")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Message implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer idMessage; //Colocar el mismo nombre que esta en la base de datos
    //en dado caso, si es diferente se colocaria
    //[@Column(name="quad_id")]
    @Column
    private String messageText;
    @Column
    private Quadbike quadbike;
    @Column
    private Client client;


    

}
