package org.example;
import java.util.Scanner;
public class PRACTICA_1 {
    public void Ejercicio(){

        Scanner entrada = new Scanner(System.in);

        String fecha;
        int fecha_longitud;
        String fecha_dd;
        String fecha_aaaa;
        int fecha_dd_int;
        int fecha_mm_int;
        int fecha_aaaa_int;
        char fecha_barra1;
        char fecha_barra2;
        String fecha_mm;

        while (true) {

            try{
                System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");

                fecha = entrada.nextLine();
                fecha_longitud = fecha.length();
                fecha_dd = fecha.substring(0,2);
                fecha_aaaa = fecha.substring(6,10);
                fecha_barra1 = fecha.charAt(2);
                fecha_barra2 = fecha.charAt(5);
                String barra1 = Character.toString(fecha_barra1);
                String barra2 = Character.toString(fecha_barra2);
                Boolean barra1boolean = barra1.equals("/");
                Boolean barra2boolean = barra2.equals("/");
                fecha_mm = fecha.substring(3,5);
                fecha_mm_int = Integer.parseInt(fecha_mm);
                fecha_dd_int = Integer.parseInt(fecha_dd);
                fecha_aaaa_int = Integer.parseInt(fecha_aaaa);

                if (fecha_longitud == 10 && fecha_dd_int <= 31 && fecha_dd_int > 0 && barra1boolean && fecha_mm_int <= 12 && fecha_mm_int > 0 && barra1boolean && fecha_aaaa_int <= 2024 && fecha_aaaa_int > 999)   {
                    break;

                }else {
                    System.out.println("Error al introducir tu fecha de nacimiento. Intentalo de nuevo...");
                }
            }catch (StringIndexOutOfBoundsException err) {
                    System.out.println("Error al introducir tu fecha de nacimiento. Intentalo de nuevo...");
                }catch (NumberFormatException err) {
                    System.out.println("Error al introducir tu fecha de nacimiento. Intentalo de nuevo...");
                }
        }
        int suma1 = fecha_dd_int + fecha_mm_int + fecha_aaaa_int;

        System.out.println(fecha_dd_int + "+" + fecha_mm_int + "+" + fecha_aaaa_int + " = " + suma1);

        String suma1String = Integer.toString(suma1);

        String num1 = suma1String.substring(0,1);
        String num2 = suma1String.substring(1,2);
        String num3 = suma1String.substring(2,3);
        String num4 = suma1String.substring(3,4);

        int num1int = Integer.parseInt(num1);
        int num2int = Integer.parseInt(num2);
        int num3int = Integer.parseInt(num3);
        int num4int = Integer.parseInt(num4);

        int suma2 = num1int + num2int + num3int + num4int;

        System.out.println(num1int + "+" + num2int + "+" + num3int + "+" + num4int + " = " + suma2);

        System.out.print("Tu número de la suerte es " + suma2);



    }
}