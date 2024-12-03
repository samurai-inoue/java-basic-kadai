package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		// インスタンス作成
		Car_Chapter15 car = new Car_Chapter15();
        
        // ギアチェンジを実行(ギアチェンジメソッドのafterGearに渡す値)
        car.gearChange(3);
        
        // 車を走らせる
        car.run();//引数がないので空をrunに渡す
	}
	
}


