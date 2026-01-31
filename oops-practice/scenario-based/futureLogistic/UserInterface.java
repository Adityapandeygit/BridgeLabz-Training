package oops_practice.scanrio_based.futureLogistic;

import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utility u = new Utility();
		System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();
        
        GoodsTransport goodsTransport = u.parseDetails(input);
        
        if (goodsTransport == null) {
            System.out.println("Invalid transport details");
            return;
        }
        String objectType = u.findObjectType(goodsTransport);
        if (objectType.equals("TimberTransport")) {
            TimberTransport timber = (TimberTransport) goodsTransport;
            System.out.println("Transporter id : " + timber.gettransportId());
            System.out.println("Date of transport : " + timber.gettransportDate());
            System.out.println("Rating of the transport : " + timber.gettransportRating());
            System.out.println("Type of the timber : " + timber.gettimberType());
            System.out.println("Timber price per kilo : " + timber.gettimberPrice());
            System.out.println("Vehicle for transport : " + timber.vehicleSelection());
            System.out.println("Total charge : " + timber.calculateTotalCharge());

        } else if (objectType.equals("BrickTransport")) {

            BrickTransport brick = (BrickTransport) goodsTransport;

            System.out.println("Transporter id : " + brick.gettransportId());
            System.out.println("Date of transport : " + brick.gettransportDate());
            System.out.println("Rating of the transport : " + brick.gettransportRating());
            System.out.println("Brick size : " + brick.getbrickPrice());
            System.out.println("Brick quantity : " + brick.getbrickQuantity());
            System.out.println("Vehicle for transport : " + brick.vehicleSelection());
            System.out.println("Total charge : " + brick.calculateTotalCharge());
        }
	}
}
