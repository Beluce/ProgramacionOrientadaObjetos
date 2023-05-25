package org.example.persistencia;

import org.example.modelo.TarjetaNvidia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TarjetaDAO implements InterfazDAO{
    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO tarjetasNvidia (url,nombre,serie,fabricante,precio) VALUES(?,?,?,?,?)";
        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("tarjetasNvidia.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((TarjetaNvidia)obj).getUrl());
        pstm.setString(2,((TarjetaNvidia)obj).getNombre());
        pstm.setString(3,((TarjetaNvidia)obj).getSerie());
        pstm.setString(4,((TarjetaNvidia)obj).getFabricante());
        pstm.setDouble(5,((TarjetaNvidia)obj).getPrecio());
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE tarjetasNvidia SET url = ?, nombre = ?, serie = ?, fabricante = ?, precio = ? WHERE id = ? ; ";
        int rowCount = 0;

        PreparedStatement pstm = ConexionSingleton.getInstance("tarjetasNvidia.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((TarjetaNvidia)obj).getUrl());
        pstm.setString(2,((TarjetaNvidia)obj).getNombre());
        pstm.setString(3,((TarjetaNvidia)obj).getSerie());
        pstm.setString(4,((TarjetaNvidia)obj).getFabricante());
        pstm.setDouble(5,((TarjetaNvidia)obj).getPrecio());
        pstm.setInt(6,((TarjetaNvidia)obj).getId());

        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM tarjetasNvidia WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("tarjetasNvidia.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM tarjetasNvidia";
        ArrayList<TarjetaNvidia> resultado = new ArrayList<>();

        Statement stm = ConexionSingleton.getInstance("tarjetasNvidia.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);

        while(rst.next()){
            resultado.add(new TarjetaNvidia(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getDouble(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM tarjetasNvidia WHERE id = ?;";
        TarjetaNvidia tarjeta = null;


        PreparedStatement pstm = ConexionSingleton.getInstance("tarjetasNvidia.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next()){
            tarjeta = new TarjetaNvidia(rst.getInt(1),rst.getString(2),rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getDouble(6));
            return tarjeta;
        }
        return null;
    }
}
