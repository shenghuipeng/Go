package edo.csuft.sheng.go;

public class App {

	public static void main(String[] args) {
		/**
		 * 模型
		 */
		GoModel model=new GoModel();
		model.show();
		/**
		 * 界面
		 */
		GameFrame frame=new GameFrame(model);
	}

}
