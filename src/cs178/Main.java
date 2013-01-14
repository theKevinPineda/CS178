/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs178;

/**
 *
 * @author Dothacker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack ms = new MyStack(10);
        Object []x = {0,1,2,3,4,5,6,7,8,9};
        Object []y = {20,21,22,23,24,25,26,27,28,29};
        Pusher pusher = new Pusher(ms,x);
        Pusher drugPusher = new Pusher(ms,y);
        Popper popper = new Popper(ms);
        pusher.start();
        drugPusher.start();
        popper.start();
    }
}
