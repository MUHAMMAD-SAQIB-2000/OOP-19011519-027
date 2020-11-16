package com.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

@SuppressWarnings("serial")
public class Game extends Canvas implements Runnable{

	public static int WIDHTH = 800, HEIGHT = 600;
	public String title = "Shooting Game";

	private Thread thread;
	private boolean isRunning = false;

	public Game() {
		new Window(WIDHTH, HEIGHT, title, this);
		start();
	}

	private synchronized void start() {
		if(isRunning) return;
		thread = new Thread(title);
		thread.start();
		isRunning = true;
	}

	private synchronized void stop() throws Exception {
		if(isRunning) return;
		thread.join();
	}

	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(isRunning) {
			long now = System.nanoTime();
			delta += (now - lastTime) /ns;
			lastTime = now;
			while(delta >=1) {
				tick();
				delta--;
			}
			render();
			frames++;
			if(System.currentTimeMillis() - timer >1000) {
				timer += 1000;
				frames = 0;
			}
		}
		try {
			stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void render() {
	
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return ;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, WIDHTH, HEIGHT);
		bs.show();
		g.dispose();
		
	}

	private void tick() {
		
	}

	public static void main(String[] args) {
		new Game();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
