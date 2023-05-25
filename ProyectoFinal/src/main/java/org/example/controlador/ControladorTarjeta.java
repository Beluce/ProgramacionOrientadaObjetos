package org.example.controlador;

import org.example.modelo.ModeloTablaTarjeta;
import org.example.modelo.TarjetaNvidia;
import org.example.persistencia.TarjetaDAO;
import org.example.vista.VentanaTarjeta;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorTarjeta extends MouseAdapter {
    private VentanaTarjeta view;
    private ModeloTablaTarjeta modelo;


    public ControladorTarjeta(VentanaTarjeta view) {

        this.view = view;
        modelo = new ModeloTablaTarjeta();
        this.view.getTblTarjeta().setModel(modelo);

        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getBtnUpdate().addMouseListener(this);

        this.view.getTblTarjeta().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        ImageIcon icono = new ImageIcon("exito.png");

        if(e.getSource() == this.view.getBtnCargar()){

            modelo.cargarDatos();

            this.view.getTblTarjeta().setModel(modelo);
            this.view.getTblTarjeta().updateUI();
        }

        if (e.getSource() == this.view.getBtnAgregar()){
            TarjetaNvidia tarjeta = new TarjetaNvidia();
            tarjeta.setId(0);
            tarjeta.setUrl(this.view.getTxtFoto().getText());
            tarjeta.setNombre(this.view.getTxtNombre().getText());
            tarjeta.setSerie(this.view.getTxtSerie().getText());
            tarjeta.setFabricante(this.view.getTxtFabricante().getText());
            tarjeta.setPrecio(Double.parseDouble(this.view.getTxtPrecio().getText()));

            if(modelo.agregarTarjeta(tarjeta)){
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE, icono);
                this.view.getTblTarjeta().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Revisa la conexion", "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == this.view.getTblTarjeta()){

            Icon errorURL = new ImageIcon("archivoDanado.png");

            int index = this.view.getTblTarjeta().getSelectedRow();
            TarjetaNvidia temporal = modelo.getTarjetaAtIndex(index);

            try {
                this.view.getImagenTarjeta().setIcon(temporal.getImagen());
                this.view.getImagenTarjeta().setText("");
            }catch (MalformedURLException mue){
                this.view.getImagenTarjeta().setIcon(errorURL);
                JOptionPane.showMessageDialog(view, "La URL dl registro no es correcta, modificala y vuelve a intentarlo.",
                        "ATENCION", JOptionPane.ERROR_MESSAGE);
                System.out.println(e.toString());
            }
        }

        if (e.getSource() == this.view.getBtnDelete()){

            int row = this.view.getTblTarjeta().getSelectedRow();
            String index = String.valueOf(this.modelo.getValueAt(row,0));

            System.out.println(index);

            int respuesta = JOptionPane.showConfirmDialog(view, "Estas seguro de borrar el registro seleccionado?",
                    "Selecciona una opcion", JOptionPane.YES_NO_OPTION);

            if(respuesta == JOptionPane.YES_NO_OPTION){
                    modelo.eliminarDatos(index);
                    JOptionPane.showMessageDialog(view, "El objeto fue borrado exitosamente", "Aviso", JOptionPane.INFORMATION_MESSAGE, icono);
                    this.view.getTblTarjeta().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "El Objeto no fue eliminado", "Error al eliminar",
                        JOptionPane.ERROR_MESSAGE);
                this.view.getTblTarjeta().updateUI();
            }
            this.view.getTblTarjeta().updateUI();
        }

        if (e.getSource() == this.view.getBtnUpdate()){

            int row = this.view.getTblTarjeta().getSelectedRow();
            String index = String.valueOf(this.modelo.getValueAt(row,0));

            System.out.println(index);

            TarjetaNvidia tarjeta = new TarjetaNvidia();

            tarjeta.setUrl(this.view.getTxtFoto().getText());
            tarjeta.setNombre(this.view.getTxtNombre().getText());
            tarjeta.setSerie(this.view.getTxtSerie().getText());
            tarjeta.setFabricante(this.view.getTxtFabricante().getText());
            tarjeta.setPrecio(Double.parseDouble(this.view.getTxtPrecio().getText()));
            tarjeta.setId(Integer.parseInt(index));

            System.out.println(tarjeta);

            if(modelo.updateTarjeta(tarjeta)){
                JOptionPane.showMessageDialog(view, "Se ha modificado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE, icono);
                this.view.getTblTarjeta().updateUI();
            }else {
                JOptionPane.showMessageDialog(view, "No se pudo modificar. Revisa la conexion", "Error al insertar",
                        JOptionPane.ERROR_MESSAGE);
                this.view.getTblTarjeta().updateUI();
            }
        }

        this.view.limpiar();
    }

}
