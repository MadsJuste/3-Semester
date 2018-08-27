/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juste
 */
public class ConEgenKode implements Runnable {
    BlockingQueue<Integer> Results;
    boolean run = true;
    ConEgenKode(BlockingQueue<Integer> results) {
       this.Results = results;
    }

    @Override
    public void run() {
         while (run) {
            try {
             
             if(Results.isEmpty()){
               run = false;  
             }else{
                 System.out.println("Result of quary is: " + Results.poll(1, TimeUnit.SECONDS));
             }
             } catch(Exception ex) {
                Logger.getLogger(ProEgenKode.class.getName()).log(Level.SEVERE, null, ex);
                }

    }
    }
    
}
