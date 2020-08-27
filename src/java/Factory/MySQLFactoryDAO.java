/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import dao.MySQLProductorDAO;
import dao.MySQLVinoDAO;
import design.IProductorDAO;
import design.IVinoDAO;

/**
 *
 * @author Angelo
 */
public class MySQLFactoryDAO {
    
    static MySQLFactoryDAO mysqlfactorydb;
    
    static{
       mysqlfactorydb = new MySQLFactoryDAO(); 
    }
    
    public static MySQLFactoryDAO getInstance(){
        return mysqlfactorydb;
    }
    
    
    public IVinoDAO getVinoService(){
        return new MySQLVinoDAO();
    }
    
    public IProductorDAO getProductorService(){
        return new MySQLProductorDAO();
    }
    
}
