package kadai_015;

	//フィールド
	public class Product{
		private int gear = 1;  // ギア(初期値)
		private int speed = 10; // 速度(初期値)

		// ギアチェンジメソッド
		public void gearChange(int afterGear) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear; //ギアを更新(this.gearにafterGearの3を渡す)
		}

		// 車を走らせるメソッドrunの引数は空なので引数は空
		public void run() {
			this.speed = this.gear * 10; //this.gearに入っている3*10=30をthia.speedに渡す
			System.out.println("現在の速度は時速" + this.speed + "kmです");
			}
	}




	
