/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Juste
 */
public class ProConEgenKode {
    
    public static void main(String[] args){
    Random r = new Random();    
    ArrayBlockingQueue<Integer> numbers = new ArrayBlockingQueue(100);
    ArrayBlockingQueue<Integer> results = new ArrayBlockingQueue(10);
    ExecutorService es = Executors.newCachedThreadPool();
    
    for(int i =0; i<100; i++){
        int p = r.nextInt(100)+1;
        numbers.add(p);
    }

    es.execute(new ProEgenKode(numbers, results)); 
    es.execute(new ProEgenKode(numbers, results)); 
    es.execute(new ProEgenKode(numbers, results)); 
    es.execute(new ProEgenKode(numbers, results)); 
    es.execute(new ConEgenKode (results)); 
    es.shutdown();
    }
}
