/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class MetodosBDIT {
    
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
//    @Test
//    public void testActualizar() {
//        
//        System.out.println("Actualizar");
//        String nombreCompleto = "Andres Oliver";
//        String grado = "3";
//        String idEstudiante = "56";
//        MetodosBD instance = new MetodosBD();
//        String res="";
//        instance.Actualizar(nombreCompleto, grado, idEstudiante);
//        // TODO review the generated test code and remove the default call to fail.
//      
//        
//            fail("The test case is a prototype.");
//        
//    }
//
//    /**
//     * Test of Eliminar method, of class MetodosBD.
//     */
//    @Test
//    public void testEliminar() {
//        System.out.println("Eliminar");
//        String id = "";
//        MetodosBD instance = new MetodosBD();
//        instance.Eliminar(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of agregarEstudiante method, of class MetodosBD.
//     */
//    @Test
//    public void testAgregarEstudiante() {
//        System.out.println("agregarEstudiante");
//        MetodosBD instance = new MetodosBD();
//        instance.agregarEstudiante();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of eliminarEstudiante method, of class MetodosBD.
//     */
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
    @Test
    public void testNombreDocente() {
        System.out.println("nombreDocente");
        MetodosBD instance = new MetodosBD();
        String expResult = "Andres Otalvaro";
        String result = instance.nombreDocente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        
            fail("The test case is a prototype.");
        
    }

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
//    
}
