package practise;
import java.util.*;


public class ReadingFile {
	public List<String> inputList = new ArrayList<String>();
	public HashMap<String, Integer> input= new HashMap<String, Integer>();
	public void solve(){
	inputList.add("1,CT,a1");
	inputList.add("1,CM,a3");
	inputList.add("12,CT,a4");
	inputList.add("13,CM,a1");
	inputList.add("1,CT,a4");
	inputList.add("12,CB,a7");
	inputList.add("10,CT,a1");
	inputList.add("12,CT,a1");
	inputList.add("13,CT,a2");
	inputList.add("1,CM,a2");
	inputList.add("12,CB,a5");
	inputList.add("13,CB,a3");
	inputList.add("13,CT,a4");
	inputList.add("12,CM,a6");
	inputList.add("13,CM,a5");
	inputList.add("12,CT,a8");
	inputList.add("10,CT,a7");
	inputList.add("1,CM,a9");
	inputList.add("12,CM,a3");
	inputList.add("10,CM,a9");
	inputList.add("12,CB,a2");
	inputList.add("1,CT,a5");
	inputList.add("12,CM,a9");
	inputList.add("1,CB,a6");
	inputList.add("1,CT,a8");
	inputList.add("1,CB,a7");
	inputList.add("1,CB,a10");
	inputList.add("10,CT,a8");
	inputList.add("10,CM,a2");
	inputList.add("10,CB,a6");
	inputList.add("10,CM,a5");
	inputList.add("10,CB,a3");
	inputList.add("10,CB,a4");
	inputList.add("13,CT,a6");
	inputList.add("13,CB,a7");
	inputList.add("13,CM,a8");
	inputList.add("13,CB,a9");																	
	
	input.put("a1",10);
	input.put("a2",40);
	input.put("a3",60);
	input.put("a4",80);
	input.put("a5",90);
	input.put("a6",30);
	input.put("a7",20);
	input.put("a8",30);
	input.put("a9",70);
	input.put("a10",50);
	//System.out.println(input);
	}
	
	public void buildDS(){
		List<Element> L3 = new ArrayList<Element>();
		HashMap<String,String> output= new HashMap<String, String>();
		for(String str: inputList){
		String [] parts = str.split(",");
		Element element = new Element();
		element.value = parts[0]+":"+parts[1];
		element.label=parts[2];
		element.weightage = input.get(element.label);
		L3.add(element);
		
		}
		
		Collections.sort(L3);
		
		//System.out.println(L3);
	
	for(Element ele: L3){
		if(!output.containsKey(ele.getValue())){
			output.put(ele.getValue(), ele.getLabel());
		}
		
	}
	System.out.println(output);
	}
	public  static void main(String args[]){
		ReadingFile rf = new ReadingFile();
			rf.solve();
			rf.buildDS();
	
	}
	

	

}
