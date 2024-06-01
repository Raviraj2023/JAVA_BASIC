package org.InterviewQ;
import java.util.ArrayList;
import java.util.List;

public class RemoveduplicateInt {
    public static void main(String[] args) {
        int []input={12,34,54,22,12,23,34};
        List<Integer> er=new ArrayList<>();
        for(int num:input){
            if(!er.contains(num)){
           er.add(num);
        }
        }
        System.out.println(er);
    }
}
