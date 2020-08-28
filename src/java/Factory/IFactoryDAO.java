/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import design.IAccesoFactory;

/**
 *
 * @author Angelo
 */
public class IFactoryDAO {
    
    static FactoryDB factorydb;
    
    static{
       factorydb = new FactoryDB(); 
    }
    
    public static FactoryDB getInstance(){
        return factorydb;
    }
    
    public static IAccesoFactory getAccesoFactory(String tipo){
        switch(tipo){
            case "MySQL":
                return MySQLFactoryDAO.getInstance();
            case "Mongo":
                return MongoFactoryDAO.getInstance();
            default:
                throw new RuntimeException("Unsupported db type");
        }
        
    }
    
    
    public static MongoFactoryDAO getMongoService(){
        return MongoFactoryDAO.getInstance();
    }
    
    public static MySQLFactoryDAO getMySQLService(){
        return MySQLFactoryDAO.getInstance();
    }
}
