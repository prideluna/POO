package ShippingServices;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        WarehouseWorker someWarehouse = new WarehouseWorker(); // less flexible
        ShippingService warehouse = new WarehouseWorker(); // more flexible

        System.out.println(warehouse.calculateDeliveryTime()); // 3
        System.out.println(warehouse.generateShippingLabel()); // Warehouse standard stamp
        // Interface static method. No need of concrete instances.
        System.out.println(ShippingService.generateShipmentLog()); // [29-01-2024] Product has been shipped.

        //ShippingServices.WarehouseWorker someWarehouse = new ShippingServices.WarehouseWorker(); // NOT POLYMORPHIC
        //ShippingServices.ShippingService warehouse = new ShippingServices.WarehouseWorker(); // POLYMORPHIC ASSIGNMENT
        ShippingService delivery = new DeliveryDriver(); // more flexible because future changes will not affect the code below
        ShippingService[] shippingChain = {someWarehouse, warehouse, delivery}; // POLYMORPHIC ASSIGNMENT
        int totalDeliveryTime = 0;
        for (ShippingService service : shippingChain) {
            final int deliveryTime = service.calculateDeliveryTime(); // POLYMORPHIC – the behavior 'varies' depending on the instance type.
            System.out.println("Delivery time of "+service.getClass().getSimpleName()+" = "+deliveryTime+" days.");
            totalDeliveryTime += deliveryTime;
        }
        System.out.println("Total delivery time = " + totalDeliveryTime);

        for (ShippingService service : shippingChain) {
            System.out.println("service.generateShippingLabel() = " + service.generateShippingLabel()); // ShippingServices.ShippingService method
            // The method confirmationCode belongs to the ShippingServices.DeliveryDriver class, so a cast is necessary
            if(service instanceof DeliveryDriver deliveryElement) {
                final boolean isDelivered = deliveryElement.confirmationCode("43");
                System.out.println("isDelivered = " + isDelivered);
            }
        }
        }
}