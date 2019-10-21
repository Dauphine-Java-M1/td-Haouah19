package fr.dauphine.ja.haouiliahmed.shapes.model;

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
		try {
			for (Point e : points) {
				// On ne peut pas utiliser isSameAs() car cette méthode compare les valeurs des variables, 
				// Ce qui nous intéresse pas ici.
				if(e.isSameAs(p)) {
					return true;
				}
			}
		}catch(NullPointerException e) {
			System.out.println("l'objet "+p+" n'est pas contenu dans la liste.");
		}
		return false;
	}

}
