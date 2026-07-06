package dSA;


public class Stack {

    private String[] arraySize;
    private int top;
    private boolean status;

  public Stack(){
      arraySize = new String[5];
      status = true;
      top = -1;

  }

  public boolean isEmpty(){
      return status;
  }

  public void push(String brand ){
      top++;
      if (top <= 0) {
          arraySize[top] = brand;

      }
      status = false;
  }

    public void pop(){

        if(top > 0) {
            arraySize[top] = null;
            top --;
        }

        status = true;
    }

    public int totalElement() {

      return top;
    }
}
