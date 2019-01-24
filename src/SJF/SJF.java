/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SJF;

/**
 *
 * @author turjoasusr505c
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class SJF 
{
	static PriorityQueue<Process> pq = new PriorityQueue<Process>(10,new Comparator<Process>()
    {
		public int compare(Process p1,Process p2)
	    {
			return p1.AT-p2.AT;
		}

    });
	
	static PriorityQueue<Process> rq = new PriorityQueue<Process>(10,new Comparator<Process>()
	{
		public int compare(Process p1,Process p2)
		{
			return p1.BT-p2.BT;
		}
		
	});
	
	static Timer t = new Timer(0);
	
	public static void main(String[] args) 
	{
	Process A = new Process(1,1,5,t);
        Process B = new Process(2,2,2,t);
        Process C = new Process(3,3,1,t);
        Process D = new Process(4,5,3,t);
        Process E = new Process(5,20,2,t);
        
        pq.add(A);
        pq.add(B);
        pq.add(C);
        pq.add(D);
        pq.add(E);
        System.out.println("All Processes are added in PQ , timer starts at 0");
        
        while(true)
        {
            while(!pq.isEmpty() && pq.element().AT <= t.time)
            {
                System.out.println("Process added at: "+pq.element().AT+" , timer: "+t.time);
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