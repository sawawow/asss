package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
           //int a  = 10/0;
            int[] arr = {1,2};
            arr[3] = 2;
        }catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя");
        }catch (ArrayIndexOutOfBoundsException i){
            //при обработке исключений приоритет будет отдаваться тому классу исключения
            //который в цепочке наследования находится дальше всего от класса Exception
            System.out.println(1);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(2);
        }
        //так делать нельзя
        //
        try {
            int a  = 10/0;
            int[] arr = {1,2};
            arr[3] = 2;
        }catch (Exception e){
            System.out.println("Упс что то пощло не так");
        }//исключения в джаве бывают двух видов
        //-checket(обязательный для обработки)
        //-unchecket(не обязательный для обработки)

        //unchecket = все классы исключений которые
        //наследуют класс RuntimeException
        File f = new File("1.txt");
        f.createNewFile();
        try {
            f.createNewFile();
        }catch (IOException e){}
        //checket
        //обработка нескольких исключений в одном блоке catch
        try {
            int a  = 10/0;
            int[] arr = {1,2};
            arr[3] = 2;
        }catch(ArithmeticException|ArrayIndexOutOfBoundsException e){}

        //throw генерирует исключения
        //после throw нужно указать обьект исклбчения
        //наследует класс Exception,Runtimeexception
         //try {
              //throw new Exception();
           // } catch (Exception e) {
            //    e.printStackTrace();
           // }

        try {
            setAge(121);
        } catch (Exception e) {
            System.out.println(e.getMessage());//возврвщает
        }
    }
    //throws определяет классы исключений которые генерирует метод
    //которые должны быть обработаны при вызове этого метода
public static void setAge(int age) throws Exception{
        if (age<0||age >120){
            //генерируем исключения
            throw new Exception("текст Ошибки");
        }
}
}
