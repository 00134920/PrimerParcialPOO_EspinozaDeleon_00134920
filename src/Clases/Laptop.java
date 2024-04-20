package Clases;

public class Laptop extends Dispositivo{
    String MemoriaRAM;
    String TamañoPantalla;

    public Laptop(){}
    public Laptop(String Modelo,String SO,String MemoriaRAM,String TamañoPantalla){
        this.Modelo=Modelo;
        this.SO=SO;
        this.MemoriaRAM=MemoriaRAM;
        this.TamañoPantalla=TamañoPantalla;
    }

    public String getMemoriaRAM() {return MemoriaRAM;}
    public void setMemoriaRAM(String memoriaRAM) {MemoriaRAM = memoriaRAM;}
    public String getTamañoPantalla() {return TamañoPantalla;}
    public void setTamañoPantalla(String tamañoPantalla) {TamañoPantalla = tamañoPantalla;}
}
