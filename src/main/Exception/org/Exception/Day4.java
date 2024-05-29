package org.Exception;

class StackOverFlow extends Exception{
    public String toString(){
        return ("Stack is Full");
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return ("Stack is Empty");
    }
}
class stack{
    private int size;
    private int top;
    private int D[];
    public stack(int Dz){
        size=Dz;
        D=new int[Dz];
    }
    public void push(int c) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        D[top]=c;
    }
    public int pop() throws StackUnderFlow {
        int c = -1;
        if (top == -1)
            throw new StackUnderFlow();
        c = D[top];
        top--;
        return c;
    }
}
public class Day4 {
    public static void main(String[] args) {
        stack st=new stack(4);
        try {
            st.pop();
            st.pop();
            st.push(21);
        }
        catch (StackOverFlow w) {
            System.out.println(w);
        }catch (StackUnderFlow r)
        {
            System.out.println(r);
        }
    }
}
