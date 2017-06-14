package CapaDomini.estructures;

class Empleat implements IEstructuraEmpresa {

    private double salari;
    private Departament departament;
    private String filiacio;

    public Empleat(String filiacio, double salari, IEstructuraEmpresa dep) {
        this.filiacio = filiacio;
        this.salari = salari;
        //Pot ser que dep no sigui de tipus Departament, saltara un error si es passa un Empleat com argument.
        departament = (Departament) dep;
    }

    public String getNom() {
        return filiacio;
    }

    @Override
    public double getSalari() {
        return salari;
    }

    public void add(IEstructuraEmpresa iee) {
    }

    public String toString(int t) {
        return this.toString() + ".\n";
    }

    @Override
    public String toString() {
        return "Empleat: " + filiacio + ", salari " + salari;
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        if (descripcio.equals(filiacio)) {
            return this;
        } else {
            return null;
        }
    }
}
