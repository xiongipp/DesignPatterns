package com.xxh.FlyWeight;

import java.util.HashMap;
import java.util.Hashtable;

public class PieceFactory {
    private HashMap piecepool=new HashMap();
    public Apiece getPiece(String key){
        if(!piecepool.containsKey(key)){
            Apiece p =new OnePiece(key);
            piecepool.put(key,p);
            return  p;
        }
        return  (Apiece) piecepool.get(key);
    }
    public  int GetPieceCount(){
        return  piecepool.size();
    }
}
