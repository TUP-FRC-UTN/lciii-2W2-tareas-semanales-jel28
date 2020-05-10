package actividad_arreglos;
import java.util.Scanner;

public class Actividad_arreglos {
   
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Cliente [ ] v_Clientes;
        
        System.out.println("Ingrese cantidad de clientes: ");
        int cantidad = sc.nextInt();
        
        v_Clientes = new Cliente [cantidad];
        
        for (int i = 0; i < v_Clientes.length; i++) {
            sc.nextLine();
            System.out.println("Ingrese número de cliente " + (i+1)+ " :" );
            int numero_cliente= sc.nextInt();
            System.out.println("Ingrese nombre del cliente " + (i+1)+ " :" );
            String nombre_cliente= sc.next();
            System.out.println("Ingrese antiguedad del cliente " + (i+1)+ " :" );
            int antiguedad= sc.nextInt();
            System.out.println("Ingrese nombre de la Mascota " + (i+1)+ " :" );
            String nombre_mascota= sc.next();
            System.out.println("Ingrese edad de la mascota " + (i+1)+ " :" );
            int edad_mascota= sc.nextInt();
            
            v_Clientes[i]= new Cliente(numero_cliente, nombre_cliente, antiguedad, nombre_mascota, edad_mascota);
                    
        }
          
        //PROMEDIO DE EDAD DE LAS MASCOTAS
        double acu_edad=0;
        int cont_clientes=0;
        for (int i = 0; i < v_Clientes.length; i++) {
            if(v_Clientes[i]!=null)
            { acu_edad+= v_Clientes[i].getEdad_mascota();
              cont_clientes++;
            }           
        }
              
        //CLIENTES CON ANTIGUEDAD MAYOR O IGUAL A 5 AÑOS
        int antiguedad_may_5 =0;
        for (int i = 0; i < v_Clientes.length; i++) {
            if(v_Clientes[i]!= null && v_Clientes[i].getAntiguedad() >= 5 )
                antiguedad_may_5 ++ ;          
        }
             
        for (int i = 0; i < v_Clientes.length; i++) {
            System.out.println("Datos del cliente " + (i+1) + ": "+v_Clientes[i]);
            
        }
        
        System.out.println("Cantidad de clientes: " + cont_clientes);  //CANTIDAD DE CLIENTES
        System.out.println("Promedio de edad de las mascotas: " + (double)acu_edad/cont_clientes + " años");
        System.out.println("Cantidad de clientes con antiguedad mayor o igual a 5 años: " + antiguedad_may_5);
    }
    
}

//2. Una Veterinaria encargada del cuidado de mascotas ha solicitado la realización de un software 
//para obtener resultados sobre sus clientes y sus respectivas mascotas. (Suponer que cada cliente
//posee una sola mascota)
//Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, 
//un nombre, una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota.
//De la Mascota se dispone los siguientes datos: el nombre y la edad.
//El software requiere cargar un número n de Clientes (este valor deberá ser cargado por teclado). 
//Almacenar la información de los clientes en un arreglo.
//Se pide:
// Mostrar la cantidad de clientes.
// Mostrar el promedio de edad de las mascotas.
// Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.