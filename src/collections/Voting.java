package collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Voting {
	public static void main(String[] args)
	{
		Queue<Integer> voterid=new LinkedList<>();
		voterid.add(1001);
		voterid.add(1002);
		voterid.add(1003);
		voterid.add(1004);
		voterid.add(1005);
		voterid.add(1006);
		voterid.add(1007);
		voterid.add(1008);
		voterid.add(1009);
		voterid.add(1010);
		voterid.add(1011);
		voterid.add(1012);
		voterid.add(1013);
		voterid.add(1014);
		voterid.add(1006);
		voterid.add(1003);
		voterid.add(1002);
		voterid.add(1011);
		voterid.add(1012);
		voterid.add(1007);

		HashMap<Integer,Integer> agecollect=new LinkedHashMap<Integer,Integer>();
		ArrayList<Integer> windowcount1=new ArrayList<>();
		ArrayList<Integer> windowcount2=new ArrayList<>();
		ArrayList<Integer> windowcount3=new ArrayList<>();
		ArrayList<Integer> windowcount4=new ArrayList<>();
		ArrayList<Integer> windowcount5=new ArrayList<>();
		ArrayList<Integer> windowcount6=new ArrayList<>();

		agecollect.put(1001, 44);
		agecollect.put(1001, 44);
		agecollect.put(1002, 64);
		agecollect.put(1003, 34);
		agecollect.put(1004, 20);
		agecollect.put(1005, 62);
		agecollect.put(1006, 37);
		agecollect.put(1007, 21);
		agecollect.put(1008, 29);
		agecollect.put(1009, 45);
		agecollect.put(1010, 33);
		agecollect.put(1011, 19);
		agecollect.put(1012, 35);
		agecollect.put(1013, 32);
		agecollect.put(1014, 72);
		agecollect.put(1006, 37);
		agecollect.put(1003, 34);
		agecollect.put(1002, 64);
		agecollect.put(1011, 19);
		agecollect.put(1012, 35);
		agecollect.put(1007, 21);
		while(voterid.peek()!=null)
		{
			int a=voterid.poll();
			int agegot=agecollect.get(a);
			windowcount6.add(a);

			if(agegot>=18 && agegot<=25)
			{
				//System.out.println("window 1\t"+agegot+"\n");
				windowcount1.add(a);
			}
			else if(agegot>=26 && agegot<=35)
			{
				//System.out.println("window 2\t"+agegot+"\n");
				windowcount2.add(a);
			}
			else if(agegot>=36 && agegot<=45)
			{
				//System.out.println("window 3\t"+agegot+"\n");
				windowcount3.add(a);
			}
			else if(agegot>=46 && agegot<=60)
			{
				//System.out.println("Window 4\t"+agegot+"\n");
				windowcount4.add(a);
			}
			else if(agegot>60)
			{
				//System.out.println("Window5\t"+agegot+"\n");
				windowcount5.add(a);
			}
			else
			{
				System.out.println("Under age for voting "+agegot);
			}
		}
		System.out.println("Voter's casted vote in window 1\t"+windowcount1);
		System.out.println("Voter's casted vote in window 2\t"+windowcount2);
		System.out.println("Voter's casted vote in window 3\t"+windowcount3);
		System.out.println("Voter's casted vote in window 4\t"+windowcount4);
		System.out.println("Voter's casted vote in window 5\t"+windowcount5);
		System.out.println("Voter's casted vote in window 6\t"+windowcount6);

	}
	public static void testME() {
		//Bhuvanesh added this file
	}
}
