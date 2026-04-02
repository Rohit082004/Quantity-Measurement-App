package org.example;

import org.example.Controller.QuantityMeasurementController;
import org.example.Repository.QuantityMeasurementCacheRepository;
import org.example.Service.QuantityMeasurementServiceImpl;

public class UC15 {
    public static void main(String[] args) {

        var repo = QuantityMeasurementCacheRepository.getInstance();
        var service = new QuantityMeasurementServiceImpl(repo);
        var controller = new QuantityMeasurementController(service);

        controller.performOperations();
    }
}