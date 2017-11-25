package modelo;

public class Candidato extends Persona{
    private int     foto;
    private String  matriculaParteUno;
    private String  matriculaParteDos;
    private Generacion  generacion;
    private Carrera carrera;
    private String  creditos;
    private String  trabajo;
    private Tesis   tesis;
    private Horario horario;
    private boolean cartaCompromiso;
    private boolean cartaExp;
    private String  nombreEntidad;

    public boolean isCartaCompromiso() {
        return cartaCompromiso;
    }
    public void    setCartaCompromiso(boolean cartaCompromiso) {
        this.cartaCompromiso = cartaCompromiso;
    }
    public void    setCartaExp(boolean cartaExp) {
        this.cartaExp = cartaExp;
    }
    public boolean isCartaExp() {
        return cartaExp;
    }
    public void    setHorario(Horario horario) {
        this.horario = horario;
    }
    public Horario getHorario() {
        return horario;
    }
    public void    setFoto(int foto) {
        this.foto = foto;
    }
    public void    setMatriculaParteUno(String matriculaParteUno) {
        this.matriculaParteUno = matriculaParteUno;
    }
    public void    setMatriculaParteDos(String matriculaParteDos) {
        this.matriculaParteDos = matriculaParteDos;
    }
    public void    setGeneracion(Generacion generacion) {
        this.generacion = generacion;
    }
    public void    setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void    setCreditos(String creditos) {
        this.creditos = creditos;
    }
    public void    setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public void    setTesis(Tesis tesis) {
        this.tesis = tesis;
    }
    public int     getFoto() {
        return foto;
    }
    public String  getMatriculaParteUno() {
        return matriculaParteUno;
    }
    public String  getMatriculaParteDos() {
        return matriculaParteDos;
    }
    public Generacion getGeneracion() {
        return generacion;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public String  getCreditos() {
        return creditos;
    }
    public String  getTrabajo() {
        return trabajo;
    }
    public Tesis   getTesis() {
        return tesis;
    }
    public void    setNombreEntidad(String nombreEntidad) {
        this.nombreEntidad = nombreEntidad;
    }
    public String  getNombreEntidad() {
        return nombreEntidad;
    }
}
