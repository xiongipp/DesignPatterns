package com.xxh.memorandum;

//当前状态
public class Originator {
    private MementoChess mementoChess;
    public Originator(MementoChess mementoChess){
        this.mementoChess=mementoChess;
    }
    public void setX(int x){
        mementoChess.setX(x);
    }
    public  void setY(int y){
        mementoChess.setY(y);
    }
    //保存为备忘录可以存储的对象
    public MementoChess SavetoMemento(){
        return new MementoChess(mementoChess.getLable(),mementoChess.getX(),mementoChess.getY());
    }
    //（恢复）悔棋
    public  void Restore(MementoChess mem){
        this.mementoChess.setLable(mem.getLable());
        this.mementoChess.setY(mem.getY());
        this.mementoChess.setX(mem.getX());
    }
    //显示当前棋子状态
    public void  show(){
        System.out.println("当前的棋子状态：\n"+"(x:"+this.mementoChess.getX()+" y:"+this.mementoChess.getY()+")"
        );
        System.out.println("label:"+this.mementoChess.getLable());
    }

}
