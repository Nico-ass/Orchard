package orchard.application;

import java.util.ArrayList;




public class Game {
	
	private ArrayList<Tree> treeList = new ArrayList<Tree>();
	private ArrayList<Basket> basketList = new ArrayList<Basket>();
	private int counter = 0;
	

	public void createTreeList() {
		this.treeList.add(new Tree("appleTree","green","apple",10));
		this.treeList.add(new Tree("cherryTree","red","cherry",10));
		this.treeList.add(new Tree("pearTree","yellow","pear",10));
		this.treeList.add(new Tree("plumTree","blue","plum",10));
	}
	
	public void createBasketList() {
		this.basketList.add(new Basket(0, "green"));
		this.basketList.add(new Basket(0, "red"));
		this.basketList.add(new Basket(0, "yellow"));
		this.basketList.add(new Basket(0, "blue"));
	}
	

	public ArrayList<Tree> getTreeList() {
		return this.treeList;
	}
	
	public ArrayList<Basket> getBasketList() {
		return this.basketList;
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	public void addOneToCounter() {
		this.counter = this.counter + 1;
	}
	
	public void resetCounter() {
		this.counter = 0;
	}
	
	public void setCountertoTwo() {
		this.counter = 2;
	}
	
	
	
	
	
	
	
	
	
	
	
}
