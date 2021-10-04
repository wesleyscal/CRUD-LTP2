package br.com.unilago.ltp.Empressa.entity;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Empressa extends PanacheEntity{

    public String razaoSocial;

    public String CNPJ;

    public String idEndereco;
    
}
