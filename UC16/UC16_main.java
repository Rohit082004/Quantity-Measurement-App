package org.UC16;

import org.UC16.Controller.QuantityMeasurementController;
import org.UC16.Repository.QuantityMeasurementDatabaseRepository;
import org.UC16.Service.QuantityMeasurementServiceImpl;

public class UC16_main {
    public static void main(String[] args) {
        QuantityMeasurementDatabaseRepository repo =
                new QuantityMeasurementDatabaseRepository();

        QuantityMeasurementServiceImpl service =
                new QuantityMeasurementServiceImpl(repo);

        QuantityMeasurementController controller =
                new QuantityMeasurementController(service);

        controller.run();
    }
}