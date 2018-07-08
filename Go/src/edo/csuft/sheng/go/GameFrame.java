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
	 * 游戏面板
	 */
	GamePanel gamePanel;
	MouseAdapter listener1;
	MouseAdapter listener2;
	/**
	 * 游戏模型
	 */
	GoModel model;
	JPanel controlPanel;
	MouseAdapter listener;
	/**
	 * 定义游戏窗口
	 */
	
	public GameFrame(GoModel model) {
		setLayout(null);
		this.model=model;
		//model.show();
		setTitle("五子棋");
		setSize(1000,822);
		//大小不可调整
		setResizable(false);
		//set.Location();
		//屏幕中间
		setLocationRelativeTo(null);
		//关闭窗口退出程序
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
		JButton button1=new JButton("玩家对战");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				gamePanel.addListener2();
				
			}
			
		});
		button1.setBounds(50,300,100,50);
		controlPanel.add(button1);
		JButton button2=new JButton("人机对战");
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
