package practise;

class Element implements Comparable<Element>{
	String value, label; // label is a1,a2,a3....; value is whatever other data you want to store
    int weightage;// used for sorting 
     
    
    public int compareTo(Element o)          {
       return o.weightage- this.weightage;
}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public int getWeightage() {
		return weightage;
	}


	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}
}
