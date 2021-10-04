package br.com.unilago.ltp.Consumidor.entity;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Consumidor extends PanacheEntity{

    public String nome;

    public String cpf;

    public String genero;
    
    public String dataAniversario;

    public String celular;

    public int idEndereco;
}