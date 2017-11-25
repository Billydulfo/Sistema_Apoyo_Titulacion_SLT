
package modelo;

public class Tesis {
    private String Tema;
    private Asesor director;
    
    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }

    public Asesor getDirector() {
        return director;
    }

    public void setDirector(Asesor director) {
        this.director = director;
    }
    @Override
    public String toString() {
        return "Carrera{"+"tema="+Tema+ "director=" + director+'}';
    }
}
