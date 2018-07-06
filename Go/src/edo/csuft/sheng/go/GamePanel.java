package edo.csuft.sheng.go;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 * 面板
 * @author 盛惠鹏
 *
 */
public class GamePanel extends JPanel {
	GoModel model;
	//一个棋子
	Piece piece;
	/**
	 * 存储所有棋子的容器
	 */
	ArrayList<Piece> pieceList=new ArrayList<>();
	Image bg;
	MouseAdapter listener=new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			//每次鼠标点击创建一个棋子
			Piece piece=new Piece(e.getX(),e.getY());
			piece.isBlack=pieceList.size()%2==0;
			pieceList.add(piece);
			//更新模型
			model.update(piece);
			model.show();
			//画布重新绘制
			repaint();
		}
	};
	public GamePanel(GoModel model) {
		this.model=model;
		try {
			//加载工程目录图片
			this.bg=ImageIO.read(new File("res/go .png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//piece=new Piece(300,300);
		//注册一个点击事件
		addMouseListener(listener);
	}
	public void paint(Graphics graphics) {
		super.paint(graphics);
		Graphics2D g=(Graphics2D)graphics;
		//开启2D图形渲染的抗锯齿选项
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//System.out.println(getWidth());
		//System.out.println(getHeight());
		//g.drawLine(0, 0,800,800);
		//棋盘
		g.drawImage(bg,0,0,getWidth(),getHeight(),null);
		//g.fillOval(300, 300, 70, 70);
		//棋子
		//piece.paint(g);
		
		for(Piece piece:pieceList) {
			piece.paint(g);
		}
		
	}
}
