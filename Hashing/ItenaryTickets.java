package Hashing;

import java.util.*;

public class ItenaryTickets {
    public static String revmp(HashMap<String,  String > m p) {
        Has hMap<String , String>mp=ne w HashMap<>();
        for(String key:mp.keySet() ){
            revmp.put(mp.get(key),key);
        }    
        for(St ring key:mp.keySe t()){
            if(!revmp.get(key)){
                return key;
            }
        }
        return null;
    }

    public static void  main(String args[]){
        HashMap<String,String>mp=new HashMap<>();
        mp.put("Chennai" ,"Bangalore");
        mp.put("Bomba y","Delhi");
        mp.put("Goa","C hennai");
        mp.put("Delh i ","Goa");
        Str ing start=g e tStart(mp); 
        for(String key:mp.keySet( ) ){
            Syste m .out.print("->"+mp.get(start));
            start=mp.get(start);
        }
     

    
}
