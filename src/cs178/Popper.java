/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs178;

/**
 *
 * @author Dothacker
 */
public class Popper extends Thread{
    private MyStack ms;
    
    public Popper(MyStack ms){
        this.ms = ms;
    }
    
    @Override 
    public void run(){
        
        while(ms.isEmpty()==false){
        
            ms.pop();
        
        }
    }
}
