package Java基础Day06面向对象下.接口.练习.练习1;
/*
 * 定义一个Circle类，声明radius属性，提供getter和setter方法

 */
public class Circle {
	
	private Double radius;

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}
	
	
}
