import java.util.*;
class graphdemo{
	public static void main(String args[]){
		TreeMap<Character,ArrayList<Character>> graph=new TreeMap<>();
		ArrayList<Character>al=new ArrayList<>();
		al.add('b');
		al.add('c');
		al.add('d');
		graph.put('a',al);

		ArrayList<Character>bl=new ArrayList<>();
		bl.add('a');
        	bl.add('h');
		graph.put('b',bl);

		ArrayList<Character>cl=new ArrayList<>();
        	cl.add('a');
        	cl.add('f');
        	graph.put('c',cl);

		ArrayList<Character>dl=new ArrayList<>();
        	dl.add('a');
        	dl.add('e');
		dl.add('h');
        	graph.put('d',dl);

		ArrayList<Character>el=new ArrayList<>();
        	el.add('d');
        	el.add('h');
		el.add('f');
        	el.add('g');
        	graph.put('e',el);

		ArrayList<Character>fl=new ArrayList<>();
        	fl.add('c');
        	fl.add('e');
        	fl.add('g');
        	graph.put('f',fl);

		ArrayList<Character>gl=new ArrayList<>();
        	gl.add('h');
        	gl.add('e');
        	gl.add('f');
		graph.put('g',gl);

		ArrayList<Character>hl=new ArrayList<>();
        	hl.add('b');
        	hl.add('d');
        	hl.add('e');
		hl.add('g');
        	graph.put('h',hl);

		graphdemo g=new graphdemo();
		g.bfs(graph,'a');
}
void bfs(TreeMap<Character,ArrayList<Character>>t,char sn){
	Deque<Character>q=new ArrayDeque<>();
	ArrayList<Character>al=new ArrayList<>();
	q.offerLast(sn);
	Character ch;
	while((ch=q.pollFirst())!=null){
		if(!al.contains(ch)){
			System.out.print(ch);
			System.out.print(" ");
			ArrayList<Character>a=t.get(ch);
			for(int i=0;i<a.size();i++){
//				System.out.print(a.get(i));
				q.add(a.get(i));
			}
//			System.out.println();
			al.add(ch);
			System.out.println();
			}
	     	}
	}
}
