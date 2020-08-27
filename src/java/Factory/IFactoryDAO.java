/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Angelo
 */
public class IFactoryDAO {
    
    static FactoryDB factorydb;
    
    static{
       factorydb = new FactoryDB(); 
    }
    
    public FactoryDB getInstance(){
        return factorydb;
    }
    
    
    public static MongoFactoryDAO getMongoService(){
        return MongoFactoryDAO.getInstance();
    }
    
    public static MySQLFactoryDAO getMySQLService(){
        return MySQLFactoryDAO.getInstance();
    }
}
