package com.grupo13.app.rents.model;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="tb_reservation")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer idReservation; //Colocar el mismo nombre que esta en la base de datos
    //en dado caso, si es diferente se colocaria
    //[@Column(name="quad_id")]
    @Column
    private Date startDate;
    @Column
    private Date devolutionDate;
    @Column
    private String status;
    @Column
    private Quadbike quadbike;
    @Column
    private Client client;
    @Column
    private String score;




    

}
