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
 * ���
 * @author ʢ����
 *
 */
public class GamePanel extends JPanel {
	GoModel model;
	//һ������
	Piece piece;
	/**
	 * �洢�������ӵ�����
	 */
	ArrayList<Piece> pieceList=new ArrayList<>();
	Image bg;
	MouseAdapter listener=new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			//ÿ�����������һ������
			Piece piece=new Piece(e.getX(),e.getY());
			piece.isBlack=pieceList.size()%2==0;
			pieceList.add(piece);
			//����ģ��
			model.update(piece);
			model.show();
			//�������»���
			repaint();
		}
	};
	public GamePanel(GoModel model) {
		this.model=model;
		try {
			//���ع���Ŀ¼ͼƬ
			this.bg=ImageIO.read(new File("res/go .png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//piece=new Piece(300,300);
		//ע��һ������¼�
		addMouseListener(listener);
	}
	public void paint(Graphics graphics) {
		super.paint(graphics);
		Graphics2D g=(Graphics2D)graphics;
		//����2Dͼ����Ⱦ�Ŀ����ѡ��
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		//System.out.println(getWidth());
		//System.out.println(getHeight());
		//g.drawLine(0, 0,800,800);
		//����
		g.drawImage(bg,0,0,getWidth(),getHeight(),null);
		//g.fillOval(300, 300, 70, 70);
		//����
		//piece.paint(g);
		
		for(Piece piece:pieceList) {
			piece.paint(g);
		}
		
	}
}
