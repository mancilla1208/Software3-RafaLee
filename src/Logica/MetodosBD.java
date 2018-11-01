/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class MetodosBD {

    Pool metodoPool = new Pool();

    public void Actualizar(String nombreCompleto, String grado, String idEstudiante) {

        Connection conexion = null;

        try {
            conexion = metodoPool.dataSource.getConnection();
            String sql = "UPDATE rafalee_bd.estudiante SET nombre_completo=?, grado=? WHERE idEstudiante=?";

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombreCompleto);
            ps.setString(2, grado);
            ps.setString(3, idEstudiante);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Datos guardados con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se han podido actualizar los datos");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se han podido actualizar los datos, error en la operación" + "Error:" + e);
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexion" + "Error:" + e);

                }
            }
        }

    }

    public void Eliminar(String id) {
        Connection conexion = null;

        try {

            String sql = "DELETE FROM rafalee_bd.estudiante WHERE idEstudiante=?";
            conexion = metodoPool.dataSource.getConnection();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado de forma exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Se produjo un error al cerrar la conexion");
                }
            }
        }

    }
}
