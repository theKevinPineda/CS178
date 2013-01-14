/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs178;

/**
 *
 * @author Dothacker
 */
public class MyStack {
private Object []stack;
private int max,last;     
    public MyStack(int max){
        this.max=max;
        this.last=0;
        stack= new Object[max];
    }
    
    public synchronized void pop(){
        if(isEmpty()==false){
            --last;
            display("Size: ",last
                    ," Popped: ",stack[last]
                    ," Present State of Stack: ");     
        }
    }
    public synchronized void push(Object value){
        if(last<max-1){
            stack[last++]=value;
            display("Size: ",last
                    ," Pushed: ",value
                    ," Present State of Stack: ");
        }
        
    }
    public boolean isEmpty(){
    return (last==0)?true:false;
    }
    
    private void display(Object... params){
        for(Object temp : params)
            System.out.print(temp);
        displayStack();
        System.out.println();
    }
    
    private void displayStack(){
        try{
        for(int x=last-1;x>-1;x--)
            System.out.print(stack[x]+"|");
         }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
        }
    }
    
}
