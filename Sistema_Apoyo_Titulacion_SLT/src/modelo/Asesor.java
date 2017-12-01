package modelo;
public class Asesor extends Persona{
    
    private String cubiculo;
    private mHorario horarioAsesorias;

    public Asesor() {
        super();
        this.cubiculo = null;
        this.horarioAsesorias = null;
    }
    
    public mHorario getHorarioAsesorias() {
        return horarioAsesorias;
    }
    public void    setHorarioAsesorias(mHorario horarioAsesorias) {
        this.horarioAsesorias = horarioAsesorias;
    }
    public String  getCubiculo() {
        return cubiculo;
    }
    public void    setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }
}
