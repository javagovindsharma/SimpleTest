package  BootcampProblems.assignment8_hashmap;

import java.util.ArrayList;

//1. Implement Maps using Hashtables

class Map<K, V>
{
	public static class node<K, V>{
		K key;
		V value;
		node<K, V> next;
	}
	private ArrayList<node<K, V>> bucket;
	private int numBuckets;
	int size;
	
	public Map() {
		bucket = new ArrayList<>();
		numBuckets = 20;
		for(int i = 0 ; i <  numBuckets ; i++)
		{
			bucket.add(null);
		}
	}
	
	public int getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return getSize()==0;
	}
	
	public int getBucketIndex(K key) {
		return key.hashCode()%numBuckets;
	
	}
	public void rehash()
	{
		numBuckets *= 2;
		ArrayList<node<K, V>> temp = bucket;
		bucket = new ArrayList<>();
		for(int i = 0 ; i < numBuckets ; i++)
		{
			bucket.add(null);
		}
		size = 0 ;
		for(node<K, V> head: temp)
		{
			while(head != null)
			{
				put(head.key,head.value);
				head = head.next;
			}
		}
	}
	public void put(K key, V value)
	{
		int index = getBucketIndex(key);
		node<K, V> head = bucket.get(index);
		while(head != null){
			if(head.key.equals(key))
				break;
			head = head.next;
		}if(head!= null)
		{
			head.value = value;
		}else{
			size++;
			node<K, V> newnode = new node<>();
			newnode.key = key;
			newnode.value = value;
			newnode.next = bucket.get(index);
			bucket.set(index, newnode);
			if ((1.0*size)/numBuckets > 0.7) {
				rehash();
			}
		}
	}
	public V get(K key) {
		int index = getBucketIndex(key);
		node<K, V> head = bucket.get(index);
		while(head != null)
		{
			if(head == key)
				break;
			else
				head = head.next;
		}if(head != null)
		{
			return head.value;
		}else{
			return null;
		}
	}
	
	public V remove(K key){
		int index = getBucketIndex(key);
		node<K, V> head = bucket.get(index), prev = null;
		while(head != null)
		{
			if(head.key.equals(key))
				break;
			prev = head;
			head = head.next;
		}if(head == null)
		{
			return null;
		}else{
			size--;
			if(prev == null)
			{
				bucket.set(index, head.next);
			}
			else{
				prev.next = head.next;
			}
			return head.value;
		}
	}
}


public class Q1 {

	public static void main(String[] args) {
		Map<String, String> map = new Map<>();
		map.put("this", "one");
		map.put("athis", "one");
		map.put("bthis", "one");
		map.put("cthis", "one");
		map.put("dthis", "one");
		System.out.println(map.remove("athis"));
	}
	
	
}
