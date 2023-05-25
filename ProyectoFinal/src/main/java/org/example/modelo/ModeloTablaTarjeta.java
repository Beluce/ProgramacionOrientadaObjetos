package org.example.modelo;

import org.example.persistencia.TarjetaDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaTarjeta implements TableModel {

    private ArrayList<TarjetaNvidia> datos;
    public static final int COLUMNS = 6;
    private TarjetaDAO tdao;

    public ModeloTablaTarjeta(){
        tdao = new TarjetaDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaTarjeta(ArrayList<TarjetaNvidia> datos, TarjetaDAO tdao) {
        this.datos = datos;
        this.tdao = tdao;
    }


    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Foto";
            case 2:
                return "Nombre";
            case 3:
                return "Serie";
            case 4:
                return "Fabricante";
            case 5:
                return "Precio";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Double.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TarjetaNvidia tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getUrl();
            case 2:
                return tmp.getNombre();
            case 3:
                return tmp.getSerie();
            case 4:
                return tmp.getFabricante();
            case 5:
                return tmp.getPrecio();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).getId();
                break;
            case 1:
                datos.get(rowIndex).setUrl((String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setNombre((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setSerie((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setFabricante((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setPrecio((Double) aValue);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean eliminarDatos(String index){
        boolean resultado = false;

        try {
            if (tdao.delete(index)){
                System.out.println("Eliminado exitosamente");
                resultado = true;
            }else {
                System.out.println("Error al eliminar");
                System.out.println(index);
                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }

    public void cargarDatos(){

        try {

            datos = tdao.obtenerTodo();

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarTarjeta(TarjetaNvidia tarjeta){
        boolean resultado = false;

        try {

            if(tdao.insertar(tarjeta)){
                datos.add(tarjeta);
                resultado = true;
            }else {
                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }

    public TarjetaNvidia getTarjetaAtIndex(int idx){
        return datos.get(idx);
    }

    public boolean updateTarjeta(TarjetaNvidia tarjeta) {
        boolean resultado = false;

        try {

            if (tdao.update(tarjeta)) {
                System.out.println("Se modifico correctamente");
                resultado = true;
            } else {
                resultado = false;
                System.out.println("No pudo ser modificado");
            }

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }

        return resultado;
    }
}


