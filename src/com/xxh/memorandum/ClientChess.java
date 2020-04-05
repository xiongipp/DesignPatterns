package com.xxh.memorandum;

import java.util.ArrayList;

public class ClientChess {
    private static int index=0;//记录的棋子的位置
    private static CaretakerChess caretakerChess=new CaretakerChess();

    public static void play(Originator chess){
        System.out.println("===========落子============");
        index++;
        //状态保存到备忘录
        caretakerChess.addMem(chess.SavetoMemento());
        chess.show();
    }
    public  static void undo(Originator chess){
        System.out.println("========悔棋=======");
        index--;//回到上一个位置
        chess.Restore(caretakerChess.getMem(index-1));//因为ArrayList从0开始，还要再-1下。
        chess.show();
    }

    public static void main(String[] args) {
        Originator chess = new Originator(new MementoChess("黑", 1, 2));//初始的棋子
        play(chess);
        chess.setX(5);
        play(chess);
        chess.setY(6);
        play(chess);
        undo(chess);
        undo(chess);

    }
}
