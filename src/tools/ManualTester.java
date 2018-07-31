/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.CountryController;
import controllers.RegionController;
import controllers.CountryController;
import daos.CountryDAO;
import entities.Country;
import entities.Region;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Ignatius
 */
public class ManualTester {

    public static void main(String[] args) {
       Connection connection = new MyConnection().getConnection();
//        String countryId = "KS";
//        String countryName = "Korea Selatan";
//        int regionId = 3;
        String countryId = "TT";
        String countryName = "Timor Timur";
        int regionId = 3;
        Region region=new Region(regionId, countryName);
//        RegionController regionController = new RegionController(connection);
        CountryController countryController = new CountryController(connection);
//       System.out.println(countryController.save(countryId, countryName, region.toString()));
//          System.out.println(countryController.edit());
//        System.out.println(countryController.drop(countryId));
//        for (Country country : countryController.binding()) {
//            System.out.println(country.getCountryId()+" - "+country.getCountryName()+" - "+region.getRegionId);
//        }
//        System.out.println("pakai sort");
//        regionController.binding("region_id", "desc").forEach((region) -> {
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        });
//        regionController.find("region_name", "a").forEach((region)->{
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        });
//        System.out.println(countryController.findBy("ML"));

//        System.out.println((char)48);
//        System.out.println((char)57);
//        List<Object[]> datas = new CountryController(connection).binding();
//        for (Object[] data : datas) {
//            for (Object object : data) {
//                System.out.print(object+" ");
//            }
//            System.out.println("");
//        }
       
        System.out.println(new CountryDAO(connection).search("region_name", "a").size() );
    }
}
