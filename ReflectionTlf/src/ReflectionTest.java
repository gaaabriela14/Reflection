/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * @author GABRIELA
 */
public class ReflectionTest {

    public static Paquete pack = new Paquete();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final File carpeta = new File("C:\\Users\\GABRIELA\\Documents\\NetBeansProjects\\ReflectionTlf\\src");

        pack.setNombre(carpeta.getName());
        listarPorCarpeta(carpeta, pack);

        Vista vist = new Vista(pack);
        vist.setVisible(true);

    }

    public static void listarPorCarpeta(final File car, Paquete paq) {

        try {

            for (final File fiEntrada : car.listFiles()) {

                if (fiEntrada.isDirectory()) {
                    Paquete p = new Paquete();
                    p.setNombre(fiEntrada.getName());
                    listarPorCarpeta(fiEntrada, p);
                    paq.getListaPaquetes().add(p);
                } else {
                    String nombre = fiEntrada.getName();
                    String[] parts = nombre.split("\\.");
                    Class clazz;
                    if (paq.getNombre().equals("src")) {
                        clazz = Class.forName(parts[0]);
                    } else {
                        clazz = Class.forName(paq.getNombre() + "." + parts[0]);
                    }
                    Clase cla = new Clase();
                    cla.setNomClass(parts[0]);
                    Method todasLosMetodos[] = clazz.getDeclaredMethods();

                    for (int i = 0; i < todasLosMetodos.length; i++) {
                        cla.getMetodos().add(todasLosMetodos[i].getName());
                    }

                    Field todasLasVariables[] = clazz.getDeclaredFields();

                    for (int i = 0; i < todasLasVariables.length; i++) {
                        cla.getAtributos().add(todasLasVariables[i].getName());
                    }
                    paq.getListaClase().add(cla);
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
