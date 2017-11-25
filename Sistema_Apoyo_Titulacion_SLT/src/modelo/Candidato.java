package modelo;
public class Candidato extends Persona{
    private int     foto;
    private String  matricula;
    private String generacion;
    private Carrera carrera;
    private String  creditos;
    private Tesis   tesis;
    private Horario horario;
    private boolean cartaCompromiso;
    private boolean cartaExp;
    private String  nombreEntidad;
    public Candidato(String nombre,String apellidoPaterno,
            String apellidoMaterno,String correoElectronico,int telefono,
            int foto, String matricula, String generacion, 
            Carrera carrera, String creditos, Tesis tesis,
            Horario horario, boolean cartaCompromiso,
            boolean cartaExp, String nombreEntidad) {
        super(nombre,apellidoPaterno,apellidoMaterno,correoElectronico,telefono);
        this.foto = foto;
        this.matricula = matricula;
        this.generacion = generacion;
        this.carrera = carrera;
        this.creditos = creditos;
        this.tesis = tesis;
        this.horario = horario;
        this.cartaCompromiso = cartaCompromiso;
        this.cartaExp = cartaExp;
        this.nombreEntidad = nombreEntidad;
    }
    public void    setMatricula(String matricula) {
        this.matricula = matricula;
    }
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
    public void    setGeneracion(String generacion) {
        this.generacion = generacion;
    }
    public void    setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public void    setCreditos(String creditos) {
        this.creditos = creditos;
    }
    public void    setTesis(Tesis tesis) {
        this.tesis = tesis;
    }
    public String  getMatricula() {
        return matricula;
    }
    public int     getFoto() {
        return foto;
    }
    public String  getGeneracion() {
        return generacion;
    }
    public Carrera getCarrera() {
        return carrera;
    }
    public String  getCreditos() {
        return creditos;
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

