package CapaDomini;

import CapaDomini.estructures.EstructuraFactory;
import CapaDomini.estructures.IEstructuraEmpresa;

public class Empresa {

    private IEstructuraEmpresa estructuraEmpresa;
    private String nomEmpresa;

    public Empresa(String n) {
        nomEmpresa = n;
        estructuraEmpresa = EstructuraFactory.getInstance().crearDepartament(nomEmpresa);
    }

    public boolean setEstructuraEmpresa(IEstructuraEmpresa pare, IEstructuraEmpresa fill) {
        boolean retorn = false;
        if (pare == null || fill == null) {
            return false;
        }
        if (retorn = pare != fill) {
            pare.add(fill);
        }
        return retorn;
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        return estructuraEmpresa.cercarInfo(descripcio);
    }

    @Override
    public String toString() {
        return estructuraEmpresa.toString(0);
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }
}
