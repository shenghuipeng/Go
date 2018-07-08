package edo.csuft.sheng.go;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JButton;
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
	int[] lo= {50,135,220,305,390,475,560,645,730};
	int a;
	int b;
	int n; 
	int v;
	int l;
	int r;
	
	MouseAdapter listener1=new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if(pieceList==null) {
			pieceList=new ArrayList<>();
			}
			super.mouseClicked(e);
			//ÿ�����������һ������
			System.out.println(e.getX()+" "+e.getY());
			for(int i=0;i<9;i++) {
				if(e.getX()<=lo[i]) {
					
					if(e.getX()+40>=lo[i]||e.getX()==lo[i])
						a=lo[i];
					else                                         
					 a=lo[i-1];
				break;
				}
			}

			for(int i=0;i<9;i++) {
				if(e.getY()<=lo[i]) {
					if(e.getY()+40>=lo[i]||e.getY()==lo[i])
						b=lo[i];
					else
					 b=lo[i-1];
				break;
				}
			}
			
			
			Piece piece=new Piece(a,b);
			while(true) {
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a-35&&p.y==b+85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a;
					r=b+85;
					break;
				}
				
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a-35&&p.y==b-85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a;
					r=b-85;
					break;
				}
				
				
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a-85-35&&p.y==b-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a-85;
					r=b;
					break;
				}
				
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a+85-35&&p.y==b-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a+85;
					r=b;
					break;
				}
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a+85-35&&p.y==b+85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a+85;
					r=b+85;
					break;
				}
				
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a+85-35&&p.y==b-85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a+85;
					r=b-85;
					break;
				}
				
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a+85-35&&p.y==b+85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a+85;
					r=b+85;
					break;
				}
				n=pieceList.size();
				for(Piece p:pieceList) {
					if(p.x==a-85-35&&p.y==b+85-35) {
						break;
					}
					n--;
				}
				if(n==0) {
					l=a-85;
					r=b+85;
					break;
				}
			}
				
			
				
			
	
			
			
			Piece pieceai=new Piece(l,r);
			
			//System.out.println(e.getX()+" "+e.getY()+"");
			n=pieceList.size();
			piece.isBlack=pieceList.size()%2==0;
			piece.isBlack=(pieceList.size()+1)%2==0;
			/**
			pieceList.add(piece);
			//����ģ��
			model.update(piece);
			model.show();
			model.referee(piece);
			//�������»���
			repaint();
			*/
			
			for(Piece p:pieceList){
				if(p.x!=(a-35) || p.y!=(b-35)) 
					n--;
			}
			//System.out.println(n);
			if(n==0) {
			pieceList.add(piece); 
			pieceList.add(pieceai);
			//System.out.println(pieceList.size());
			//����ģ��
			model.update(piece);
			model.update(pieceai);
			model.show();
			try {
				v=model.referee(piece);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//�������»���
			repaint();
			}
			
		}
	};
			
	
			
			
			
			
			
			
			
	MouseAdapter listener2=new MouseAdapter() {
		public void mouseClicked(MouseEvent e) {
			if(pieceList==null) {
			pieceList=new ArrayList<>();
			}
			super.mouseClicked(e);
			//ÿ�����������һ������
			//System.out.println(e.getX()+" "+e.getY());
			for(int i=0;i<9;i++) {
				if(e.getX()<=lo[i]) {
					
					if(e.getX()+40>=lo[i]||e.getX()==lo[i])
						a=lo[i];
					else                                         
					 a=lo[i-1];
				break;
				}
			}

			for(int i=0;i<9;i++) {
				if(e.getY()<=lo[i]) {
					if(e.getY()+40>=lo[i]||e.getY()==lo[i])
						b=lo[i];
					else
					 b=lo[i-1];
				break;
				}
			}
			
			
			Piece piece=new Piece(a,b);
			//System.out.println(e.getX()+" "+e.getY()+"");
			n=pieceList.size();
			piece.isBlack=pieceList.size()%2==0;
			/**
			pieceList.add(piece);
			//����ģ��
			model.update(piece);
			model.show();
			model.referee(piece);
			//�������»���
			repaint();
			*/
			
			for(Piece p:pieceList){
				if(p.x!=(a-35) || p.y!=(b-35)) 
					n--;
			}
			//System.out.println(n);
			if(n==0) {
			pieceList.add(piece); 
			//����ģ��
			model.update(piece);
			model.show();
			try {
				v=model.referee(piece);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			//�������»���
			repaint();
			}
			
			
			
			
			
			
			
		}
		
	};
	
	
	

	
	
	
	
	
	
	
	public GamePanel(GoModel model) {
		//setSize(800,800);
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
		//addMouseListener(listener2);
	}
	public void addListener1() {
		this.addMouseListener(listener1);
	}
	
	public void addListener2() {
		this.addMouseListener(listener2);
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
		//g.drawLine(0, 0,800,800);
		
		for(Piece piece:pieceList) {
			piece.paint(g);
		}
		
		
		if(v==1) {
			g.setColor(Color.black);
			Font ft1=new Font("Serif",Font.PLAIN,80);
			g.setFont(ft1);
			g.drawString("����ʤ��",250,350);
			pieceList=null;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					model.data[i][j]=0;
				}
			}
		}
		
		if(v==2) {
			g.setColor(Color.white);
			Font ft1=new Font("Serif",Font.PLAIN,80);
			g.setFont(ft1);
			g.drawString("����ʤ��",250,350);
			pieceList=null;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					model.data[i][j]=0;
				}
			}
	}
	
	}
}
