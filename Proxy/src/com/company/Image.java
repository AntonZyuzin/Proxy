package com.company;

public class Image implements Drawable{


    public Image(String path) {
        System.out.println("подгрзка");
        System.out.println(path);
    }

    @Override
    public void draw(){
        System.out.println("отрисовка");
    }
}
