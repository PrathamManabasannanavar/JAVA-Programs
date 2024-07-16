package classesAndObjects;

class Box{
	double width, height, depth;
	Box(){
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}
	Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	Box(double value){
		this.width = this.height = this.depth = value;
	}
	double volume() {
		return this.width * this.height * this.width;
	}
}

class BoxWeight extends Box{
	double weight;
	BoxWeight(){
		super();
		this.weight = 0;
	}
	BoxWeight(double weight, double width, double height, double depth){
		super(width, height, depth);
		this.weight = weight;
	}
	BoxWeight(double weight, double value){
		super(value);
		this.weight = weight;
	}
}

class Shipment extends BoxWeight{
	double cost;
	Shipment(){
		this.cost = 0;
	}
	Shipment(double cost, double weight, double width, double height, double depth){
		super(weight, width, height, depth);
		this.cost = cost;
	}
	Shipment(double cost, double weight, double value){
		super(weight, value);
		this.cost = cost;
	}
}

public class boxProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight bw1 = new BoxWeight();
		BoxWeight bw2 = new BoxWeight(1, 2, 3, 4);
		BoxWeight bw3 = new BoxWeight(1, 2);

		Shipment sh1 = new Shipment();
		Shipment sh2 = new Shipment(1, 2, 3, 4, 5);
		Shipment sh3 = new Shipment(1, 2, 3);
		
		System.out.println(sh2.volume());
	}

}
