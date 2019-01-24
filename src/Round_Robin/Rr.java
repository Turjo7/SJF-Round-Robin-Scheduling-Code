/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round_Robin;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author turjoasusr505c
 */
public class Rr {
    
    static PriorityQueue<Process> pq = new PriorityQueue<Process>(10,new Comparator<Process>(){
        @Override
        public int compare(Process p1, Process p2) {
             //To change body of generated methods, choose Tools | Templates.
             return (int) (p1.getAt()-p2.getAt());
        }
        
    });
    
    static PriorityQueue<Process> rq = new PriorityQueue<Process>(10,new Comparator<Process>(){
        @Override
        public int compare(Process p1, Process p2) {
             //To change body of generated methods, choose Tools | Templates.
             return (int) (p1.getAt()-p2.getAt());
        }
        
    });
    
    static Timer t = new Timer(0);
    
    
    public static void main(String[] args){
        Process A = new Process(1,1,3,t);
        Process B = new Process(2,2,5,t);
        Process C = new Process(3,8,2,t);
        Process D = new Process(4,5,3,t);
        Process E = new Process(5,20,2,t);
        
        
        pq.add(A);
        pq.add(B);
        pq.add(C);
        pq.add(D);
        pq.add(E);
        
        
        while(true){
            while(!pq.isEmpty() && pq.element().AT <= t.time)
            {
                System.out.println("Process added at: "+pq.element().getAt()+" , timer: "+t.time);
                rq.add(pq.poll());
            }
            if(!rq.isEmpty())
            {
            	
            	Process running  = rq.poll();
                running.runprocess();
            	
            }
            else
            {
            	t.time++;
            	
            }
            
        }
    }
    
    
    
}
