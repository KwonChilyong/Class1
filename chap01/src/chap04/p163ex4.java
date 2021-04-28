//package chap04;
//class Car {
//	String color;
//	static int count = 0; // 전체 자동차 수 , 자동초기화 됨
//	static int redCount = 0;
//	static int blueCount = 0;
//	Car() {
//		
//	}
//	Car(String color){
//		this.color = color;
//		count++;
//		switch(color) {
//		case "red" :
//		case "RED" :
//			redCount++;
//			break;
//		case "blue" :
//			blueCount++;
//			break;
//		default :
//			
//		}
//	}
//	public static int getNumOfCar() {
//		return count;
//	}
//	public static int getNumOfRedCar() {
//		return redCount;
//	}
//}
//
//public class p163ex4 {
//
//	public static void main(String[] args) {
//		Car c1 = new Car("red");
//		Car c2 = new Car("blue");
//		Car c3 = new Car("RED");
//		
//		System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", 
//				          Car.getNumOfCar(), Car.getNumOfRedCar());
//
//	}
//
//}
