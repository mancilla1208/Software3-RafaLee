/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import GUI.Estudiante;
import GUI.GestionarEstudiante;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author FamiliaMO
 */
public class MetodosBDIT {

    MetodosBD metodosBD = new MetodosBD();
    ConexionMySql con = new ConexionMySql();
    Connection cn = con.Conectar();
    GestionarEstudiante gestion = new GestionarEstudiante();

    public MetodosBDIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of Actualizar method, of class MetodosBD.
     */
    @Test
    public void testActualizar() {
        System.out.println("Actualizar");
        String nombreCompleto = "Maria Victoria ";
        String grado = "2";
        String idEstudiante = "50";
        MetodosBD instance = new MetodosBD();

        Connection conexion = null;
        try {
            conexion = con.Conectar();
            String SQL_actualizar = "UPDATE rafalee_bd.estudiante SET nombre_completo=?, grado=? WHERE idEstudiante=?";

            PreparedStatement ps = conexion.prepareStatement(SQL_actualizar);
            JOptionPane.showMessageDialog(null, "estudiante modificado");

            

        } catch (SQLException e) {

        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "", JOptionPane.ERROR_MESSAGE);
                    fail("The test case is a prototype.");
                }
            }

        }

    }

    /**
     * Test of Eliminar method, of class MetodosBD.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "50";
        MetodosBD instance = new MetodosBD();
       
        PreparedStatement ps = null;
        try {
            String sql = "DELETE FROM rafalee_bd.estudiante WHERE idEstudiante=?";
            
            JOptionPane.showMessageDialog(null, "Estuduante eliminado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
            fail("The test case is a prototype.");
        } 
        
    }
    /**
     * Test of agregarEstudiante method, of class MetodosBD.
     */
    @Test
    public void testAgregarEstudiante() {
        System.out.println("agregarEstudiante");
        String nombre = "Felipe Mancilla";
        String grado = "5";
        PreparedStatement ps;
        try {
            ps = cn.prepareStatement("INSERT INTO rafalee_bd.estudiante(nombre_completo,grado) VALUES (?,?)");
            ps.setString(1, nombre);
            ps.setString(2, grado);
            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Estudiante registrado");
                try {
                    String valor = nombre;
                    PreparedStatement psk = cn.prepareStatement("DELETE FROM rafalee_bd.estudiante WHERE nombre_completo='" + valor + "'");
                    psk.executeUpdate();
                } catch (Exception e) {
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar estudiante");
            }

            cn.close();

        } catch (SQLException ex) {
            Logger.getLogger(MetodosBDIT.class.getName()).log(Level.SEVERE, null, ex);
            fail("The test case is a prototype.");

        }
    }
    /**
     * Test of eliminarEstudiante method, of class MetodosBD.
     */
//    @Test
//    public void testEliminarEstudiante() {
//        System.out.println("eliminarEstudiante");
//        MetodosBD instance = new MetodosBD();
//        instance.eliminarEstudiante();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of validar_ingreso method, of class MetodosBD.
//     */
//    @Test
//    public void testValidar_ingreso() {
//        System.out.println("validar_ingreso");
//        MetodosBD instance = new MetodosBD();
//        int expResult = 0;
//        int result = instance.validar_ingreso();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of nombreDocente method, of class MetodosBD.
//     */
//    @Test
//    public void testNombreDocente() {
//        System.out.println("nombreDocente");
//        MetodosBD instance = new MetodosBD();
//        String expResult = "";
//        String result = instance.nombreDocente();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cargarActividades method, of class MetodosBD.
//     */
//    @Test
//    public void testCargarActividades() {
//        System.out.println("cargarActividades");
//        MetodosBD instance = new MetodosBD();
//        instance.cargarActividades();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerIdDocente method, of class MetodosBD.
//     */
//    @Test
//    public void testObtenerIdDocente() {
//        System.out.println("obtenerIdDocente");
//        MetodosBD instance = new MetodosBD();
//        instance.obtenerIdDocente();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of crearActividad method, of class MetodosBD.
//     */
//    @Test
//    public void testCrearActividad() {
//        System.out.println("crearActividad");
//        MetodosBD instance = new MetodosBD();
//        instance.crearActividad();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerIdActividad method, of class MetodosBD.
//     */
//    @Test
//    public void testObtenerIdActividad() {
//        System.out.println("obtenerIdActividad");
//        MetodosBD instance = new MetodosBD();
//        instance.obtenerIdActividad();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of guardarPregunta method, of class MetodosBD.
//     */
//    @Test
//    public void testGuardarPregunta() {
//        System.out.println("guardarPregunta");
//        MetodosBD instance = new MetodosBD();
//        instance.guardarPregunta();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerGradoEstudiante method, of class MetodosBD.
//     */
//    @Test
//    public void testObtenerGradoEstudiante() {
//        System.out.println("obtenerGradoEstudiante");
//        MetodosBD instance = new MetodosBD();
//        String expResult = "";
//        String result = instance.obtenerGradoEstudiante();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cargarActividadesEstudiante method, of class MetodosBD.
//     */
//    @Test
//    public void testCargarActividadesEstudiante() {
//        System.out.println("cargarActividadesEstudiante");
//        MetodosBD instance = new MetodosBD();
//        instance.cargarActividadesEstudiante();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of cargarListaEstudiantes method, of class MetodosBD.
//     */
//    @Test
//    public void testCargarListaEstudiantes() {
//        System.out.println("cargarListaEstudiantes");
//        MetodosBD instance = new MetodosBD();
//        instance.cargarListaEstudiantes();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listaEstudiantesGestionDoce method, of class MetodosBD.
//     */
//    @Test
//    public void testListaEstudiantesGestionDoce() {
//        System.out.println("listaEstudiantesGestionDoce");
//        MetodosBD instance = new MetodosBD();
//        instance.listaEstudiantesGestionDoce();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
