package objetos;
import java.awt.Color;
import java.awt.Graphics;

import jogo.HanoiApplet;

import interfaces.IDesenhavel;

public class Tabuleiro implements IDesenhavel {
	private int larguraTela;
	private int alturaTela;
	
	public Tabuleiro()
	{
		this.larguraTela = HanoiApplet.larguraTela;
		this.alturaTela = HanoiApplet.alturaTela;
	}
	
	@Override
	public void desenhar(Graphics globalGraphics) {
		globalGraphics.setColor(Color.BLACK);
		globalGraphics.fillRect(10, alturaTela - 10, larguraTela - 10, 10);
	}
}
