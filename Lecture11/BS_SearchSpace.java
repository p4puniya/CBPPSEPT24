package Lecture11;
public class BS_SearchSpace {
    static boolean check(int speed, int dist, int time){
        int dist_travelled= speed*time;
        return (dist_travelled>= dist);
    }

    static int reachCenter(int time, int dist){
        int low= 0, high= 200;
        int ans=-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(check(mid, dist, time)){
                ans=mid;
                high= mid-1;
            }else
                low= mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reachCenter(6, 421));
    }
}


//1. Aggresive Cows: 
//2. Painter's Patition
//3. Magnetic Balls: 1552
//4. Koko Eating Bananas: 857
//5. Read Books/Book Allocation
