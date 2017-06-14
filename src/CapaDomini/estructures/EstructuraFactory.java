package CapaDomini.estructures;

/**
 * Created by mcmacker4 on 6/14/17.
 */
public class EstructuraFactory {

    private static final EstructuraFactory INSTANCE;

    static {
        INSTANCE = new EstructuraFactory();
    }

    public IEstructuraEmpresa crearEmpleat(String filiacio, double salari, IEstructuraEmpresa dep) {
        return new Empleat(filiacio, salari, dep);
    }

    public IEstructuraEmpresa crearDepartament(String nom) {
        return new Departament(nom);
    }

    public static EstructuraFactory getInstance() {
        return INSTANCE;
    }

}
