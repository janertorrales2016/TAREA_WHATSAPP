package uteq.student.whatsapp2.model;

public class mensajes {
    private String Nombre;
    private String Mensaje;
    private String Hora;
    private String Cantidad;
    private String foto;
    private int estado;

    public mensajes() {
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public mensajes(String nombre, String mensaje, String hora, String cantidad, String foto, int estado) {
        Nombre = nombre;
        Mensaje = mensaje;
        Hora = hora;
        Cantidad = cantidad;
        this.foto = foto;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}

