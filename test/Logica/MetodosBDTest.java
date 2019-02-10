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
 * @author FamiliaMO
 */
public class MetodosBDTest {
    
    public MetodosBDTest() {
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
        String nombreCompleto = "Maria tres";
        String grado = "4";
        String idEstudiante = "";
        MetodosBD instance = new MetodosBD();
        instance.Actualizar(nombreCompleto, grado, idEstudiante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class MetodosBD.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String id = "";
        MetodosBD instance = new MetodosBD();
        instance.Eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar_ingreso method, of class MetodosBD.
     */
    @Test
    public void testValidar_ingreso() {
        System.out.println("validar_ingreso");
        MetodosBD instance = new MetodosBD();
        int expResult = 0;
        int result = instance.validar_ingreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nombreDocente method, of class MetodosBD.
     */
    @Test
    public void testNombreDocente() {
        System.out.println("nombreDocente");
        MetodosBD instance = new MetodosBD();
        String expResult = "";
        String result = instance.nombreDocente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cargarActividades method, of class MetodosBD.
     */
    @Test
    public void testCargarActividades() {
        System.out.println("cargarActividades");
        MetodosBD instance = new MetodosBD();
        instance.cargarActividades();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
