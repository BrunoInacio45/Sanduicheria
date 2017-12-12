/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class ConectaMySQL extends ConectaBanco {

    public ConectaMySQL(String usuarioBanco, String senhaBanco) {
        super(usuarioBanco, senhaBanco);
    }

    @Override
    public Connection ConectarAoBanco() throws Exception {
        return DriverManager.getConnection("jdbc:mysql://localhost/public", usuarioBanco, senhaBanco);

    }

}
