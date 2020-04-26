/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import magnecom.Db;

/**
 *
 * @author mena4
 */
public class SqlUsuarios extends Db{
    
  public int existeRFC(String rfc) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Db.connect();

        String sql = "SELECT count(id) FROM user WHERE rfc = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rfc);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }  
 
   public int existeEmail(String email) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = Db.connect();

        String sql = "SELECT count(id) FROM user WHERE email = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    } 
    
    
    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }
    
  public boolean esRFC(String RFC) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^(([ÑA-Z|ña-z|&]{3}|[A-Z|a-z]{4})\\d{2}((0[1-9]|1[012])(0[1-9]|1\\d|2[0-8])|(0[13456789]|1[012])(29|30)|(0[13578]|1[02])31)(\\w{2})([A|a|0-9]{1}))$|^(([ÑA-Z|ña-z|&]{3}|[A-Z|a-z]{4})([02468][048]|[13579][26])0229)(\\w{2})([A|a|0-9]{1})$");

        Matcher mather = pattern.matcher(RFC);

        return mather.find();

    }  
  public boolean esTelefono(String tel) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^(\\()?\\d{3}(\\))?(|\\s)?\\d{3}(|\\s)\\d{4}$");

        Matcher mather = pattern.matcher(tel);

        return mather.find();

    }  
    
}
