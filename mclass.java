class mclass{
    int x;
    float y;
}
class myclass{
    public static void main(String args[]){
        mclass m1 = new mclass();
        mclass m2= new mclass();
        m1.x=10;
	m2.x=20;
        System.out.println(m1.x+" "+m1.y);
        System.out.println(m2.x+" "+m2.y);
    }
}
