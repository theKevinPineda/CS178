/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs178;

/**
 *
 * @author Dothacker
 */
public class Pusher extends Thread {
    private MyStack ms;
    Object []toPush;
    public Pusher(MyStack ms, Object []toPush){
        this.ms=ms;
        this.toPush=toPush;
    }
    
    
    @Override
    public void run(){
        for(int i=0;i<10;i++){
           
            ms.push(toPush[i]);
          
        
        }
    }
}
