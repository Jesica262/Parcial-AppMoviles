package com.example.parcial;


import java.io.Serializable;

public class Usuarios implements Serializable {

    public int id;
    public String name;
    public String contraenia;

    public Usuarios(int id, String name, String contraenia) {
        this.id = id;
        this.name = name;
        this.contraenia = contraenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContraenia() {
        return contraenia;
    }

    public void setContraenia(String contraenia) {
        this.contraenia = contraenia;
    }
}
