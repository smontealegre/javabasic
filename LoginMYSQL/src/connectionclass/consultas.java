/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionclass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián M
 */
public class consultas {
 


    public void saveUser(String user, String password){
        consultas db = new consultas();
        String sql = "insert into usuarios(user, password) values ('"+ user +"', '"+ password +"');";
        Statement st;
        Connection connection = db.connection();
        try
        {
            st = connection.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch(java.sql.SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void consultUser(String user, String password)
    {
        // TODO add your handling code here:
        consultas db = new consultas();
        // Se inicializa a null
        String correctUser = null;
        String correctPass = null;
    try {

        Connection cn = db.conexion();
        PreparedStatement pst = cn.prepareStatement("SELECT name, clave FROM users");
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            correctUser = rs.getString(1);
            correctPass = rs.getString(2);
        }

        if (user.equals(correctUser) && password.equals(correctPass)) {
            JOptionPane.showMessageDialog(null, "¡Ha iniciado sesión satisfactoriamente!" + user);
        } else if (!user.equals(correctUser) || password.equals(correctPass)) {

            JOptionPane.showMessageDialog(null, "Credenciales incorrectas, verifique nuevamente");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
    }
    }

    private Connection conexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Connection connection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}



    

