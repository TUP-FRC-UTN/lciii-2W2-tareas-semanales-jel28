package actividad_arreglos;


public class Cliente {
    
   private int numero_cliente;
   private String nombre_cliente;
   private int antiguedad;
   private String nombre_mascota;
   private int edad_mascota;

    public int getNumero_cliente() {
        return numero_cliente;
    }

    public void setNumero_cliente(int numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public int getEdad_mascota() {
        return edad_mascota;
    }

    public void setEdad_mascota(int edad_mascota) {
        this.edad_mascota = edad_mascota;
    }
    
    
    public Cliente()
    { }

    public Cliente(int numero_cliente, String nombre_cliente, int antiguedad, String nombre_mascota, int edad_mascota) {
        this.numero_cliente = numero_cliente;
        this.nombre_cliente = nombre_cliente;
        this.antiguedad = antiguedad;
        this.nombre_mascota = nombre_mascota;
        this.edad_mascota = edad_mascota;
    }

    @Override
    public String toString() {
        return "Número de cliente: " + numero_cliente + ", Nombre del Cliente: " + nombre_cliente + ", Antiguedad del Cliente: " + antiguedad + ", Nombre de la Mascota: " + nombre_mascota + ", Edad de la mascota: " + edad_mascota ;
    }
  
}

