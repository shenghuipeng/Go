package edo.csuft.sheng.go;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 棋子
 * @author 盛惠鹏
 *
 */
public class Piece {
	/**
	 * x坐标
	 */
	int x;
	/**
	 * y坐标
	 */
	int y;
	/**
	 * 颜色
	 */
	boolean isBlack=true;
	/**
	 * 棋子大小
	 */
	int size=70;
	/**
	 * 落子:创建一个棋子
	 * @param x
	 * @param y
	 */
	public Piece(int x,int y) {
		super();
		this.x=x-size/2;
		this.y=y-size/2;
		
	}
	
	/**
	 * 绘制
	 * @param g
	 */
	public void paint(Graphics2D g) {
		
		g.setColor(isBlack? Color.black:Color.white);
		g.fillOval(x,y,size,size);
		
	}
}
