
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class VentaDao {
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    int r;
    public int RegistrarVenta(Venta v){
        
        
        String sql="INSERT INTO ventas(cliente,vendedor,total) VALUES (?,?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1,v.getCliente());
            ps.setString(2,v.getVendedor());
            ps.setDouble(3,v.getTotal());
            ps.execute();
        
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return r;
    }
}
