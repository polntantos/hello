/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author HOME
 */
public class message {

    private String message;
    
    /**
     *
     * @param message given in main class
     */
    public message(String message) {
    
        this.message=message;
    
    }
    public message(){
    }

    public void printMessege(){
        System.out.println(message);
    }
}
