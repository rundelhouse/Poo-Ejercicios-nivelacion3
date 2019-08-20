package poo.modelo;

public class Artefacto {
   private String nombre;
   private double costo;
   private String tipo;
   private boolean contado;
   
   private double descuento;
   private double incremento;
   private double iva;
   private double total;

    public Artefacto(String nombre, double costo, String tipo, boolean contado) {
        this.nombre = nombre;
        this.costo = costo;
        this.tipo = tipo;
        this.contado = contado;
    }

    public Artefacto() {
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getContado() {
        return contado;
    }

    public void setContado(boolean contado) {
        this.contado = contado;
    }
   
    private void setDescuentoOIncremento(){
        if(contado == true){
            incremento = 0;
            switch(tipo){
                case "audio":
                    descuento = costo * -0.06;
                break;
                
                case "video":
                    descuento = costo * -0.08;
                break;
                
                case "linea_blanca":
                    descuento = costo * -0.07;
                break;
                    
                default:
                   descuento = 0;
                break;
            }
        }else{
            descuento = 0 ;
            switch(tipo){
                case "audio":
                    incremento = costo * 0.07;
                break;
                
                case "video":
                    incremento = costo * 0.09;
                break;
                
                case "linea_blanca":
                    incremento = costo * 0.1;
                break;
                    
                default:
                    incremento = 0;
                break;
            }
        }
    }    
    
    private void setIva(){        
        iva = (costo + descuento + incremento) * 0.18;
    }
    
    private void calcular(){
        setDescuentoOIncremento();
        setIva();
        total = costo + descuento + incremento + iva;         
    }
    
    public double getTotal(){
        calcular();
        return (Math.round(total * 100d) / 100d);
    }    

    public double getDescuento() {
        return (Math.round(descuento * 100d) / 100d);
    }

    public double getIncremento() {
        return (Math.round(incremento * 100d) / 100d);
    }

    public double getIva() {
        return (Math.round(iva * 100d) / 100d);
    } 
    
   
}
