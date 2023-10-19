
package Estudiante;

public class cls_registro {
    private String str_id; 
    private String str_nombre;
    private int int_edad;
    private String str_contacto;
    private String str_institucion;

    public cls_registro(){
        this.str_contacto = "";
        this.str_id = "";
        this.int_edad = 0;
        this.str_nombre = "";
        this.str_institucion = "";
    }

    public String getStr_id() {
        return str_id;
    }

    public void setStr_id(String str_id) {
        this.str_id = str_id;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public int getInt_edad() {
        return int_edad;
    }

    public void setInt_edad(int int_edad) {
        this.int_edad = int_edad;
    }

    public String getStr_contacto() {
        return str_contacto;
    }

    public void setStr_contacto(String str_contacto) {
        this.str_contacto = str_contacto;
    }

    public String getStr_institucion() {
        return str_institucion;
    }

    public void setStr_institucion(String str_institucion) {
        this.str_institucion = str_institucion;
    }
}
