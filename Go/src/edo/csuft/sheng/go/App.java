package edo.csuft.sheng.go;

public class App {

	public static void main(String[] args) {
		/**
		 * ģ��
		 */
		GoModel model=new GoModel();
		model.show();
		/**
		 * ����
		 */
		GameFrame frame=new GameFrame(model);
	}

}
