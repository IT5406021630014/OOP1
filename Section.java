import javax.swing.JOptionPane;
import java.util.*;
public class Section {
    public static void main(String args[]){ 
        for(;;){
	        String x = JOptionPane.showInputDialog( "Input section\nSec 3\nSec 4\nSec 5\nExit 0" );
	        switch(x){
	        	case "3":
	        		section("3",40);
	        		break;
	        	case "4":
	        		section("4",20);
	        		break;
	        	case "5":
	        		section("5",50);
	        		break;
				case "0":
					System.exit(0);
					break;
	        	default:
	        		JOptionPane.showMessageDialog ( null, "please input again" );
	        }
	    }
    }

    public static void section(String section,int student){
    	if(section == "3"){
    		int[][] arr = new int[6][student];
    		String[] g = new String[student];
    		int mid = 30, fn = 30, hw = 20 , ass = 15 , aff = 5;
    		int total =0;
    		for (int i=0;i<5 ;i++ ) { 
    			for(int j=0;j<student;j++){
    				if(i==0)
    					arr[i][j] = random(mid);
    				else if(i==1)
    					arr[i][j] = random(fn);
    				else if(i==2)
    					arr[i][j] = random(hw);
    				else if(i==3)
    					arr[i][j] = random(ass);
    				else if(i==4)
    					arr[i][j] = random(aff);
    				arr[5][j] += arr[i][j];
    				if(arr[5][j] > 80)
    					g[j] = "A";
    				else if(arr[5][j] < 80 && arr[5][j] >= 70)
    					g[j] = "B";
    				else if(arr[5][j] < 70 && arr[5][j] >= 60)
    					g[j] = "C";
    				else if(arr[5][j] < 60 && arr[5][j] >= 50)
    					g[j] = "D";
    				else if(arr[5][j] < 50)
    					g[j] = "F";
    			}
    		}
    		
    		String display="";
    		for (int i = 0; i < student; i++) {
			    display += (i+1)+". \t ["+arr[0][i]+"] /\t ["+arr[1][i]+"] /\t [" +arr[2][i]+"] /\t ["+arr[3][i]+"] /\t ["+arr[4][i]+"] /\t ["+arr[5][i]+"] /\t ["+g[i]+"]\n";
			}
			JOptionPane.showMessageDialog(null,"No. /\t [Midterm] /\t [Final] /\t [Homework] /\t [Assignment] /\t [Affective Domain] /\t [Total] /\t [Grade] \n "+display);
    	}
    	else if(section == "4"){	
    		int[][] arr = new int[5][student];
    		String[] g = new String[student];
    		int mid = 30, fn = 30, hw = 20 , ass = 20;
    		int total =0;
    		for (int i=0;i<4 ;i++ ) { 
    			for(int j=0;j<student;j++){
    				if(i==0)
    					arr[i][j] = random(mid);
    				else if(i==1)
    					arr[i][j] = random(fn);
    				else if(i==2)
    					arr[i][j] = random(hw);
    				else if(i==3)
    					arr[i][j] = random(ass);
    				arr[4][j] += arr[i][j];
    				if(arr[4][j] > 80)
    					g[j] = "A";
    				else if(arr[4][j] < 80 && arr[4][j] >= 70)
    					g[j] = "B";
    				else if(arr[4][j] < 70 && arr[4][j] >= 60)
    					g[j] = "C";
    				else if(arr[4][j] < 60 && arr[4][j] >= 50)
    					g[j] = "D";
    				else if(arr[4][j] < 50)
    					g[j] = "F";
    			}
    		}
    		
    		String display="";
    		for (int i = 0; i < student; i++) {
			    display += (i+1)+". \t ["+arr[0][i]+"] /\t ["+arr[1][i]+"] /\t [" +arr[2][i]+"] /\t ["+arr[3][i]+"] /\t ["+arr[4][i]+"] /\t ["+g[i]+"]\n";
			}
			JOptionPane.showMessageDialog(null,"No. /\t [Midterm] /\t [Final] /\t [Homework] /\t [Assignment] /\t [Total] /\t [Grade] \n "+display);
    	}
    	else if(section == "5"){
    		int[][] arr = new int[7][student];
    		String[] g = new String[student];
    		int mid = 30, fn = 30, hw = 10 , ass = 15 , aff = 5 ,test = 10;
    		int total =0;
    		for (int i=0;i<6 ;i++ ) { 
    			for(int j=0;j<student;j++){
    				if(i==0)
    					arr[i][j] = random(mid);
    				else if(i==1)
    					arr[i][j] = random(fn);
    				else if(i==2)
    					arr[i][j] = random(hw);
    				else if(i==3)
    					arr[i][j] = random(ass);
    				else if(i==4)
    					arr[i][j] = random(aff);
    				else if(i==5)
    					arr[i][j] = random(test);
    				arr[6][j] += arr[i][j];
    				if(arr[6][j] > 80)
    					g[j] = "A";
    				else if(arr[6][j] < 80 && arr[6][j] >= 70)
    					g[j] = "B";
    				else if(arr[6][j] < 70 && arr[6][j] >= 60)
    					g[j] = "C";
    				else if(arr[6][j] < 60 && arr[6][j] >= 50)
    					g[j] = "D";
    				else if(arr[6][j] < 50)
    					g[j] = "F";
    			}
    		}
    		
    		String display="";
    		for (int i = 0; i < student; i++) {
			    display += (i+1)+". \t ["+arr[0][i]+"] /\t ["+arr[1][i]+"] /\t [" +arr[2][i]+"] /\t ["+arr[3][i]+"] /\t ["+arr[4][i]+"] /\t ["+arr[5][i]+"] /\t ["+arr[6][i]+"] /\t ["+g[i]+"]\n";
			}
			JOptionPane.showMessageDialog(null,"No. /\t [Midterm] /\t [Final] /\t [Homework] /\t [Assignment] /\t [Affective Domain] /\t [Test] /\t [Total] /\t [Grade] \n "+display);
    	}
	}

	public static int random(int number){
		Random rand = new Random();
		int  n = rand.nextInt(number+1) + 0;
		return n;
	}
}
