package clase_2;

public class Condicionales {
    public static void main(String[] args) {
        
       //int edad = 85;
        // if = si..
        //if (edad < 17){
        //    System.out.println("No podes entrar, sos menor de edad");
        //} else if (edad > 65){
        //    System.out.println("No podes entrar, sos muy mayor de edad");
        //} else{ //en caso contrario
        //    System.out.println("Podes entrar, aposta tranqui");
        //}
       
        // 1 - 4 reprobado
        // 5 - 6 aprobado (bien)
        // 7 - 8 Aprobado (muy bien)
        // 9 - 10 Aprobado (excelente)

        int nota = 5;

        //&& = Y
        // and
        if(nota > 1 && nota <= 4){ // Evaluamos un rango
            System.out.println("Reprobado");
        } else if (nota > 4 && nota <= 6){
            System.out.println("Aprobado (Bien)");
        } else if (nota > 6 && nota <= 7){
            System.out.println("Aprobado (Muy bien)");
        } else {
            System.out.println("Aprobado (Excelente)");
        }

        //Switch

        String nombre = "Alberto";
        String mensaje;
        
        switch (nombre) {
            case "Alberto":
            mensaje = "Hola Alberto, como estas?";
            break;

             case "Marcos":
            mensaje = "Hola Marcos, que onda?";
            break;
        
            default:
            mensaje = "no hay mensaje para nadie";
                break;
        }

        System.out.println(mensaje);

        int mesActual = 17;
        if (mesActual == 1){
            System.out.println("Enero");
        } else if (mesActual == 2){
            System.out.println("Febrero");
        } else if (mesActual == 3){
            System.out.println("Marzo");
        } else if (mesActual == 4){
            System.out.println("Abril");
    }

     String mes;

     switch (mesActual) {
        case 1:
         mes = "Enero";
          break;
         case 2:
         mes = "Febrero"; 
         break;
          case 3:
         mes = "Marzo"; 
         break;
          case 4:
         mes = "Abril"; 
         break;
          case 5:
         mes = "Mayo"; 
         break;
          case 6:
         mes = "Junio"; 
         break;
          case 7:
         mes = "Julio"; 
         break;
          case 8:
         mes = "Agosto"; 
         break;
          case 9:
         mes = "Septiembre"; 
         break;
          case 10: 
         mes = "Octubre"; 
         break;
          case 11:
         mes = "Noviembre"; 
         break;
          case 12:
         mes = "Diciembre"; 
         break;
         

    
        default:
        mes = "No existe";
            break;
    }
    System.out.println("Mes actual:"+ mes);

    // !false = true
    // !true = false

    int notaa = 5;
    switch (notaa) {
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("Reprobado");
            break;
    }
// operador ternario
int edad = 65;
// 
boolean puedeEntrar = edad > 17;
String mensajee = puedeEntrar ? "Puede acceder" : "No puede acceder";
System.out.println(mensajee);
}

}