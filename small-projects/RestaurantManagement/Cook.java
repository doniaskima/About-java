public class Cook {
    private static int order;
    

    static void setOption() {
        if (order == 1) {
            System.out.println("Please wait your pizza is being prepared");
        }
        else if (order == 2) {
            System.out.println("Please wait your Sandwich is being prepared")
        }
        else{
            System.out.println("Please wait your Burger is being prepared");
        }

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Enter A to accept you Food");
    }
}
