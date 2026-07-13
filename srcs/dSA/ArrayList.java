package dSA;

public class ArrayList {

        private String [] items;
        private int count;
        private int arrayListSize = 10;

        public ArrayList(){
            items = new String [arrayListSize];
        }
        public boolean isEmpty(){
            return count == 0;
        }

        public void add(String item){
            if(isFull()) {
                arrayListSize = arrayListSize * 2;
                String [] extendTheList = new String[ arrayListSize];
                int index = 0;
                for(String element : items){
                    extendTheList[index++] = element;
                }
                items = extendTheList;

                items[count++] = item;
            }
            else{
                items[count++] = item;
            }
        }

        public int size(){
            return count;
        }

        public String remove(int index){
            --count;
            return items[index];
        }

        public boolean isFull(){
            return items.length == count;
        }

        public void ensureCapacity(int size){

            String [] resizingTheArrayList = new String [size];

            int arrayIndex = 0;
            for(String previousItem : items ){
                resizingTheArrayList[arrayIndex] = previousItem;
            }

            items = resizingTheArrayList;

        }

        public boolean contains(String target){
            for(String gottenItem : items){
                if (gottenItem.equals(target))
                    return true;
            }
            return false;
        }
    }

