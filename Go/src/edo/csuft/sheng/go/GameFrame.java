package edo.csuft.sheng.go;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GameFrame extends JFrame{
	/**
	 * ��Ϸ���
	 */
	GamePanel gamePanel;
	MouseAdapter listener1;
	MouseAdapter listener2;
	/**
	 * ��Ϸģ��
	 */
	GoModel model;
	JPanel controlPanel;
	MouseAdapter listener;
	/**
	 * ������Ϸ����
	 */
	
	public GameFrame(GoModel model) {
		setLayout(null);
		this.model=model;
		//model.show();
		setTitle("������");
		setSize(1000,822);
		//��С���ɵ���
		setResizable(false);
		//set.Location();
		//��Ļ�м�
		setLocationRelativeTo(null);
		//�رմ����˳�����
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    gamePanel=new GamePanel(model);
	    gamePanel.setBounds(0,0,785,800);       //setContentPane(gamePanel);
	    add(gamePanel);
	    controlPanel=new JPanel();
		controlPanel.setBounds(800,0,200,800);
		add(controlPanel);
		initControlPanel();
		setVisible(true);
		
		
	}
	 void initControlPanel() {
		controlPanel.setLayout(null);
		JButton button1=new JButton("��Ҷ�ս");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addListener2();
				
			}
			
		});
		button1.setBounds(50,300,100,50);
		controlPanel.add(button1);
		JButton button2=new JButton("�˻���ս");
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addListener1();
				
			}
			
		});
		button2.setBounds(50,400,100,50);
		controlPanel.add(button2);
		
	}
	
}
