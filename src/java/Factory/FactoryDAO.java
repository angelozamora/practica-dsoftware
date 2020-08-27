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
public class FactoryDAO {
    
    static FactoryDAO factoryDAO;
    
    static{
        factoryDAO = new FactoryDAO();
    }
    
    public static FactoryDAO getInstance(){
        return factoryDAO;
    }
}
