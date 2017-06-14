package CapaDomini.estructures;

public interface IEstructuraEmpresa {

    void add(IEstructuraEmpresa iee);

    String toString(int tabuladors);

    IEstructuraEmpresa cercarInfo(String descripcio);

    String getNom();

    double getSalari();

}
