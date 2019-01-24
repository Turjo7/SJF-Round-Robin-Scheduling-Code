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
public class Process 
{
    int id;
    int AT;
    int BT;
    Timer t;

    public Process(int id,int AT,int BT,Timer t)
    {
        this.id=id;
        this.AT=AT;
        this.BT=BT;
        this.t=t;
    }
    
    
    public void runprocess()
    {
        for(int runtime1=0;runtime1<BT;runtime1++)
        {
            System.out.println("Running with ID: "+id+" , timer value: "+t.time+" to "+(t.time+1));  
            t.time++;
        }
        System.out.println("Process Complete with ID: "+id+" , timer value: "+t.time);

    }

}