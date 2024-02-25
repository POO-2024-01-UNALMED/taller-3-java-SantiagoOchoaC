package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;
    
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV++;
    }
    
    // Métodos set y get
    
    public void setMarca(Marca mar) {
        marca = mar;
    }
    
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setCanal(int canal) {
        if (this.estado == true && (canal <= 120 && canal >= 1)) {
            this.canal = canal;
        }
    }
    
    public int getCanal() {
        return this.canal;
    }
    
    public void setPrecio(int prec) {
        precio = prec;
    }
    
    public int getPrecio() {
        return this.precio;
    }
    
    public void setVolumen(int volumen) {
        if (this.estado == true && (volumen <= 7 && volumen >= 0)) {
            this.volumen = volumen;
        }
    }
    
    public int getVolumen() {
        return this.volumen;
    }
    
    public void setControl(Control contr) {
        control = contr;
    }
    
    public Control getControl() {
        return this.control;
    }
    
    public static void setNumTV(int num) {
        TV.numTV = num;
    }
    
    public static int getNumTV() {
        return TV.numTV;
    }
    
    public boolean getEstado() {
        return this.estado;
    }
    
    // Encendidio y Apagado
    
    public void turnOn() {
        this.estado = true;
    }
    
    public void turnOff() {
        this.estado = false;
    }
    
    // Canal
    
    public void canalUp() {
        if (this.estado == true && this.canal < 120) {
            this.canal++;
        }
    }
    
    public void canalDown() {
        if (this.estado == true && this.canal > 1) {
            this.canal--;
        }
    }
    
    // Volumen
    
    public void volumenUp() {
        if (this.estado == true && this.volumen < 7) {
            this.volumen++;
        }
    }

    public void volumenDown() {
        if (this.estado == true && this.volumen > 0) {
            this.volumen--;
        }
    }
}