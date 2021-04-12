package com.redfern.java_course_spring_2021.Week_05;

public class Pair implements Comparable<Pair>{
	
	private String str1;
	private String str2;
	
	// CONSTRUCTOR
	public Pair(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}

	// OVERRIDES
	@Override
	public int compareTo(Pair p) {
		int comp = this.str1.compareTo(p.str1);
		if(comp == 0)
			comp = this.str1.compareTo(p.str2);
		return comp;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str1 == null) ? 0 : str1.hashCode());
		result = prime * result + ((str2 == null) ? 0 : str2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (str1 == null) {
			if (other.str1 != null)
				return false;
		} else if (!str1.equals(other.str1))
			return false;
		if (str2 == null) {
			if (other.str2 != null)
				return false;
		} else if (!str2.equals(other.str2))
			return false;
		return true;
	}
}
