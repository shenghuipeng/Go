package edo.csuft.sheng.go;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	/**
	 * 游戏面板
	 */
	GamePanel gamePanel;
	/**
	 * 游戏模型
	 */
	GoModel model;
	/**
	 * 定义游戏窗口
	 */
	
	public GameFrame(GoModel model) {
		this.model=model;
		//model.show();
		setTitle("五子棋");
		setSize(800,822);
		//大小不可调整
		setResizable(false);
		//set.Location();
		//屏幕中间
		setLocationRelativeTo(null);
		//关闭窗口退出程序
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    gamePanel=new GamePanel(model);
	    setContentPane(gamePanel);
		setVisible(true);
	}
}
