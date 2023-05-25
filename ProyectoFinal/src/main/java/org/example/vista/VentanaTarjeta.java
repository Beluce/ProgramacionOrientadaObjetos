package org.example.vista;

import org.example.modelo.TarjetaNvidia;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class VentanaTarjeta extends JFrame {

    private JLabel lblId;
    private JLabel lblFoto;
    private JLabel lblNombre;
    private JLabel lblSerie;
    private JLabel lblFabricante;
    private JLabel lblPrecio;

    private JLabel imagenTarjeta;

    private JTextField txtId;
    private JTextField txtFoto;
    private JTextField txtNombre;
    private JTextField txtSerie;
    private JTextField txtFabricante;
    private JTextField txtPrecio;

    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnDelete;
    private JButton btnUpdate;

    private JTable tblTarjeta;
    private JScrollPane scrollPane;
    private GridLayout layout;

    private JPanel panel1; //formulario captura Tarjetas
    private JPanel panel2; //tabla para mostrar las Tarjetas
    private JPanel panel3; // Imagen desde URL
    private JPanel panel4; // Eliminar y Actualizar los campos de la tabla

    public VentanaTarjeta(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800);
        layout = new GridLayout(2, 2);
        this.getContentPane().setLayout(layout);

        //panel1

        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(255, 118, 118));

        lblId = new JLabel("Id:");
        lblFoto = new JLabel("Foto:");
        lblNombre = new JLabel("Nombre:");
        lblSerie = new JLabel("Serie:");
        lblFabricante = new JLabel("Fabricante:");
        lblPrecio = new JLabel("Precio:");

        txtId = new JTextField(1);
        txtId.setText("0");
        txtId.setEnabled(false);

        txtFoto = new JTextField(25);
        txtNombre = new JTextField(10);
        txtSerie = new JTextField(15);
        txtFabricante = new JTextField(7);
        txtPrecio = new JTextField(15);
        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);

        panel1.add(lblFoto);
        panel1.add(txtFoto);

        panel1.add(lblNombre);
        panel1.add(txtNombre);

        panel1.add(lblSerie);
        panel1.add(txtSerie);

        panel1.add(lblFabricante);
        panel1.add(txtFabricante);

        panel1.add(lblPrecio);
        panel1.add(txtPrecio);

        panel1.add(btnAgregar);

        //panel2

        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(38, 115, 162));
        btnCargar = new JButton("Cargar");

        panel2.add(btnCargar);
        tblTarjeta = new JTable();

        scrollPane = new JScrollPane(tblTarjeta);
        panel2.add(scrollPane);

        //panel3

        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(192, 133, 255));

        imagenTarjeta = new JLabel("");
        panel3.add(imagenTarjeta);

        //panel4

        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(213, 197, 0));

        btnDelete = new JButton("Borrar");
        btnUpdate = new JButton("Actualizar");

        panel4.add(btnDelete);
        panel4.add(btnUpdate);

        //--------------------------------------------------------------------

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getImagenTarjeta() {
        return imagenTarjeta;
    }

    public void setImagenTarjeta(JLabel imagenTarjeta) {
        this.imagenTarjeta = imagenTarjeta;
    }

    public JTextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(JTextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblSerie() {
        return lblSerie;
    }

    public void setLblSerie(JLabel lblSerie) {
        this.lblSerie = lblSerie;
    }

    public JLabel getLblFabricante() {
        return lblFabricante;
    }

    public void setLblFabricante(JLabel lblFabricante) {
        this.lblFabricante = lblFabricante;
    }

    public JLabel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JLabel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtSerie() {
        return txtSerie;
    }

    public void setTxtSerie(JTextField txtSerie) {
        this.txtSerie = txtSerie;
    }

    public JTextField getTxtFabricante() {
        return txtFabricante;
    }

    public void setTxtFabricante(JTextField txtFabricante) {
        this.txtFabricante = txtFabricante;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTblTarjeta() {
        return tblTarjeta;
    }

    public void setTblTarjeta(JTable tblTarjeta) {
        this.tblTarjeta = tblTarjeta;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public void limpiar(){
        txtFoto.setText("");
        txtNombre.setText("");
        txtSerie.setText("");
        txtFabricante.setText("");
        txtPrecio.setText("");
    }
}
