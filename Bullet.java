package com.company;

import java.awt.*;

public class Bullet {

    private double x;
    private double y;
    private int r;

    private double dx;
    private double dy;
    private double rad;
    private double speed;

    private Color color1;

    public Bullet(double angle, double x, double y){
        this.x = x;
        this.y = y;
        r = 2;
        speed = 15.0;

        rad = Math.toRadians(angle);
        dx = Math.cos(rad) * speed;
        dy = Math.sin(rad) * speed;


        color1 = Color.YELLOW;
    }

    public boolean update(){

        x += dx;
        y += dy;

        if (x < -r || x > GamePanel.WIDTH + r ||
               y < - r || y > GamePanel.HEIGHT +r){
            return true;
        }

        return false;
    }

    public void draw(Graphics2D g){

        g.setColor(color1);
        g.fillOval((int) (x - r), (int) (y-r), 2*r, 2*r);
    }
}
