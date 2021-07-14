package dominio;

/**
 *
 * @author Leonidas Rosales
 */
public class Empleado {

    private String nombres;
    private Fecha fechaNac;
    private Fecha fechaIng;


    public Empleado(String nombres, Fecha fechaN, Fecha fechaI) {
        this.nombres = nombres;
        this.fechaNac = fechaN;
        this.fechaIng = fechaI;
    }

    public String getNombres() {
        return nombres;
    }

    public Fecha getFechaN() {
        return fechaNac;
    }

    public Fecha getFechaI() {
        return fechaIng;
    }

  
    
    
 
    public String calcularEdad(int año, int mes, int dia) {
        int años, meses, dias;
        años = año - fechaNac.getAño();
        
        meses = mes - fechaIng.getMes();
        if (meses <= 0) {
            meses = meses + 12;
        }

        dias = dia - fechaIng.getDia();
        if (dias <= 0) {
            dias = dias + 30;
        }
        

        return "Le edad del empleado es: " + años +  " años "  + meses +  "meses  "  + dias + "dias";
    }

    public String calcularTiempo(int año, int mes, int dia) {
        int añop, mesm, diay;
        int aux = 12;
        añop = año - fechaIng.getAño();

        mesm = mes - fechaIng.getMes();
        if (mesm <= 0) {
            mesm = mesm + 12;
        }

        diay = dia - fechaIng.getDia();
        if (diay <= 0) {
            diay = diay + 30;
        }

        return "El empleado lleva en la empresa: " + añop + " años, " + mesm + " meses y " + diay + " días.";
    }

    

    @Override
    public String toString() {
        return nombres + "\nFecha Nacimiento\n" + fechaNac + "\nFecha Ingreso\n" + fechaIng;
    }
}
