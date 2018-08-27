/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juste
 */
public class ProEgenKode implements Runnable {
    
  BlockingQueue<Integer> Numbers;
  BlockingQueue<Integer> Results;
  boolean run = true;

    ProEgenKode(BlockingQueue<Integer> numbers, BlockingQueue<Integer> results) {
        this.Numbers = numbers;
        this.Results = results;
    }

    @Override
    public void run() {
        while (run) {
            try {
            
             if(Numbers.isEmpty()){
               run = false;  
             }else{
             int a = Numbers.poll(10, TimeUnit.SECONDS);
             int b = Numbers.poll(10, TimeUnit.SECONDS);
             int temp = a * b;

             Results.put(temp);  
             }
             
        
             } catch(Exception ex) {
                Logger.getLogger(ProEgenKode.class.getName()).log(Level.SEVERE, null, ex);
                }

    }
    }
    
}
