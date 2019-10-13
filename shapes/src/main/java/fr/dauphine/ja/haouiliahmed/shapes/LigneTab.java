package fr.dauphine.ja.haouiliahmed.shapes;

public class LigneTab {
	private Point points[];
	private int index;

	
	public LigneTab(int nbPoints) {
		this.points = new Point[nbPoints];
		this.index = 0;
	}
	
	public void add(Point p) {
		if(index < points.length) {
			points[index]=p;
			index++;
		}else {
			System.out.println("Impossible d'ajouter cet élément");
		}
	}
	public int pointCapacity() {
		return points.length;
	}
	public int nbPoints() {
		return index;
	}
	public boolean contains(Point p) {
		for (Point e : points) {
			// On ne peut pas utiliser isSameAs() car cette méthode compare les valeurs des variables, 
			// Ce qui nous intéresse pas ici.
			if(e == p) {
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args) {
		LigneTab l = new LigneTab(2);
		Point p1 = new Point(3,2);
		Point p2 = new Point(3,2);
		Point p3 = new Point(3,2);
		l.add(p1);
		l.add(null);

		System.out.println(l.contains(null));
		System.out.println(l.contains(p3));
	}
}
