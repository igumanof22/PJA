package Tugas_pja160919;

public class Hari {
    public static void main(String[] args) {
        int y=0;
        int z=0;
        String days[] = {"Moday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        for(int x = 0; x<7; x++){
            System.out.println(days[x]);
        }
        
        do{
            System.out.println(days[y]);
            y++;
        }while(y<7);
        
        while (z < 7) {            
            System.out.println(days[z]);
            z++;
        }
    }
    
}
