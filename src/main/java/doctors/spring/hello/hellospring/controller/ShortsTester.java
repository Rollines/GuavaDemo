package doctors.spring.hello.hellospring.controller;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.primitives.Chars;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Shorts;

import java.util.List;

/**
 * @author chenjunlin
 * @date 2019-02-15
 * 实用工具类
 */
public class ShortsTester {
    public static void main(String[] args) {
     ShortsTester tester = new ShortsTester();
     //tester.testShorts();
     //tester.biMapTest();
     //INTS类型
        //tester.testInts();
        //floats浮点
        //tester.testFloats();
        //chars类型
        tester.testChars();
    }

    private void testChars(){
        char[] charArray = {'a','b','c','d','e','f','g','h'};

        List<Character> objectArray = Chars.asList(charArray);
        System.out.println(objectArray.toString());

        charArray = Chars.toArray(objectArray);
        System.out.print("[ ");
        for(int i = 0; i< charArray.length ; i++){
            System.out.print(charArray[i] + " ");
        }
        System.out.println("]");
        System.out.println("c is in list? "+ Chars.contains(charArray, 'c'));

        System.out.println("c position in list "+ Chars.indexOf(charArray, 'c'));

        System.out.println("Min: " + Chars.min(charArray));

        System.out.println("Max: " + Chars.max(charArray));
    }

    /**
     * 浮点数
     */
    private void testFloats(){
        float[] floatArray = {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f};
        List<Float> objectArray = Floats.asList(floatArray);
        System.out.println(objectArray.toString());

        floatArray = Floats.toArray(objectArray);
        System.out.print("[ ");
        for(int i = 0; i< floatArray.length ; i++){
            System.out.print(floatArray[i] + " ");
        }
        System.out.println("]");
        System.out.println("5.0 is in list? "+ Floats.contains(floatArray, 5.0f));

        System.out.println("5.0 position in list "+ Floats.indexOf(floatArray, 5.0f));

        System.out.println("Min: " + Floats.min(floatArray));

        System.out.println("Max: " + Floats.max(floatArray));
    }
    private void testShorts(){
        short[] shortArray = {1,2,3,4,5,6,7,8,9};

        //convert array of primitives to array of objects
        List<Short> objectArray = Shorts.asList(shortArray);
        System.out.println(objectArray.toString());

        //convert array of objects to array of primitives
        shortArray = Shorts.toArray(objectArray);
        System.out.print("[ ");
        for(int i = 0; i< shortArray.length ; i++){
            System.out.print(shortArray[i] + " ");
        }
        System.out.println("]");
        short data = 5;
        //check if element is present in the list of primitives or not
        System.out.println("5 is in list? "+ Shorts.contains(shortArray, data));

        //Returns the minimum
        System.out.println("Min: " + Shorts.min(shortArray));

        //Returns the maximum
        System.out.println("Max: " + Shorts.max(shortArray));
        data = 2400;
        //get the byte array from an integer
        byte[] byteArray = Shorts.toByteArray(data);
        for(int i = 0; i< byteArray.length ; i++){
            System.out.print(byteArray[i] + " ");
        }
    }
    private void biMapTest(){
        BiMap<Integer,String> empIDNameMap = HashBiMap.create();

        empIDNameMap.put(new Integer(101), "Mahesh");
        empIDNameMap.put(new Integer(102), "Sohan");
        empIDNameMap.put(new Integer(103), "Ramesh");

        //Emp Id of Employee "Mahesh"
        System.out.println(empIDNameMap.inverse().get("Mahesh"));
    }

    /**
     * Ints示例
     */
    private void testInts(){
        int[] intArray = {1,2,3,4,5,6,7,8,9};

        List<Integer> objectArray = Ints.asList(intArray);
        System.out.println(objectArray.toArray());

        //反转
        intArray  = Ints.toArray(objectArray);
        System.out.print("[");
        for (int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+" ");
        }
        System.out.println("]");
        System.out.println("5 is in list? " + Ints.contains(intArray,5));

        System.out.println("Min: "+Ints.min(intArray));
        System.out.println("Max: "+Ints.max(intArray));

        byte[] byteArray = Ints.toByteArray(20000);
        for (int i=0;i<byteArray.length;i++){
            System.out.print(byteArray[i]+" ");
        }
    }
}
