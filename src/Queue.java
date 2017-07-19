/**
 * Created by       : Chanaka Fernando.
 * Date             : Wed, 7/19/2017 .
 * Email            : nuwan.c.fernando@gmail.com.
 * LinkedIn         : https://www.linkedin.com/in/n-chanaka-fernando
 * Blongs to Project: DataStructuresAndAlgorithams.
 * Package          : PACKAGE_NAME.
 */
public class Queue {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s){
        maxSize =s;
        queArray =new int[maxSize];
        front =0;
        rear =-1;
        nItems =0;
    }

    public void insert(int j){
        if(isFull() ==false){
           queArray[++rear]= j;
           nItems++;
        }
    }

    public int remove(){
        int temp =0;
        if(isEmpty() == false){
            temp = queArray[front++];
            nItems--;

        }
        return temp;
    }


    public int peek(){
        return queArray[front];
    }


    public boolean isEmpty(){
        return (nItems ==0);
    }

    public boolean isFull(){
        return (nItems == maxSize)
    }

    public int size(){
        return nItems;
    }


}
