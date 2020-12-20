package com.company;

public class LazyImage implements Drawable{
    String path = "C:/img.jpeg";

    @Override
    public void draw(){
        Image img = new Image(path);
        img.draw();
    }
}
