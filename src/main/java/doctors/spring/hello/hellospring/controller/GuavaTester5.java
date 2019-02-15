package doctors.spring.hello.hellospring.controller;

import com.google.common.base.Throwables;


import java.io.IOException;


/**
 * @author chenjunlin
 * @date 2019-02-15
 * Throwables类
 */
public class GuavaTester5 {
    public static void main(String[] args) {
        GuavaTester5 tester5 = new GuavaTester5();
        try {
            tester5.showcaseThrowables();
        }catch (InvalidInputException e){
            System.out.println(Throwables.getRootCause(e));
        }catch (Exception e){
            System.out.println(Throwables.getStackTraceAsString(e));

        }

        try{
            tester5.showcaseThrowables1();
        }catch (Exception e){
            System.out.println(Throwables.getStackTraceAsString(e));
        }
    }
    public void showcaseThrowables() throws InvalidInputException{
        try {
            sqrt(-3.0);
        }catch (Throwable e){
            Throwables.propagateIfInstanceOf(e,IndexOutOfBoundsException.class);
            Throwables.propagate(e);
        }
    }
    public void showcaseThrowables1(){
        try {
            int[] data = {1,2,3};
            getValue(data,4);
        }catch (Throwable e){
            Throwables.propagateIfInstanceOf(e,IndexOutOfBoundsException.class);
            Throwables.propagate(e);
        }
    }

    public double sqrt(double input) throws InvalidInputException{
        if(input < 0) throw new InvalidInputException();
        return Math.sqrt(input);
    }
    public double getValue(int[] list, int index) throws IndexOutOfBoundsException {
        return list[index];
    }

    public void dummyIO() throws IOException {
        throw new IOException();
    }
}

class InvalidInputException extends Exception {
}