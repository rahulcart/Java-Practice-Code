//Calculate the total amount to be paid based on the costPerTicket and noOfSeats by applying a 2% tax on the total amount.
//The costPerTicket for the movies are provided in the below table. Set the value of costPerTicket instance variable appropriately.
//Note: Return the total amount calculated after rounding off using the Math.round(double a) method.

class MovieTicket {
    //Implement your code here
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats=noOfSeats;
    }
    public double getCostPerTicket(){
        return costPerTicket;
    }
    public void setCostPerTicket(double costPerTicket){
        this.costPerTicket=costPerTicket;
    }
    public MovieTicket(int movieId,int noOfSeats){
        this.movieId=movieId;
        this.noOfSeats=noOfSeats;

    }
    public double calculateTotalAmount(){
        if(movieId==111){
            costPerTicket=7;
        } else if (movieId==112) {
            costPerTicket=8;
        } else if (movieId==113) {
            costPerTicket=8.5;
        }else {costPerTicket=0;}

        double amount=noOfSeats*costPerTicket;
        double amount2=amount +(amount*2/100.0);
        double totalAmount=Math.round(amount2);
        return totalAmount;
    }

}


class Tester{
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(111, 4);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}