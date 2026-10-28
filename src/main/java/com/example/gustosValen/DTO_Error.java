package com.example.gustosValen;

public class DTO_Error {
    private String mensaje;
    private int hhtpsatatus;
    private Long milis;
    
    public DTO_Error(String mensaje, int hhtpsatatus, Long milis) {
        this.mensaje = mensaje;
        this.hhtpsatatus = hhtpsatatus;
        this.milis = milis;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getHhtpsatatus() {
        return hhtpsatatus;
    }

    public void setHhtpsatatus(int hhtpsatatus) {
        this.hhtpsatatus = hhtpsatatus;
    }

    public Long getMilis() {
        return milis;
    }

    public void setMilis(Long milis) {
        this.milis = milis;
    }
    

    
}
