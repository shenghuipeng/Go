package edo.csuft.sheng.go;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * ����
 * @author ʢ����
 *
 */
public class Piece {
	/**
	 * x����
	 */
	int x;
	/**
	 * y����
	 */
	int y;
	/**
	 * ��ɫ
	 */
	boolean isBlack=true;
	/**
	 * ���Ӵ�С
	 */
	int size=70;
	/**
	 * ����:����һ������
	 * @param x
	 * @param y
	 */
	public Piece(int x,int y) {
		super();
		this.x=x-size/2;
		this.y=y-size/2;
		
	}
	
	/**
	 * ����
	 * @param g
	 */
	public void paint(Graphics2D g) {
		
		g.setColor(isBlack? Color.black:Color.white);
		g.fillOval(x,y,size,size);
		
	}
}
