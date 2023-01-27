package com.usaaExample.demo01;

public class Greeting {
    private Long id;
    private String messahe;

    public Greeting(Long id, String messahe) {
        this.id = id;
        this.messahe = messahe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessahe() {
        return messahe;
    }

    public void setMessahe(String messahe) {
        this.messahe = messahe;
    }
}
