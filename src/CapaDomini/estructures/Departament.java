package CapaDomini.estructures;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Departament implements IEstructuraEmpresa {

    private static Set<String> noms = new TreeSet<>();

    private List<IEstructuraEmpresa> jerarquiaDepartamental;
    private String nomDepartament;

    public Departament(String nomDep) {
        if(!noms.add(nomDep))
            throw new IllegalArgumentException("Ja existeix un departament amb aquest nom.");
        jerarquiaDepartamental = new ArrayList<>();
        nomDepartament = nomDep;
    }

    public String getNom() {
        return nomDepartament;
    }

    @Override
    public double getSalari() {
        return jerarquiaDepartamental.stream()
                .mapToDouble(IEstructuraEmpresa::getSalari).sum();
    }

    public void add(IEstructuraEmpresa ee) {
        if(cercarInfo(ee.getNom()) == null)
            jerarquiaDepartamental.add(ee);
    }

    public String toString(int tabs) {
        String retorn = "Departament: " + nomDepartament + "\n";
        tabs++;
        for (IEstructuraEmpresa iee : jerarquiaDepartamental) {
            for (int i = 0; i < tabs; i++) {
                retorn += "\t";
            }
            retorn += iee.toString(tabs);
        }
        return retorn;
    }

    @Override
    public String toString() {
        return this.toString(0);
    }

    public IEstructuraEmpresa cercarInfo(String descripcio) {
        if (descripcio.equals(nomDepartament)) {
            return this;
        } else {
            for (IEstructuraEmpresa iee : jerarquiaDepartamental) {
                IEstructuraEmpresa resultat = iee.cercarInfo(descripcio);
                if (resultat != null) {
                    return resultat;
                }
            }//final for
            return null;
        }//final else
    }
}
