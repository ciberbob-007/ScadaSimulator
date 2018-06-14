package tech.app4.scadasimulator.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Environment {

    public Long Luz;
    public Double Temperatura;
    public Double TemperaturaLimite;
    public Long Ventilador;

    public Environment(){

    }

}
