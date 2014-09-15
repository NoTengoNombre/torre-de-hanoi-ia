package jogo;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.applet.*;

import objetos.Tabuleiro;

public class HanoiApplet extends Applet implements MouseListener, MouseMotionListener
{
	private static final long serialVersionUID = 1L;
	public static final int larguraTela = 600;
	public static final int alturaTela = 400;
	
	private Graphics globalGraphics;
	private int mouseButton;
	private Tabuleiro tabuleiro;
	
	public void init()
	{
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		mouseButton = 0;
		globalGraphics = null;
		tabuleiro = new Tabuleiro();
	}
	
	public void paint(Graphics g)
	{
		globalGraphics = g.create();
		tabuleiro.desenhar(globalGraphics);
	}
	
	public void ponto(int x, int y)
	{
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		
		Color randomColor = new Color(r, g, b);
		globalGraphics.setColor(randomColor);
		globalGraphics.fillRect(x, y, 10, 10);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseButton = e.getButton();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {	
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
