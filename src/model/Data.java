package model;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Data {
	public static Image imageBG;
	public static Image imageCup;
	
	public static Image imageHead_Up;
	public static Image imageHead_Down;
	public static Image imageHead_Left;
	public static Image imageHead_Right;
	
	public static Image imageBody;
	
	public static Image imageTail_Up;
	public static Image imageTail_Down;
	public static Image imageTail_Left;
	public static Image imageTail_Right;
	
	public static Animation apple;
	public static Animation mushroom;
	
	
	public static Image imageMushroom;
	public static Image imageMushroom1;
	public static Image imageMushroom2;
	
	public static Image imageApple1;
	public static Image imageApple2;
	public static Image imageApple3;
	
	

	
	
	public static void loadImage(){
		try {
			 imageBG = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\bg.png"));
			 
			 
			 imageApple1 = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\tao1.png"));
			 imageApple2 = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\tao2.png"));
			 imageApple3 = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\tao3.png"));
			 
			 imageMushroom = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\mushroom.png"));
			 imageMushroom1 = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\mushroom1.png"));
			 imageMushroom2 = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\mushroom2.png"));
			 
			 
			 imageHead_Up = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Head_Up.png"));
			 imageHead_Down = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Head_Down.png"));
			 imageHead_Left = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Head_Left.png"));
			 imageHead_Right = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Head_Right.png"));
			 
			 imageBody = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\body.png"));
			 
			 imageTail_Up = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Tail_Up.png"));
			 imageTail_Down = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Tail_Down.png"));
			 imageTail_Left = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Tail_Left.png"));
			 imageTail_Right = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\Tail_Right.png"));
			 
			 imageBody = ImageIO.read(new File("D:\\git\\GameSnake\\src\\data\\body.png"));
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void loadAnimation(){
		apple = new Animation();
		apple.addImage(imageApple1);
		apple.addImage(imageApple2);
		apple.addImage(imageApple3);
		
		mushroom = new Animation();
		mushroom.addImage(imageMushroom);
		mushroom.addImage(imageMushroom1);
		mushroom.addImage(imageMushroom2);
		mushroom.addImage(imageMushroom1);
	}


}
