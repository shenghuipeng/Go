package edo.csuft.sheng.go;
/**
 * ��Ϸģ��
 * @author ʢ����
 *
 */
public class GoModel {
	/**
	 * ��������
	 */
	int[][] data=new int[9][9];
	/**
	 * ��ʾ
	 */
	public void show() {
		System.out.println("-------------------------");
		for(int[] row:data){
			for(int e:row) {
				System.out.print(e+"\t");
			}
			System.out.println();
			
		}
	}
	//���Ӻ����
	public void update(Piece piece) {
		int x=(piece.y-50)/100;
		int y=(piece.x-50)/100;
		data[x][y]=piece.isBlack? 1:2;
		
	}
}
