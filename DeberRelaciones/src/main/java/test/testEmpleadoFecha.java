package test;
import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *
 * @author Leonidas Rosales
 */
public class testEmpleadoFecha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calendar fecha = new GregorianCalendar();
       
        int añoa, mesa, diaa;

        añoa = fecha.get(Calendar.YEAR);
        mesa = fecha.get(Calendar.MONTH) + 1;
        diaa = fecha.get(Calendar.DAY_OF_MONTH);

        System.out.println("Fecha Actual: " + diaa + "/" + mesa + "/" + añoa);

        String nombre;
        int  dian, mesn, añon, diai, mesi, añoi;
       
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la fecha de nacimiento empleado");
        
        System.out.println("Año: ");
        añon = entrada.nextInt();
        
        System.out.println("Mes: ");
        mesn = entrada.nextInt();

        System.out.println("Dia: ");
        dian = entrada.nextInt();

     

     

        Fecha fechan = new Fecha(dian, mesn, añon);

        System.out.println("Ingrese la fecha de ingreso a la empresa del empleado  aa/mm/dd");
                System.out.println("Año: ");
        añoi = entrada.nextInt();

        System.out.println("Mes: ");
        mesi = entrada.nextInt();
        
        System.out.println("Dia: ");
        diai = entrada.nextInt();


        Fecha fechai = new Fecha(diai, mesi, añoi);
        
         Empleado e1 = new Empleado(nombre, fechan, fechai);
        
        entrada.nextLine();

        System.out.println(e1);

        System.out.println(e1.calcularEdad(añoa, mesa, diaa));

        System.out.println(e1.calcularTiempo(añoa, mesa, diaa));

      

    }
}
