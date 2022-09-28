package com.grupo13.app.rents.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.protocol.Message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_client")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Client implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer idClient; //Colocar el mismo nombre que esta en la base de datos
    //en dado caso, si es diferente se colocaria
    //[@Column(name="quad_id")]
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Integer password;
    @Column
    private Integer age;
    @Column
    private Message messages;
    @Column
    private Reservation reservations;
  


    

}
