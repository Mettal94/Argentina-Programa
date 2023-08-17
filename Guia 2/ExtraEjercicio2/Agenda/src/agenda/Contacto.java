package agenda;

import java.util.Comparator;

public class Contacto {

    private String nombre;
    private String apellido;
    private String email;
    private int tel;

    public Contacto(String nombre, String apellido, String email, int tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public static class PorNombre implements Comparator<Contacto> {

        @Override
        public int compare(Contacto t1, Contacto t2) {
            int orden = t1.getNombre().compareTo(t2.getNombre());
            if (orden == 0) {
                orden = t1.getApellido().compareTo(t2.getApellido());
            }
            return orden;
        }
    }
}
