/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroCalculadora.logica;

import java.util.ArrayList;
import java.util.List;
import simulacroCalculadora.dto.Operacion;

/**
 *
 * @author Robert
 */
public class LogicaOperaciones {

    private static List<Operacion> listaOperaciones = new ArrayList<>();

    public static void addOperacion(Operacion op) {
        listaOperaciones.add(op);
    }

    public static List<Operacion> getListaOperaciones() {
        return listaOperaciones;
    }
}
