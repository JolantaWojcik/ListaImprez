
public class Impreza {
	//Stworz klase Impreza (nazwa, data[String], koszt, liczba uczestnikow)
	private String name;
	private String date;
	private int cost;
	private int numberOfMembers;


	public Impreza(String name, String date, int cost, int numberOfMembers) {
		super();
		this.name = name;
		this.date = date;
		this.cost = cost;
		this.numberOfMembers = numberOfMembers;
	}

	public Impreza() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	@Override
	public String toString() {
		return "Impreza [name=" + name + ", date=" + date + ", cost=" + cost + ", numberOfMembers=" + numberOfMembers
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Impreza other = (Impreza) obj;
		if (cost != other.cost)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfMembers != other.numberOfMembers)
			return false;
		return true;
	}

	
	 
}
