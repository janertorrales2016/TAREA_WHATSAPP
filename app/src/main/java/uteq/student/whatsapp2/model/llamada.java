package uteq.student.whatsapp2.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class llamada {
    private String Name;
    private String Hora;
    private String Estado;
    private String Photo;
    private String callvideo;

    public llamada() {
    }

    public llamada(String name, String hora, String estado, String photo, String callvideo) {
        Name = name;
        Hora = hora;
        Estado = estado;
        Photo = photo;
        this.callvideo = callvideo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getCallvideo() {
        return callvideo;
    }

    public void setCallvideo(String callvideo) {
        this.callvideo = callvideo;
    }
    public llamada(JSONObject a) throws JSONException{
        Name = a.getString("nombre").toString();
        Hora= a.getString("hora").toString();
        Estado= a.getString("estado").toString();
        Photo = a.getString("foto").toString();
        callvideo = a.getString("tipo").toString();

    }
    public static ArrayList<llamada> JsonObjectsBuild(JSONArray datos) throws JSONException{
        ArrayList<llamada> arrllamada = new ArrayList<>();
        for (int i=0; i<datos.length();i++){
            arrllamada.add(new llamada(datos.getJSONObject(i)));
        }
        return arrllamada;
    }
}
