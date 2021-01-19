package uteq.student.whatsapp2.model;

public class estados {
    private String foto;
    private String nombre;
    private String hora;

    public estados() {
    }

    public estados(String foto, String nombre, String hora) {
        this.foto = foto;
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
