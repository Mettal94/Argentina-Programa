package agenda;


public class Contacto implements Comparable<Contacto> {

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

    @Override
    public int compareTo(Contacto t) {
        int comparado = this.nombre.compareToIgnoreCase(t.nombre);
        if(comparado == 0){
            comparado = this.apellido.compareToIgnoreCase(t.apellido);
        }
        return comparado;
    }

   
}
