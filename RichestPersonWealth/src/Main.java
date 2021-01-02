public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] accounts = {{1,2,3343,6436},{2,3,4},{4,5,6}};
        int maximum_wealth = maximumWealth(accounts);
        System.out.println(maximum_wealth);

    }

    public static int maximumWealth(int[][] account){

        int max_wealth = 0;
        int wealth = 0;;

        for(int i = 0; i < account.length; i++){
            wealth = 0;
            for(int j = 0; j < account[i].length; j++){
                wealth += account[i][j];
            }
            if(wealth > max_wealth) max_wealth = wealth;
        }
                 return max_wealth;



    }
}
