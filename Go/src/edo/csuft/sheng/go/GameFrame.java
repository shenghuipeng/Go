package edo.csuft.sheng.go;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	/**
	 * ��Ϸ���
	 */
	GamePanel gamePanel;
	/**
	 * ��Ϸģ��
	 */
	GoModel model;
	/**
	 * ������Ϸ����
	 */
	
	public GameFrame(GoModel model) {
		this.model=model;
		//model.show();
		setTitle("������");
		setSize(800,822);
		//��С���ɵ���
		setResizable(false);
		//set.Location();
		//��Ļ�м�
		setLocationRelativeTo(null);
		//�رմ����˳�����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    gamePanel=new GamePanel(model);
	    setContentPane(gamePanel);
		setVisible(true);
	}
}
