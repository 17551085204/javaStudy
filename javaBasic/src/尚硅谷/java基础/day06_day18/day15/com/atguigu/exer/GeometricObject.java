package 尚硅谷.java基础.day06_day18.day15.com.atguigu.exer;

public abstract class GeometricObject {//几何图形

	protected String color;
	protected double weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public abstract double findArea();
	
}
