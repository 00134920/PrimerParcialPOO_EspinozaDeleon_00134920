package Clases;

public class Telefono extends Dispositivo{
    String Camara;
    String Bateria;
    public Telefono(){}
    public Telefono(String Modelo,String SO,String Camara,String Bateria){
        this.Modelo=Modelo;
        this.SO=SO;
        this.Camara=Camara;
        this.Bateria=Bateria;
    }
    public String getCamara(){return Camara;}
    public void setCamara(String Camara){this.Camara=Camara;}
    public String getBateria(){return Bateria;}
    public void setBateria(String Bateria){this.Bateria=Bateria;}

}
