package com.xxh.Iterator;

public class SkyTV implements Television {
    private Object[] obj={"CCTV-10","少儿频道","cctv-7"};
    @Override
    public TVIterator createIterator() {
        return new SkyIterator();
    }
    private class SkyIterator implements TVIterator{

        private int currentIndex=0;
        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if(currentIndex<obj.length){
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if(currentIndex>0){
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
