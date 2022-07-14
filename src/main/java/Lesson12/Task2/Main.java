package Lesson12.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputText= scanner.nextLine();

Thread t1= new Input(inputText);
Thread t2=new Output(inputText);

t1.start();
t2.start();







}


    }


