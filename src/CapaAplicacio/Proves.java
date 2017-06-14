package CapaAplicacio;

import CapaDomini.*;
import CapaDomini.estructures.EstructuraFactory;
import CapaDomini.estructures.IEstructuraEmpresa;

public class Proves {

    public static void main(String[] args) {
        Empresa e = new Empresa("Empresa XX");
        IEstructuraEmpresa dep1 = e.cercarInfo(e.getNomEmpresa());
        IEstructuraEmpresa emp = EstructuraFactory.getInstance().crearEmpleat("Vall.llobera", 100.0, dep1);
        e.setEstructuraEmpresa(dep1, emp);
        IEstructuraEmpresa dep2 = EstructuraFactory.getInstance().crearDepartament("Direcció General");
        e.setEstructuraEmpresa(dep1, dep2);
        emp = EstructuraFactory.getInstance().crearEmpleat("Rollo", 80.0, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        dep2 = EstructuraFactory.getInstance().crearDepartament("Comptabilitat");
        e.setEstructuraEmpresa(dep1, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        emp = EstructuraFactory.getInstance().crearEmpleat("Saura", 70.0, dep2);
        e.setEstructuraEmpresa(dep2, emp);
        dep1 = EstructuraFactory.getInstance().crearDepartament("RRHH");
        e.setEstructuraEmpresa(dep2, dep1);
        emp = EstructuraFactory.getInstance().crearEmpleat("Fernandes", 30.0, dep1);
        e.setEstructuraEmpresa(dep1, emp);
        dep1 = EstructuraFactory.getInstance().crearDepartament("Vendes");
        e.setEstructuraEmpresa(dep2, dep1);
        IEstructuraEmpresa emp1 = EstructuraFactory.getInstance().crearEmpleat("Mallol", 70.0, dep1);
        e.setEstructuraEmpresa(emp1, emp);
        System.out.println(e.toString());
        dep1 = e.cercarInfo("Comptabilitat");
        if (dep1 != null) {
            System.out.println(dep1.toString());
        }
    }
}
