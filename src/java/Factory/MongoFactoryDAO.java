/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import dao.MongoVinoDAO;
import dao.MySQLProductorDAO;
import dao.MySQLVinoDAO;
import design.IProductorDAO;
import design.IVinoDAO;

/**
 *
 * @author Angelo
 */
public class MongoFactoryDAO {
    
    static MongoFactoryDAO mongofactorydb;
    
    static{
       mongofactorydb = new MongoFactoryDAO(); 
    }
    
    public static MongoFactoryDAO getInstance(){
        return mongofactorydb;
    }
    
    
    public IVinoDAO getVinoService(){
        return new MySQLVinoDAO();
    }
    
    public IProductorDAO getProductorService(){
        return new MySQLProductorDAO();
    }
    
}
