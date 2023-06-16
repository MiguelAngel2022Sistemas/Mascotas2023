package com.example.mascota.animales;

import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Mascota;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class  MascotasRepositoy {
    private static final Map<String, Mascota> mascotas = new HashMap<>();

    @PostConstruct
    public void initData() {

        //
        Mascota chihuahua = new Mascota();
        chihuahua.setName("luffy");
        chihuahua.setRaza("chihuahua");
        chihuahua.setPropietario("jose daniel flores cuchipampa");

        mascotas.put(chihuahua.getName(), chihuahua);
        //
        Mascota boxer = new Mascota();
        boxer.setName("luffy");
        boxer.setRaza("boxer");
        boxer.setPropietario("jose daniel flores cuchipampa");

        mascotas.put(boxer.getName(), boxer);
        //
        Mascota labrador = new Mascota();
        labrador.setName("luffy");
        labrador.setRaza("labrador");
        labrador.setPropietario("jose daniel flores cuchipampa");

        mascotas.put(labrador.getName(), labrador);
    }

    public Mascota findCountry(String name) {
        Assert.notNull(name, "The animal's name must not be null");
        return mascotas.get(name);
    }
}