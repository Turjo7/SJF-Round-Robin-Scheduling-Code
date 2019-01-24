/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round_Robin;

/**
 *
 * @author turjoasusr505c
 */
public class Process {
    
    int id;
    int AT;
    int BT;
    Timer t;
    int tq=3;
    
    public Process(int id,int AT,int BT,Timer t){
        this.id=id;
        this.AT=AT;
        this.BT=BT;
        this.t=t;
        
    }

   
    
    public void runprocess(){
        if(BT>tq){
            
            for(int i=0;i<tq;i++){
                System.out.println("Process Id: "+id);
                System.out.println("Global Timer: "+ t.time);
                t.time++;
            }
            BT=BT-tq;
            Rr.rq.add(new Process(id,AT,BT,t));
        }
        else{
            if(BT<=tq){
                for(int i=0;i<BT;i++){
                    
                System.out.println("Process Id: "+id);
                System.out.println("Global Timer: "+ t.time);
                t.time++;
                BT=0;
                }
            }
        }
        System.out.println("Process Id : "+id+"Done: "+"Time Left: "+BT);
    }
    
    public int getId(){
        return id;
    }
    
     public int getAt(){
        return AT;
    }
     
     public int getBt(){
        return BT;
    }

   
}
